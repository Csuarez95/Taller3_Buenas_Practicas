# Taller3_Buenas_Practicas
## Se crea el repositorio para poner a prueba las buenas prácticas para el trabajo en equipo.
### La aplicación tiene como objetivo realizar la visualización, creación, aplicación de filtros y orden a una lista de canciones por medio de interacciones con el usuario.

### En estos archivos se tienen:
* Un paquete para las interfaces:
  > Una interface para la declaración los métodos correspondientes a el filtrado y orden de las canciones.
* Un paquete para las clases:
  1. Una abstracta con los atributos generales que deben tener las canciones (título, fecha, duración, género, caratula, descripción y un identificador con sus respectivos métodos get y set), un constructor y el método toString con la estructura para mostrar la información de una canción.
  2. Una clase para las canciones que extiende de la clase abstracta e implementa las interfaces con la implementación de cada uno de sus métodos y métodos para la creación de una canción, creación de una PlayList y eliminación de una canción de la lista de canciones.
  3. Una clase para la verificación de los datos ingresados por teclado por el usuario para que cumplan con ciertas condiciones en función del tipo de dato que se esté ingrsando (texto, fechas o numeros).

* Un paquete para la clase principal:
> Esta clase hace que a partir de la interacción con el usuario se puedan visualizar y crear listas de canciones; ademas de poder despues ordenar por duración o por fecha las canciones de la lista (en orden ascendente) y filtrar dicha lista por género o por año.

## Es posible ejecutar el código a traves de un IDE descargando el proyecto, extrayéndolo del archivo .ZIP, abriéndolo en el IDE y ejecutándolo.
