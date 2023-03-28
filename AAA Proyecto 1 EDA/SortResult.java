public class SortResult {
    private long tiempo;
    private int comparaciones;
    private int intercambios;

    public SortResult(long tiempo, int comparaciones, int intercambios) {
        this.tiempo = tiempo;
        this.comparaciones = comparaciones;
        this.intercambios = intercambios;
    }

    public long getTiempo() {
        return tiempo;
    }

    public int getComparaciones() {
        return comparaciones;
    }

    public int getIntercambios() {
        return intercambios;
    }
}
