//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;

public class Asistente {
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private String telefono;
    private String dni;
    private LocalDate fecha_nacimiento;
    private boolean esAdmin;

    public Asistente() {
    }

    public Asistente(String nombre, String apellidos, String email, String password, String telefono, String dni, LocalDate fecha_nacimiento, boolean esAdmin) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.esAdmin = esAdmin;
    }

    public Asistente(String nombre, String email, String password, boolean esAdmin) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.esAdmin = esAdmin;
    }

    public Asistente(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isEsAdmin() {
        return this.esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public String toString() {
        return "Asistente{\n  Nombre='" + this.nombre + "'\n  Apellidos='" + this.apellidos + "'\n  Email='" + this.email + "'\n  Password='" + this.password + "'\n  Teléfono='" + this.telefono + "'\n  DNI='" + this.dni + "'\n  Fecha de Nacimiento=" + this.fecha_nacimiento + "\n  esAdmin=" + this.esAdmin + "\n}";
    }

    public void infoBasica() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Email: " + this.email);
        System.out.println("DNI: " + this.dni);
    }
}

