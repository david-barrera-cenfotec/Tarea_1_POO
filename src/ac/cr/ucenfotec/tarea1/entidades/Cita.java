package ac.cr.ucenfotec.tarea1.entidades;

public class Cita {
    private String mascota;
    private String fechaDeCita;
    private String horaDeCita;
    private String observaciones;


    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
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

    public Cita(String mascota, String fechaDeCita, String horaDeCita, String observaciones) {
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
                "mascota=" + mascota +
                ", fechaDeCita='" + fechaDeCita + '\'' +
                ", horaDeCita='" + horaDeCita + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }


}
