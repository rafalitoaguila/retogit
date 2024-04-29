public class Pelicula {

    private String titulo;
    private int duracion;
    private boolean aptaMenores;

    public Pelicula(String titulo, int duracion, boolean aptaMenores) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.aptaMenores = aptaMenores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isAptaMenores() {
        return aptaMenores;
    }

    public void setAptaMenores(boolean aptaMenores) {
        this.aptaMenores = aptaMenores;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", aptaMenores=" + aptaMenores +
                '}';
    }

    public String consultar(String dato){
        return "";
    }

    public void mostrar(){

    }
}
