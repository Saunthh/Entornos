package temperatura;

import java.util.Scanner;
/**
 * Coge temperturas las analiza y compara.
 * @author serdam
 * @version 1.0
 */
public class Temperatura {

    /**
     * Estsa es la funcion principal
     * @param args Argumentos de entrada de linea de comandoss
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temp[];
        int n, i = 0;
        double mayor;
        double menor;

        System.out.println("Bienvenido, escriba cuantos municipios va a poner.");
        n = entrada.nextInt();
        temp = new double[n];
        for (i = 0; i < temp.length; i++) {
            System.out.println("Porfavor introduzca una temperatura.");
            temp[i] = entrada.nextDouble();
        }
        mayor = temp[0];
        menor = temp[0];
        for (i = 0; i < temp.length; i++) {
            if (temp[i] < 0) {
                System.out.println("Es negativa.");
            } else if (temp[i] > 0) {
                System.out.println("Es positiva.");
            } else {
                System.out.println("Es 0.");
                if (temp[i] > mayor) {
                    mayor = temp[i];
                } else if (temp[i] < menor) {
                    menor = temp[i];
                }
            }
        }
        System.out.println("La temperatura maxima introducida es " + mayor + "ºC y la temperatura menor introducida es " + menor + "ºC.");
    }
}
