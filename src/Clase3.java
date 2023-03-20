import javax.swing.event.MenuEvent;
import java.lang.String;
public class Clase3 {
    public static void main(String[] args) {
        class ejercicio_1 {
            public static int punto_a(String cadenaEntrada, char letra) {
                int apariciones = 0;
                for (int i = 0; i < cadenaEntrada.length(); i++) {
                    if (cadenaEntrada.charAt(i) == letra) {
                        apariciones++;
                    }
                }
                return apariciones;
            }

            public static int[] punto_b(int num1, int num2, int num3, boolean esDescendiente) {
                    int[] nums = { num1, num2, num3 };
                    if (esDescendiente) {
                        for (int i = 0; i < nums.length - 1; i++) {
                            for (int j = i + 1; j < nums.length; j++) {
                                if (nums[i] < nums[j]) {
                                    int temp = nums[i];
                                    nums[i] = nums[j];
                                    nums[j] = temp;
                                }
                            }
                        }
                    } else {
                        for (int i = 0; i < nums.length - 1; i++) {
                            for (int j = i + 1; j < nums.length; j++) {
                                if (nums[i] > nums[j]) {
                                    int temp = nums[i];
                                    nums[i] = nums[j];
                                    nums[j] = temp;
                                }
                            }
                        }
                    }
                    return nums;
                }
            public static int punto_c(int[] numeros, int X) {
                int sum = 0;
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] > X) {
                        sum += numeros[i];
                    }
                }
                return sum;
            }
        }
        class ejercicio_2 {
            private static String ABECEDARIO = " abcdefghijklmnñopqrstuvwxyz";

            public static String codificar(String sentencia, int numeroCambio) {
                String codificado = "";
                for (int i = 0; i < sentencia.length(); i++) {
                    char letra = sentencia.charAt(i);
                    int posActual = ABECEDARIO.indexOf(letra);
                    int nuevaPos = (posActual + numeroCambio) % ABECEDARIO.length();
                    codificado += ABECEDARIO.charAt(nuevaPos);
                }
                return codificado;
            }

            public static String decodificar(String codificado, int numeroCambio) {
                String decodificado = "";
                for (int i = 0; i < codificado.length(); i++) {
                    char letra = codificado.charAt(i);
                    int posActual = ABECEDARIO.indexOf(letra);
                    int nuevaPos = (posActual - numeroCambio + ABECEDARIO.length()) % ABECEDARIO.length();
                    decodificado += ABECEDARIO.charAt(nuevaPos);
                }
                return decodificado;
            }
        }
    }
}