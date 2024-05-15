import java.time.LocalDate;

public class Administrador extends Usuario{
    private int permisos;

    public Administrador(String nombre, String apellido, String email, String password, String telf, LocalDate fecha_nacimiento, int permisos) {
        super();
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "permisos=" + permisos +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", telf='" + telf + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                '}';
    }
}


