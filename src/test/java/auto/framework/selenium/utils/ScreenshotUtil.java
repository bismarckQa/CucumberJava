package auto.framework.selenium.utils;

import auto.framework.selenium.annotations.LazyComponent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.util.FileCopyUtils;

@LazyComponent
public class ScreenshotUtil {
    @Autowired
    private ApplicationContext ctx;

    @Value("${screenshot.path}")
    private Path path;

    public void takeScreenShot(String testName) throws IOException {
        File sourceFile = this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String formatNow = now.format(formatter);
        FileCopyUtils.copy(sourceFile, this.path.resolve( testName +"-"+ formatNow + ".png").toFile());
    }

    public byte[] getScreenshot(){
        return this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.BYTES);
    }

}
