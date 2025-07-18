@all
Feature: Diligenciar Formato Cotizador

@Formulario ##caso 7
Scenario: Diligenciar el formato del cotizador paso 1 de 4 con cedula de ciudadania.
Given "User" inicia sesion correctamente
When Se encuentre en el formato del cotizador paso 1 de 4
And Diligencie todos los campos seleccionando el tipo de ID: Cedula de ciudadania.
And Al final de click en cargar informaciòn
Then Da click en continuar para pasar al paso 2 de 4 del formato cotizador.

@Formulario  ##caso 8
Scenario: Diligenciar el formato cotizador del paso 2 de 4 con cedula de ciudadania.
Given Que en el paso 1 de 4 se dio click en continuar para pasar al paso 2 del formato cotizador
When Se encuentre en el formato cotizador del paso 2 de 4
And Diligencie todos los campos correctamente.
Then Da click en continuar y ve el mensaje de Finalizado.

@Formulario ##caso 9
Scenario: Mensaje Finalizado.
Given Que en el paso 2 de 4 se dio click en continuar
When Se encuentre el mensaje de finalizado
Then Da click en continuar para pasar al paso 3 de 4 del formato cotizador.

@Formulario ##caso 10
Scenario: Cotizador Paso 3 de 4
Given Que en el mensaje de finalizado dio click en continuar
When Se encuentre en el formato cotizador del paso 3 de 4
And Seleccione la opcion Cotizacion 1
Then Da click en guardar y continuar para pasar al mensaje solicitar aprobacion.

@Formulario ##caso 11
Scenario: Solicitar Aprobacion
Given Que en el paso 3 de 4 dio click en guardar y continuar
When Se encuentre en el mensaje solicitar aprobacion
And Diligencie un comentario
Then Da click en guardar y continuar para pasar al formato DCC FOR 130.

@Formulario  ##caso 12
Scenario: Diligenciar Formato DCC FOR 130 Paso 1 de 2
Given Que en el mensaje solicitar aprobacion se dio click en guardar y continuar
When estemos en el paso 1 de 2 del formato DCC FOR 130
And Diligenciemos los campos requeridos
Then Da click en siguiente para pasar al paso 2 de 2 del formato DCC FOR 130

@Formulario  ##caso 13
Scenario: Diligenciar Formato DCC FOR 130 Paso 2 de 2       
Given Se dio click en siguiente para pasar al paso 2 de 2 del formato DCC FOR 130
When estemos en el paso 2 de 2 del formato DCC FOR 130
And Diligenciemos los campos requeridos
Then Da click en siguiente para pasar al mensaje solicitud de cotizacion exitosa

@Formulario  ##caso 14
Scenario: Solicitud de Cotizacion Exitosa
Given Se dio click en siguiente para pasar al mensaje solicitud de cotizacion exitosa
When estemos en este recuadro donde se ven los correos a los que se enviara la solicitud
Then Da click en siguiente para pasar al mensaje solicitud enviada.