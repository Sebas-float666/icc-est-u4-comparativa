# Benchmarking de Algoritmos de Ordenamiento

## Integrante
Sebastian Alvarez

---

# Objetivo

Comparar el rendimiento de los algoritmos Insertion Sort y Quick Sort utilizando arreglos de objetos Persona de distintos tamaños, midiendo sus tiempos de ejecución mediante técnicas de benchmarking.

---

# Descripción del Proyecto

El proyecto genera arreglos de objetos Persona con datos aleatorios y posteriormente aplica dos algoritmos de ordenamiento:

- Insertion Sort
- Quick Sort

Los tiempos de ejecución se miden utilizando `System.nanoTime()` y se almacenan en objetos de tipo Resultado para su posterior análisis.

---

# Estructura del Programa

## Clase Persona

Representa una persona mediante los atributos:

- Nombre
- Edad

Para ordenar los objetos se utiliza un criterio de ordenamiento que combina la edad y el valor ASCII de los caracteres del nombre.

### Método principal

```java
getCriterioOrdenamiento()
```

Este método devuelve un valor numérico utilizado para comparar las personas durante el proceso de ordenamiento.

---

## Clase GeneradorPersonas

Se encarga de generar arreglos de personas con datos aleatorios.

### Método principal

```java
generarPersonas(int cantidad)
```

Recibe la cantidad de personas a crear y retorna un arreglo de objetos Persona.

---

## Clase SortPersonaMethods

Contiene la implementación de los algoritmos de ordenamiento.

### Insertion Sort

Ordena los elementos insertando cada uno en la posición correcta dentro de la parte ya ordenada del arreglo.

### Quick Sort

Ordena los elementos utilizando la técnica de dividir y conquistar mediante un pivote.

---

## Clase Benchmarking

Permite medir el tiempo de ejecución de cualquier algoritmo.

### Método principal

```java
medir(Runnable algoritmo, String nombreAlgoritmo, int sample, String escenario)
```

Calcula el tiempo de inicio y finalización utilizando `System.nanoTime()` y devuelve un objeto Resultado.

---

## Clase Resultado

Almacena la información obtenida durante cada medición:

- Nombre del algoritmo
- Escenario evaluado
- Tamaño de muestra
- Tiempo en nanosegundos
- Tiempo en milisegundos

---

# Escenario Implementado

## Escenario 1: Arreglo Desordenado

### Proceso

1. Generar un arreglo de personas aleatorias.
2. Crear una copia para Insertion Sort.
3. Crear una copia para Quick Sort.
4. Ejecutar ambos algoritmos.
5. Medir los tiempos de ejecución.
6. Comparar los resultados obtenidos.

### Tamaños de muestra utilizados

- 10.000 elementos
- 50.000 elementos
- 100.000 elementos

---

# Complejidad Teórica

| Algoritmo | Mejor Caso | Caso Promedio | Peor Caso |
|------------|------------|------------|------------|
| Insertion Sort | O(n) | O(n²) | O(n²) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) |

---

# Resultados Esperados

Se espera que Quick Sort presente mejores tiempos de ejecución en arreglos desordenados debido a su complejidad promedio O(n log n).

Por otro lado, Insertion Sort debería requerir más tiempo a medida que aumenta el tamaño del arreglo debido a su complejidad O(n²).

---

# Análisis

## ¿Qué algoritmo fue más rápido en el escenario desordenado?

Quick Sort fue el algoritmo más rápido. Esto se debe a que utiliza una estrategia de dividir y conquistar que reduce significativamente la cantidad de comparaciones necesarias para ordenar grandes cantidades de datos.

---

## ¿Qué algoritmo fue más rápido en el escenario casi ordenado?

Insertion Sort suele ser más rápido cuando el arreglo ya está ordenado o casi ordenado. En estos casos realiza muy pocos desplazamientos y su rendimiento se acerca a O(n).

---

## ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?

No. El aumento del tamaño de la muestra afectó mucho más a Insertion Sort debido a su complejidad cuadrática O(n²). Quick Sort también aumentó su tiempo de ejecución, pero de manera mucho más controlada gracias a su complejidad O(n log n).

---

## ¿Por qué Insertion Sort puede mejorar cuando el arreglo ya está casi ordenado?

Porque los elementos ya se encuentran cerca de su posición correcta y se requieren muy pocos intercambios o desplazamientos para completar el ordenamiento.

---

## ¿Por qué Quick Sort suele ser mejor cuando los datos están muy desordenados?

Porque divide el problema en partes más pequeñas mediante particiones. Esto permite ordenar grandes cantidades de elementos de forma eficiente manteniendo una complejidad promedio de O(n log n).

---

# Conclusiones

## Conclusión 1

Quick Sort presentó un mejor rendimiento en arreglos desordenados y de gran tamaño debido a su complejidad O(n log n).

## Conclusión 2

Insertion Sort resultó más eficiente cuando los datos estaban ordenados o casi ordenados, ya que necesita realizar pocos desplazamientos.

## Conclusión 3

El aumento del tamaño de la muestra incrementó el tiempo de ejecución de ambos algoritmos, aunque el impacto fue mucho mayor en Insertion Sort.

---

# Recomendaciones

- Ejecutar varias veces cada prueba y calcular un promedio de tiempos.
- Cerrar programas innecesarios antes de realizar las mediciones.
- Verificar que ambos algoritmos ordenen correctamente antes de medir.
- Utilizar tamaños de muestra grandes para observar diferencias más claras entre algoritmos.
- Realizar las pruebas en las mismas condiciones de hardware y software para obtener resultados más confiables.

---

# Nota Importante

Las tablas de resultados, observaciones y conclusiones finales deben ajustarse a los tiempos reales obtenidos durante la ejecución del programa. Los datos no deben ser inventados y deben reflejar el comportamiento observado durante la práctica.