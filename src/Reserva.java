//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    String id;
    Asistente asistente;
    Evento evento;
    Butaca butaca;
    LocalDate fecha;
    LocalTime hora;

    public Reserva(String id, Asistente asistente, Evento evento, Butaca butaca, LocalDate fecha, LocalTime hora) {
        this.id = id;
        this.asistente = asistente;
        this.evento = evento;
        this.butaca = butaca;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Asistente getAsistente() {
        return this.asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public Evento getEvento() {
        return this.evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Butaca getButaca() {
        return this.butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return this.hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void mostrarReserva() {
        System.out.println("Id: " + this.id);
        System.out.println("Nombre de evento: " + this.evento.getNombre());
        System.out.println("Posicion Butaca: " + this.butaca.getPos());
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);
    }
}