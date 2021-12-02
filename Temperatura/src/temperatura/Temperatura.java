package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temp;
        int n;
        double menor = 0;
        double mayor = 0;

        System.out.println("Bienvenido escriba cuantos municipios va a poner.");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Porfavor introduzca una temperatura.");
            temp = entrada.nextDouble();
            if (temp < 0) {
                System.out.println("Es negativa.");
            } else if (temp > 0) {
                System.out.println("Es positiva.");
            } else {
                System.out.println("Es 0.");

            }
            if (i == 1) {
                mayor = temp;
                menor = temp;
            } else {
                if (temp > mayor) {
                    mayor = temp;
                } else if (temp < menor) {
                    menor = temp;
                }
            }
        }
        System.out.println("La temperatura maxima obtenida es " + mayor + "ºC y la temperatura menor obtenida es " + menor + "ºC.");
    }

}
