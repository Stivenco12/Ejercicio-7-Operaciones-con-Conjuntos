# Operaciones con Conjuntos en Java

Este programa en Java permite al usuario ingresar pares de números y almacenarlos en dos conjuntos (`HashSet<Integer>`). Luego, combina ambos conjuntos y muestra la suma de cada número consigo mismo.

## Características

- Permite ingresar números en dos conjuntos diferentes.
- Utiliza `HashSet` para garantizar que no haya números duplicados.
- Une ambos conjuntos en un solo conjunto (`valor1.addAll(valor2)`).
- Muestra el resultado de la suma de cada número consigo mismo.
- Maneja excepciones para evitar errores en la entrada del usuario.

## Tecnologías utilizadas

- Java 8 o superior
- Librerías utilizadas: `java.util.HashSet`, `java.util.Scanner`

## Cómo ejecutar el programa

1. Compila el archivo con el siguiente comando:
   ```bash
   javac Main.java
   ```
2. Ejecuta el programa con:
   ```bash
   java ejercicio4.Main
   ```

## Explicación del código

1. Se utiliza un `Scanner` para capturar la entrada del usuario.
2. Se definen dos conjuntos (`HashSet<Integer> valor1` y `HashSet<Integer> valor2`).
3. Se ingresan dos números en cada iteración del bucle y se almacenan en los conjuntos.
4. Se combinan los conjuntos usando `valor1.addAll(valor2)`, lo que elimina duplicados.
5. Se itera sobre el conjunto `valor1` y se imprime la suma de cada número consigo mismo.

## Autor

Este código fue creado como un ejercicio de práctica en Java para trabajar con `HashSet` y la manipulación de datos en conjuntos.

jedier stivenson correa amariz
