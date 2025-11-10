1. Instalación del entorno

1.1 Instalar Java JDK 17

Descargar desde: https://adoptium.net/es/temurin/releases?version=17

Instalar con las opciones por defecto.

Verificar instalación desde el cmd: java -version

1.2 Instalar Maven

Descargar desde (Binary zip archive): https://maven.apache.org/download.cgi

Extraer el ZIP en la carpeta C:\

Correcta configuración: https://www.youtube.com/watch?v=rl5-yyrmp-0

Validar correcta instalación: mvn -version

1.3 Instalar PostgreSQL 18

Descargar instalador desde: https://www.postgresql.org/download/windows/

Durante la instalación:

  Usuario: postgres

  Puerto: 5432

  Crear una contraseña segura que recuerdes

1.4 Restaurar la base de datos desde el backup

Descargar el archivo sophyfarm.backup del enlace: https://unbosqueeduco-my.sharepoint.com/:u:/g/personal/falvaradoa_unbosque_edu_co/EcCvZGtbhKRCtAWpdnQQOXgBS0ILdkg39Sj87n9nIBZaFQ?e=8fkdsZ

Abre pgAdmin 4 y conéctate al servidor (localhost).
En el panel izquierdo haz clic derecho sobre Databases → Create → Database…

Name: sophyfarm
Owner: postgres 
Click Save.

Clic derecho sobre la base recién creada sophyfarm → Restore
En la ventana Restore:

Filename: busca y selecciona el archivo descargado de sophyfarm.backup

Format: selecciona Custom

Haz click en Restore y observa el panel de mensajes; al finalizar debe indicar que se completó sin errores.

1.5 Instalar extensiones de Visual Studio Code

Java (De Oracle)
Extension Pack for Java (de Microsoft)
Spring Boot Extension Pack	(de VMware)
Maven for Java	(de Microsoft)
REST Client	(de Huachao Mao)
PostgreSQL (de Chris Kolkman) 

2. Crear el proyecto Spring Boot

2.1 Crear proyecto en Spring Initializr

En VS Code, abre una carpeta vacía llamada sophyfarm-api
Abre la paleta de comandos (Ctrl+Shift+P)

Busca: Spring Initializr: Create Maven Project

Selecciona:

Spring Boot version: 3.3.x

Group Id: co.edu.unbosque

Artifact Id: sophyfarm

Name: SophyFarm

Dependencies:

Spring Web

Spring Data JPA

PostgreSQL Driver

Springdoc OpenAPI UI

Esto generará un proyecto Maven con toda la estructura base.

3. Configurar aplicación
Modificar src/main/resources/application.properties para que coincida con tus datos de PostgreSQL






