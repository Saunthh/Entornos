
package temperatura;
import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("Porfavor introduzca una temperatura.");
        Scanner entrada= new Scanner(System.in);
        int temp= entrada.nextInt();
        if (temp<0) {
            System.out.println("Es negativa.");
        } else if (temp>0) {
            System.out.println("Es positiva.");
        } else {
            System.out.println("Es 0.");
        }
    }
    
}
