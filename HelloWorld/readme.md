# Proyecto HolaMundo.

###### Proyecto Acabado 23/09/2021.

###### Ignacio Moya González.

***Primera aplicación creada en Android Studio.***

***Contiene un mensaje de texto (TextView) y un botón (Button).***

##### *Realizado con API 31 y minimunSDK 23.*



## Contenido:

- Instalación del Android Studio 2020.3.1.

- ¿Qué es el SDK?.

- Instalación y configuración del emulador (AVD).

- Control de APIs (compileSDKversion, minimunSDK, targetSDKversion, librerías de recursos).

- Configuración de un dispositivo físico como depurador.

- Contrucción de una pequeña interfaz gráfica (layout) y sus atributos.

- Uso del "@" como redirección de la clase R en XML.

  ```xml
  android:text="@string/tvMessage"
  ```

- Instanciar variables y darle memoria en un Activity a través del método estático findViewById().

- Modificar valores en tiempo de ejecución (no recomendable).

  ```java
  /**
   * 3. Modificar el texto en tiempo de ejecución, no es recomendable.
   * Lo recomendable es modificar el texto en el layout.
   */
  tvMessage.setText(R.string.msgCaracola);
  ```

- Recoger recursos en una Activity con getResources().

- Contexto de Application y Activity.

- Internacionalización de los valores de nuestra app.

- Uso de git en nuestro proyecto.

  

## Aprendizaje:

##### *En este apartado incluye lo que hemos aprendido en este proyecto.*

1. Dominio del entorno de trabajo Android Studio.

2. Conectarse y controlar la consola del dispositivo o emulador (ADB).

3. Configuración del paquete de nuestra aplicación (com.nachomg.helloworld).

4. Construir y analizar apk de nuestra aplicación.

5. Internacionalizar el contenido desarrollado para distintos idiomas.

6. La superclase R y todas sus subclases (id, strings, themes, dimens, errors, arrays).

7. Uso del material desing para la temática de nuestra aplicación.

8. Recoger los valores de los recursos desde una Activity a través del método getResources().

9. Diferencia entre el contexto de Application y Activity, a raiz de la clase ContextCompat (recoger el contexto del Activity indicado con this).

   ```java
   /**
   * Resulta que para coger el color lo tenemos que coger del contexto de la Activity
   * y no de Application, por eso utilizamos la clase ContextCompat, siendo this el
   * contexto * actual en el que estamos trabajando (MainActivity).
   */
   btChangeMessage.setBackgroundColor(ContextCompat.getColor(this,R.color.teal_200));
   ```

10. Búsqueda y entender un problema que nos da el entorno mediante LogCat.



## Links:

[(https://developer.android.com/)](https://developer.android.com/)

[(https://material.io/resources/color/#!/?view.left=0&view.right=0)](https://material.io/resources/color/#!/?view.left=0&view.right=0)

[(https://gist.github.com/dasdo/9ff71c5c0efa037441b6)](https://gist.github.com/dasdo/9ff71c5c0efa037441b6)

