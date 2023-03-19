import java.lang.String;
public class Clase3 {
    public static void main(String[] args) {
        class punto_a {
            public static int cuentaLetra(String cadenaEntrada, char letra) {
                int apariciones = 0;
                for (int i = 0; i < cadenaEntrada.length(); i++) {
                    if (cadenaEntrada.charAt(i) == letra) {
                        apariciones++;
                    }
                }
                return apariciones;
            }

            static String cadenaEjemplo = new String("Esta es una cadena de ejemplo");
            static char letraEjemplo = 'e';
            static int apariciones = cuentaLetra(cadenaEjemplo, letraEjemplo);
        }

        class punto_b {

        }

        System.out.println("La letra '" + punto_a.letraEjemplo + "' aparece: " + punto_a.apariciones + " veces.");

    }
}