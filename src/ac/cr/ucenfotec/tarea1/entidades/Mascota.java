package ac.cr.ucenfotec.tarea1.entidades;

public class Mascota {

        private String nombre;
        private String observaciones;
        private int ranking;
        private String foto;
        private Duenio duenio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public Mascota(String nombre, String observaciones, int ranking, String foto, Duenio duenio) {
        this.nombre = nombre;
        this.observaciones = observaciones;
        this.ranking = ranking;
        this.foto = foto;
        this.duenio = duenio;
    }

    public Mascota() {
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", ranking='" + ranking + " estrellas" + '\'' +
                ", foto='" + foto + '\'' +
                ", duenio=" + duenio +
                '}';
    }
}
