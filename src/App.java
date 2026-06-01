import controlador.Benchmarking;
import controlador.GeneradorPersonas;
import controlador.SortPersonaMethods;
import modelo.Persona;
import vista.Resultado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
          int[] tamanios = {
                10000,
                50000,
                100000
        };

        SortPersonaMethods sorter =
                new SortPersonaMethods();

        for (int size : tamanios) {

            Persona[] base =
                    GeneradorPersonas.generarPersonas(size);

            Persona[] copiaInsercion =
                    base.clone();

            Persona[] copiaQuick =
                    base.clone();

            Resultado r1 =
                    Benchmarking.medir(
                            () -> sorter.insertionSort(copiaInsercion),
                            "Insertion Sort",
                            size,
                            "Aleatorio"
                    );

            Resultado r2 =
                    Benchmarking.medir(
                            () -> sorter.quickSort(
                                    copiaQuick,
                                    0,
                                    copiaQuick.length - 1
                            ),
                            "Quick Sort",
                            size,
                            "Aleatorio"
                    );

            System.out.println(r1);
            System.out.println(r2);
            System.out.println();
        }
    }
    }

