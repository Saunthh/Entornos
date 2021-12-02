
package temperatura;
import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        int temp;
        System.out.println("Bienvenido");
        Scanner entrada= new Scanner(System.in);
        for (int i= 1; i<=5; i++) {
        System.out.println("Porfavor introduzca una temperatura.");
        temp= entrada.nextInt();
        if (temp<0) {
            System.out.println("Es negativa.");
        } else if (temp>0) {
            System.out.println("Es positiva.");
        } else {
            System.out.println("Es 0.");
        }
        }
    }
    
}
