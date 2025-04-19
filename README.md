
<h1>Challenge 1 Conversor de monedas💸</h1>
<h2>Descripcion del proyecto📄</h2>
El Challenge es sobre un conversor de monedas desarrollado en Java y en el IDE IntelliJ IDEA, donde el usuario tendra 6 opciones de tipos de conversiones para realizar. Con el uso de una API llamada ExchangeRate, se puede manejar las tasas de cambio en tiempo real, ya que se manda un request a la API,
te responde con un JSON, se extrae los valore necesarios para la conversión y se muestran los resultados de una manera legible. Además, el software cuenta con un historial de las conversiones realizadas, la hora y fecha exacta de cada consulta.

<h2>Tecnologías Utilizadas💻</h2>

  - **API de tasa de cambio**: ExchangeRate-API
  
  - **API de tiempo de JAVA**: LocalDateTime y DateTimeFormatter
    
  - **Biblioteca Gson**: Gson se utilizó para facilitar la extracción de datos de la respuesta en JSON

  - **Postman API Platform**: Se utilizó para ver los valores y ver que devuelva bien los datos

<h2>Funcionalidades⚙️</h2>

  - El sistema detecta si la opción escogida por el usuario no es válida y vuelve a preguntar por una opcion que sí lo sea.
  
  - Verifica si el monto a convertir es admisible.

  - Se puede realizar diferentes conversiones sin tener que volver a correr el programa.

  - Se lleva un registro de las conversiones que se han realizado, al igual que la hora y fecha que se pidieron, esto se guarda en un archivo txt.

<h2>Opción adicional al Challenge⚡</h2>
Aparte de las funcionalidades que se pidio para este Challenge, yo quise poner a prueba mis conocimientos adquiridos y agregar una funcionalidad más que es la número 7, en donde el usuario puede ingresar cualquier moneda base y la moneda que quiera hacer la conversión, para que sea más flexible el conversor.
También se aplico el manejo de exceptions perzonalizadas que le indiquen al usuario cuando han escrito mal alguno de los códigos de una de las monedas. 

<h2>🔨Desarrollado por</h2>

  -  Alonso Higa Kohatsu
  
