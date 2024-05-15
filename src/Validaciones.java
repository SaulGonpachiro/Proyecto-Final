//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Validaciones {
    public static String asientosLibres = "A1 A2 A3 A4 A5 A6 B1 B2 B3 B4 B5 B6 C1 C2 C3 C4 C5 C6";
    public static String asientosOcupados = "A1 B5 C6";

    public Validaciones() {
    }

    public static boolean validarNombre(String cadena) {
        for(int i = 0; i < cadena.length(); ++i) {
            char caracter = cadena.charAt(i);
            if ((caracter < 'A' || caracter > 'Z') && (caracter < 'a' || caracter > 'z') && caracter != ' ') {
                return false;
            }
        }

        return true;
    }

    public static boolean validarApellido(String cadena) {
        for(int i = 0; i < cadena.length(); ++i) {
            char caracter = cadena.charAt(i);
            if ((caracter < 'A' || caracter > 'Z') && (caracter < 'a' || caracter > 'z') && caracter != ' ') {
                return false;
            }
        }

        return true;
    }

    public static boolean validarDNI(String dni) {
        if (dni.length() != 9) {
            return false;
        } else {
            char digito;
            for(int i = 0; i < 8; ++i) {
                digito = dni.charAt(i);
                if (digito < '0' || digito > '9') {
                    return false;
                }
            }

            char calcularLetra = calcularLetraDni(dni.substring(0, 8));
            digito = Character.toUpperCase(dni.charAt(8));
            return digito == calcularLetra;
        }
    }

    private static char calcularLetraDni(String numeros) {
        int numeroDNI = Integer.parseInt(numeros);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numeroDNI % 23;
        return letras.charAt(indice);
    }

    public static boolean validarGmail(String email) {
        int arrobaIndice = email.indexOf(64);
        int puntoIndice = email.lastIndexOf(46);
        return arrobaIndice > 0 && puntoIndice > arrobaIndice + 1 && puntoIndice < email.length() - 1;
    }

    public static boolean validarNumeroTelefono(String numeroTelefono) {
        if (numeroTelefono.length() != 11) {
            return false;
        } else {
            for(int i = 0; i < 11; ++i) {
                char posicionActual = numeroTelefono.charAt(i);
                if ((i == 3 || i == 7) && posicionActual != ' ') {
                    return false;
                }

                if (i != 3 && i != 7 && (posicionActual < '0' || posicionActual > '9')) {
                    return false;
                }
            }

            return true;
        }
    }

    public static boolean validarIBAN(String iban) {
        if (iban.length() != 24) {
            return false;
        } else {
            int i;
            char caracter;
            for(i = 0; i < 2; ++i) {
                caracter = iban.charAt(i);
                if (caracter < 'A' || caracter > 'Z') {
                    return false;
                }
            }

            for(i = 2; i < 24; ++i) {
                caracter = iban.charAt(i);
                if (caracter < '0' || caracter > '9') {
                    return false;
                }
            }

            return true;
        }
    }

    public static void validarPassLog(String pass) {
        if (pass.length() >= 8) {
        }

    }

    public static void validarPass(String pass) {
        if (pass.length() >= 8) {
            System.out.println("Contraseña valida.");
        } else {
            System.err.println("Error, la contraseña es insegura.");
        }

    }
}