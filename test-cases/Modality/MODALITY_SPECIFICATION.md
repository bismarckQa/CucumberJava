Especificación Funcional - Módulo Modalidad

Resumen:

El módulo Modalidad gestiona el tipo de tratamiento de diálisis asignado a un paciente en Versia Renal.
Permite visualizar, crear, editar y eliminar modalidades de tratamiento, así como gestionar el estado activo/inactivo del paciente.

Ambiente de Prueba: https://defrversia900/VersiaAutoTest/Login.aspx#/

Requerimientos:

El sistema debe permitir visualizar las modalidades de un paciente en modo lectura.
El sistema debe permitir crear, editar y eliminar modalidades de tratamiento.
El sistema debe validar que las fechas no se solapen entre modalidades del mismo paciente.
El sistema debe permitir cambiar el estado del paciente a inactivo/activo.
El sistema debe permitir cambio rápido de modalidad mediante sub-métodos.


Definición de Escenarios:

Feature: Ver Modalidad

Descripción: Ver datos de modalidad en modo lectura y verificar restricciones de creación.

Escenario: Ver pantalla de Modalidad
Dado que el usuario está logueado
Cuando selecciona un paciente
Y abre el módulo Modality
Entonces ve todos los datos del paciente en modo solo lectura
Y una grilla muestra las modalidades disponibles

Escenario: Paciente ya tiene una modalidad activa
Dado que el usuario está logueado
Y selecciona un paciente con modalidad activa
Y abre el módulo Modality
Cuando intenta crear una nueva modalidad
Entonces aparece advertencia: "Patient already has an active Modality"
Y el sistema no permite crear nueva modalidad


Feature: Agregar Modalidad

Descripción: Crear nuevas modalidades con validaciones de campos requeridos.

Escenario: Cancelar agregar modalidad
Dado que la pantalla de nueva modalidad está abierta
Y ha completado datos
Cuando hace clic en Cancelar
Entonces la modalidad no se guarda
Y vuelve a la lista

Escenario: Agregar modalidad exitosamente
Dado que la pantalla de nueva modalidad está abierta
Cuando completa todos los campos requeridos
Y hace clic en Guardar
Entonces la modalidad se guarda
Y aparece primero en la lista ordenada por fecha

Escenario: Agregar modalidad con campos requeridos vacíos
Dado que la pantalla de nueva modalidad está abierta
Cuando deja campos requeridos vacíos
Y hace clic en Guardar
Entonces aparece advertencia: "these fields are required"
Y la modalidad no se guarda


Feature: Editar Modalidad

Descripción: Modificar modalidades con validaciones complejas de fechas y solapamientos.

Escenario: Editar modalidad exitosamente
Dado que selecciona una modalidad existente
Y abre el editor
Cuando modifica los datos
Y hace clic en Guardar
Entonces la modalidad se actualiza correctamente

Escenario: Cancelar edición de modalidad
Dado que selecciona una modalidad existente
Y abre el editor
Cuando modifica datos
Y hace clic en Cancelar
Entonces la modalidad no se actualiza
Y los datos originales se mantienen

Escenario: Editar modalidad con campos requeridos vacíos
Dado que está editando una modalidad
Cuando deja campos requeridos vacíos
Y hace clic en Guardar
Entonces aparece advertencia: "these fields are required"
Y la modalidad no se guarda

Escenario: Modalidad cerrada - editar con fecha inicio anterior
Dado que edita una modalidad cerrada
Cuando cambia la fecha inicio a una anterior
Y hace clic en Guardar
Entonces aparece advertencia: "modality cannot be saved, overlap"
Y no se guarda

Escenario: Modalidad cerrada - editar con fecha inicio posterior
Dado que edita una modalidad cerrada
Cuando cambia la fecha inicio a posterior
Y hace clic en Guardar
Entonces aparece advertencia sobre fechas inválidas
Y no se guarda

Escenario: Modalidad cerrada - editar con fecha fin anterior
Dado que edita una modalidad cerrada
Cuando cambia la fecha fin a anterior a la fecha inicio
Y hace clic en Guardar
Entonces aparece advertencia: "end date must be later than start date"
Y no se guarda

Escenario: Modalidad abierta - editar con fecha inicio anterior
Dado que edita una modalidad abierta
Cuando cambia la fecha inicio a anterior
Y hace clic en Guardar
Entonces aparece advertencia: "modality cannot be saved, overlap"
Y no se guarda

Escenario: Modalidad abierta - editar con fecha inicio posterior
Dado que edita una modalidad abierta
Cuando cambia la fecha inicio a posterior a hoy
Y hace clic en Guardar
Entonces aparece advertencia: "start date cannot be later than current date"
Y no se guarda

Escenario: Modalidad abierta - editar con fecha fin anterior
Dado que edita una modalidad abierta
Cuando cambia la fecha fin a anterior a la fecha inicio
Y hace clic en Guardar
Entonces aparece advertencia: "end date must be later than start date"
Y no se guarda


Feature: Eliminar Modalidad

Descripción: Borrar modalidades con verificación de contraseña e integridad.

Escenario: Cancelar eliminación de modalidad
Dado que abre el diálogo de eliminación
Y ha ingresado contraseña y motivo
Cuando hace clic en Cancelar
Entonces la modalidad no se elimina
Y vuelve a la lista

Escenario: Eliminar modalidad exitosamente
Dado que selecciona una modalidad
Y abre el diálogo de eliminación
Cuando ingresa contraseña correcta
Y proporciona un motivo
Y hace clic en OK
Entonces la modalidad se elimina
Y desaparece de la lista

Escenario: No se puede eliminar sin contraseña correcta o sin motivo
Dado que abre el diálogo de eliminación
Cuando ingresa contraseña incorrecta o deja motivo vacío
Y hace clic en OK
Entonces aparece advertencia: "password incorrect and/or reason required"
Y la modalidad no se elimina

Escenario: No se puede eliminar la única modalidad
Dado que el paciente tiene una única modalidad
Y intenta eliminarla
Entonces aparece advertencia: "cannot delete only modality of patient"
Y no se permite la eliminación


Feature: Desactivar Paciente

Descripción: Cambiar estado del paciente a inactivo con validaciones.

Escenario: Cancelar cambio de paciente a inactivo
Dado que marca la casilla de paciente inactivo
Cuando aparece la advertencia de confirmación
Y hace clic en Cancelar
Entonces el paciente permanece activo
Y la casilla se desactiva

Escenario: Cambiar paciente a inactivo exitosamente
Dado que marca la casilla de paciente inactivo
Cuando aparece la advertencia de confirmación
Y hace clic en OK
Entonces el paciente se marca como inactivo
Y la casilla queda marcada

Escenario: No se puede desactivar si la modalidad está abierta
Dado que el paciente tiene una modalidad abierta
Cuando intenta marcar paciente como inactivo
Y hace clic en OK
Entonces aparece advertencia: "must end active modality before deactivate"
Y el paciente permanece activo


Feature: Activar Paciente

Descripción: Reactivar un paciente que fue desactivado.

Escenario: Activar paciente exitosamente
Dado que el paciente está inactivo
Y desmarca la casilla de inactivo
Cuando aparece la advertencia de confirmación
Y hace clic en OK
Entonces el paciente se reactiva
Y la casilla se desactiva

Escenario: Cancelar activación de paciente
Dado que el paciente está inactivo
Y desmarca la casilla de inactivo
Cuando aparece la advertencia de confirmación
Y hace clic en Cancelar
Entonces el paciente permanece inactivo
Y la casilla queda marcada


Feature: Cambio Rápido de Modalidad

Descripción: Cambiar modalidad mediante sub-métodos (quick link).

Escenario: Agregar modalidad usando quick link
Dado que el paciente tiene una modalidad activa
Cuando hace clic en el botón Submethod
Y selecciona una opción de cambio (ej: "Change to HD Center")
Entonces se agrega una nueva modalidad con fecha de hoy

Escenario: Cambio de modalidad exitoso
Dado que abre el menú de Submethod
Cuando selecciona una opción de cambio de modalidad
Entonces se agrega la nueva modalidad en modo lectura
Y tiene como fecha inicio la fecha actual

Escenario: Cancelar cambio de modalidad
Dado que abre el diálogo de cambio de modalidad
Cuando hace clic en Cerrar/Cancelar
Entonces el cambio no se aplica
Y vuelve a la lista sin modificaciones


Definition of Done por Feature

Feature: Ver Modalidad
Visualizar modalidades y validar restricción de crear nueva si ya existe activa.

Feature: Agregar Modalidad
Crear nuevas modalidades con validación de campos requeridos y persistencia.

Feature: Editar Modalidad
Editar modalidades con validaciones de fechas, solapamientos y campos requeridos.

Feature: Eliminar Modalidad
Eliminar modalidades con verificación de contraseña, motivo e integridad.

Feature: Desactivar Paciente
Cambiar estado del paciente a inactivo con validación de modalidades abiertas.

Feature: Activar Paciente
Reactivar paciente inactivo con confirmación.

Feature: Cambio Rápido de Modalidad
Cambiar modalidad mediante sub-métodos.


