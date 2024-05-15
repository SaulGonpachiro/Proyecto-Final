

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Gestor {
    private ArrayList<Asistente> listadoAsistentes = new ArrayList();
    private ArrayList<Evento> listadoEventos = new ArrayList();
    private Sala[] listadoSalas = new Sala[5];
    private ArrayList<Reserva> listadoReservas = new ArrayList();

    public Gestor() {
        this.infoInicial();
    }

    public void infoInicial() {
        int identificador = 0;

        for(int i = 0; i < 5; ++i) {
            ArrayList<Butaca> misbutacas = new ArrayList();

            for(char fila = 'A'; fila < 'E'; ++fila) {
                for(int columna = 1; columna < 5; ++columna) {
                    ++identificador;
                    String pos = "" + fila + columna;
                    misbutacas.add(new Butaca(pos, identificador, false, true));
                }
            }

            System.out.println(misbutacas);
            this.listadoSalas[i] = new Sala("Sala nº" + i, 25, misbutacas, 100.0);
        }

        this.listadoAsistentes.add(new Asistente("Saúl", "Martínez", "saul@gmail.com", "123", "98765432X", "212345678", LocalDate.of(1996, 6, 15), false));
        this.listadoAsistentes.add(new Asistente("Judith", "Martínez", "judith@gmail.com", "1234", "76543210Y", "667788990", LocalDate.of(1992, 8, 18), false));
        this.listadoAsistentes.add(new Asistente("admin", "admin", "admin@gmail.com", "12345", "54321098A", "601234567", LocalDate.of(1988, 2, 10), true));
        this.listadoAsistentes.add(new Asistente("Alba", "Carrion", "alba@gmail.com", "123456", "87654321B", "678901234", LocalDate.of(1998, 4, 29), false));
        this.listadoAsistentes.add(new Asistente("Pedro", "García", "pedro@gmail.com", "1234567", "76543219C", "789012345", LocalDate.of(1985, 8, 2), false));
        this.listadoAsistentes.add(new Asistente("Marcos", "Belmonte", "marcos@gmail.com", "12345678", "65432109D", "890123456", LocalDate.of(1996, 3, 1), false));
        this.listadoAsistentes.add(new Asistente("Carlos", "Alonso", "carlos@gmail.com", "123456789", "54321098E", "901234567", LocalDate.of(1992, 3, 18), false));
        this.listadoAsistentes.add(new Asistente("Adoración", "García", "dori@gmail.com", "987", "43210987F", "123456789", LocalDate.of(1975, 11, 30), false));
        this.listadoAsistentes.add(new Asistente("Ivan", "Belmonte", "ivan@gmail.com", "9876", "32109876G", "234567890", LocalDate.of(1996, 9, 3), false));
        this.listadoAsistentes.add(new Asistente("Nacho", "Andres", "nacho@gmail.com", "pass789secure", "21098765H", "345678901", LocalDate.of(1991, 6, 14), false));
        this.listadoEventos.add(new Evento("Concierto", "Artista1", this.listadoSalas[0], LocalDate.of(2024, 3, 15), LocalTime.of(7, 20), 25.0, "Musical", 24, new ArrayList()));
        this.listadoEventos.add(new Evento("Conferencia", "Orador2", this.listadoSalas[1], LocalDate.of(2024, 4, 20), LocalTime.of(17, 20), 15.0, "Educacional", 24, new ArrayList()));
        this.listadoEventos.add(new Evento("Fiesta", "DJ3", this.listadoSalas[2], LocalDate.of(2024, 5, 10), LocalTime.of(22, 20), 20.0, "Social", 24, new ArrayList()));
    }

    public Asistente login() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Introduzca su email:");
            String email = sc.nextLine();
            if (Validaciones.validarGmail(email)) {
                System.out.println("🎉🎉El gmail introducido es correcto🎉🎉\n");
                System.out.println("Introduzca su contraseña: ");
                String password = sc.nextLine();
                Validaciones.validarPassLog(password);
                Iterator var4 = this.listadoAsistentes.iterator();

                Asistente a;
                do {
                    if (!var4.hasNext()) {
                        System.err.println("Los datos introducidos son incorrectos❗❗❗");
                        return null;
                    }

                    a = (Asistente)var4.next();
                } while(!email.equals(a.getEmail()) || !password.equals(a.getPassword()));

                return a;
            }

            System.err.println("❗El gmail no es correcto, por favor, introdúzcalo de nuevo:");
        }
    }

    public Asistente signin() {
        Scanner sc = new Scanner(System.in);
        boolean esAdmin = false;
        boolean salir = false;

        do {
            while(true) {
                System.out.println("Introduzca su email:");
                String email = sc.nextLine();
                if (Validaciones.validarGmail(email)) {
                    System.out.println("🎉🎉El gmail introducido es correcto🎉🎉\n");
                    Iterator var11 = this.listadoAsistentes.iterator();

                    while(var11.hasNext()) {
                        Asistente a = (Asistente)var11.next();
                        if (email.equals(a.getEmail())) {
                            System.err.println("❗Correo electronico en uso, elija otro.");
                            salir = true;
                            break;
                        }
                    }

                    salir = false;
                    break;
                }

                System.err.println("❗El gmail no es correcto, por favor, introdúzcalo de nuevo:");
            }
        } while(false);

        while(true) {
            System.out.println("Introduzca su nombre: ");
            String nombre = sc.nextLine();
            if (Validaciones.validarNombre(nombre)) {
                System.out.println("🎉🎉El nombre introducido es correcto🎉🎉\n");

                while(true) {
                    System.out.println("Introduzca sus apellidos: ");
                    String apellidos = sc.nextLine();
                    if (Validaciones.validarApellido(apellidos)) {
                        System.out.println("🎉🎉Los apellidos introducido es correcto🎉🎉\n");
                        System.out.println("Introduzca su contraseña: ");
                        String var5 = sc.nextLine();
                        Validaciones.validarPass(var5);

                        while(true) {
                            System.out.println("Introduzca su número de teléfono: ");
                            String telefono = sc.nextLine();
                            if (Validaciones.validarNumeroTelefono(telefono)) {
                                System.out.println("🎉🎉El número introducido es correcto🎉🎉\n");

                                while(true) {
                                    System.out.println("Por favor, introduzca el DNI del titular (en caso de NIE, sustituir de la siguiente manera: X=0 Y=1 Z=2):");
                                    String dni = sc.nextLine();
                                    if (Validaciones.validarDNI(dni)) {
                                        System.out.println("🎉🎉El DNI introducido es correcto🎉🎉\n");
                                        System.out.println("Introduzca su fecha de nacimiento: ");
                                        return null;
                                    }

                                    System.err.println("❗El DNI no es correcto, por favor, introdúzcalo de nuevo:");
                                }
                            }

                            System.err.println("❗El número no es correcto, por favor, introdúzcalo de nuevo:");
                        }
                    }

                    System.err.println("❗Solo se pueden introducir letras, introdúzcalo de nuevo:");
                }
            }

            System.err.println("❗Solo se pueden introducir letras, introdúzcalo de nuevo:");
        }
    }
}