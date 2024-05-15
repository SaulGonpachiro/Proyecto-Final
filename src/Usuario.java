import java.io.Serializable;
import java.time.LocalDate;

public class Usuario  implements Serializable {
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String password;
    protected String telf;
    protected LocalDate fecha_nacimiento;

    public Usuario() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.telf = telf;
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
