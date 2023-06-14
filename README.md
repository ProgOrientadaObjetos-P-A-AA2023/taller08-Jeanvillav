## Taller8

### Elaboración de ejercicios sobre Jerarquía de Herencia a través de Diagramas UML y Lenguaje de alto nivel

#### Problemática
* Generar una solución usando herencia para las siguiente entidades

  * Docente
    * nombres
    * cedula
  * DocenteNombramiento
    * valor sueldo
    * valor hora extra
    * numero horas extra
    * sueldo
  * DocenteFactura
      * valor factura
      * valor iva descuento
      * valor cancelar

#### Pasos


1. Crear un diagrama UML que involucre las clases en la carpeta **Diagrama**.

2. Usar el proyecto de Netbeans llamado **Talle08**

  2.1. Generar la clase Docente

  2.2. Generar la clase DocenteNombramiento

  2.3. Generar la clase DocenteFactura

  2.4. Generar la clase Ejecutor. En el método **main**, se debe permitir ingresar objetos de tipo DocenteNombramiento y DocenteFactura. Uno a la vez. Si el usuario ingresa 1, se debe crear un DocenteNombramiento por teclado; si ingresa 2, se debe crear un DocenteFactura. Los datos de entrada serán ingresados por teclado.

  Restricciones:
  * En el código solo debe usar por una sola ocasión la siguiente sentencias
  ```
  nombres = entrada.nextLine()
  cedula = entrada.nextLine()
  ```

  * Si el usuario ingresa algo diferente de 1 o 2; el programa debe presentar un mensaje que diga: "Error, opción no válida."
