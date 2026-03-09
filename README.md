# Conversor de Monedas Alura

### Descripción del Proyecto
Este proyecto es una aplicación de consola desarrollada en Java, diseñada para realizar conversiones de divisas en tiempo real. La herramienta permite al usuario interactuar a través de un menú dinámico, obteniendo tasas de cambio actualizadas gracias a la integración con una API externa.

El desarrollo se centra en la aplicación de conceptos fundamentales de la programación orientada a objetos, el manejo de solicitudes HTTP y la manipulación de datos en formato JSON.

---

### Tecnologías Utilizadas
* **Lenguaje**: Java 17
* **Librería**: Gson (procesamiento JSON)
* **API**: ExchangeRate-API
* **Entorno**: IntelliJ IDEA

---

### Guía de Configuración en IntelliJ IDEA

Para que el conversor funcione correctamente, se debe vincular la clave de la API de forma segura en el entorno de desarrollo. Sigue estos pasos:

1. **Acceder a la Configuración**: En la barra superior de IntelliJ IDEA, localiza el botón de ejecución (triángulo verde). A su izquierda, despliega el menú y selecciona **Edit Configurations...**.
2. **Variables de Entorno**: Busca la sección **Environment variables** y haz clic en el icono de la derecha.
3. **Declarar Clave**: Añade una nueva variable con el nombre `API_KEY_CONVERSOR` y en el valor pega tu clave personal de ExchangeRate-API.
4. **Aplicar**: Presiona **OK** en ambas ventanas para guardar los cambios.

#### Implementación en el Código
Asegúrate de que tu clase de conexión utilice el siguiente estándar para recuperar la clave:

```java
String apiKey = System.getenv("API_KEY_CONVERSOR");
String url = "[https://v6.exchangerate-api.com/v6/](https://v6.exchangerate-api.com/v6/)" + apiKey + "/latest/USD";
Código,Moneda,País / Región
USD,Dólar Estadounidense,Estados Unidos
ARS,Peso Argentino,Argentina
BRL,Real Brasileño,Brasil
COP,Peso Colombiano,Colombia
EUR,Euro,Unión Europea
MXN,Peso Mexicano,México
Estructura de la Solución

El código se organiza siguiendo las mejores prácticas de desarrollo para asegurar que sea escalable y fácil de leer:

Clase Principal: Gestiona el flujo de la aplicación y el menú de usuario.

Módulo de Conexión: Encargado de realizar las peticiones HTTP.

Módulo de Procesamiento: Transforma los datos de la API en objetos Java mediante Gson.

Lógica de Conversión: Realiza los cálculos basados en la tasa de cambio obtenida.

Créditos
Este desafío forma parte de la formación de Alura Latam.

Desarrollado por: Daniela Suárez Matamoros


