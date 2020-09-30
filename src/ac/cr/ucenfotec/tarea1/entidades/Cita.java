package ac.cr.ucenfotec.tarea1.entidades;

public class Cita {
    private Mascota mascota;
    private String fechaDeCita;
    private String horaDeCita;
    private String observaciones;


    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getFechaDeCita() {
        return fechaDeCita;
    }

    public void setFechaDeCita(String fechaDeCita) {
        this.fechaDeCita = fechaDeCita;
    }

    public String getHoraDeCita() {
        return horaDeCita;
    }

    public void setHoraDeCita(String horaDeCita) {
        this.horaDeCita = horaDeCita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cita(Mascota mascota, String fechaDeCita, String horaDeCita, String observaciones) {
        this.mascota = mascota;
        this.fechaDeCita = fechaDeCita;
        this.horaDeCita = horaDeCita;
        this.observaciones = observaciones;
    }

    public Cita() {
    }

    @Override
    public String toString() {
        return "Citas{" +
                "mascota=" + mascota.getNombre() +
                ", fechaDeCita='" + fechaDeCita + '\'' +
                ", horaDeCita='" + horaDeCita + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }


}
