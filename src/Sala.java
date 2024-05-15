//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class Sala {
    String nombre;
    int capacidad;
    ArrayList<Butaca> lista_butacas = new ArrayList();
    double espacio;
    boolean accesibilidad;
    String acustica;
    String observaciones;

    public Sala() {
    }

    public Sala(String nombre, int capacidad, ArrayList<Butaca> lista_butacas, double espacio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.lista_butacas = lista_butacas;
        this.espacio = espacio;
    }

    void mostrar_butacas() {
        System.out.println("Butacas disponibles en la sala " + this.nombre + ":");
        Iterator var1 = this.lista_butacas.iterator();

        while(var1.hasNext()) {
            Butaca b = (Butaca)var1.next();
            System.out.println("Posición: " + b.pos + " (ID: " + b.id + "), Estado: " + (b.disponible ? "Disponible" : "Ocupada"));
        }

    }
}