//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Butaca {
    String pos;
    int id;
    boolean accesibilidad;
    boolean disponible;

    public Butaca(String pos, int id, boolean accesibilidad, boolean disponible) {
        this.pos = pos;
        this.id = id;
        this.accesibilidad = accesibilidad;
        this.disponible = disponible;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPos() {
        return this.pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public boolean isAccesibilidad() {
        return this.accesibilidad;
    }

    public void setAccesibilidad(boolean accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}