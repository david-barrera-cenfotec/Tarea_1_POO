package ac.cr.ucenfotec.tarea1.entidades;

public class Reservacion {

    private String fechaEntrada;
    private String fechaSalida;
    private String mascota;

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public Reservacion(String fechaEntrada, String fechaSalida, String mascota) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.mascota = mascota;
    }

    public Reservacion() {
    }

    @Override
    public String
    toString() {
        return "Reservacion{" +
                "fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", mascota=" + mascota +
                '}';
    }
}
