package controlador;

import vista.Resultado;

public class Benchmarking {
    public static Resultado medir(Runnable algoritmo,String nombreAlgoritmo, int sample, String escenario){
        long inicio= System.nanoTime();
        algoritmo.run();
        long fin= System.nanoTime();
        double tiempoNano= fin - inicio;
        double tiempoMillis= tiempoNano/1_000_000.0;

        return new Resultado(nombreAlgoritmo,escenario,sample,tiempoNano,tiempoMillis);
    }
}
