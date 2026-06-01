package controlador;

import modelo.Persona;
public class SortPersonaMethods {

    public void insertionSort(Persona[] personas) {

        for (int i = 1; i < personas.length; i++) {

            Persona actual = personas[i];

            int j = i - 1;

            while (j >= 0 &&
                    personas[j].getCriterioOrdenamiento()
                    > actual.getCriterioOrdenamiento()) {

                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = actual;
        }
    }

    public void quickSort(Persona[] personas,
                          int inicio,
                          int fin) {

        if (inicio < fin) {

            int pivote = particion(personas, inicio, fin);

            quickSort(personas, inicio, pivote - 1);
            quickSort(personas, pivote + 1, fin);
        }
    }

    private int particion(Persona[] personas,
                          int inicio,
                          int fin) {

        int pivote =
                personas[fin].getCriterioOrdenamiento();

        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {

            if (personas[j].getCriterioOrdenamiento()
                    <= pivote) {

                i++;

                Persona temp = personas[i];
                personas[i] = personas[j];
                personas[j] = temp;
            }
        }

        Persona temp = personas[i + 1];
        personas[i + 1] = personas[fin];
        personas[fin] = temp;

        return i + 1;
    }
}