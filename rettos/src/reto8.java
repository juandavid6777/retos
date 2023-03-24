import java.util.Random;
import java.util.Scanner;

public class reto8 {
 
public static void main(String[] args) {
            Scanner captura = new Scanner(System.in);

            int trys=0;
            int numeroJugador;
            boolean adivina = false;
    
            Random random = new Random();
            int numeroacierto = random.nextInt(100) + 1;
            
            System.out.println("Tienes 3 intentos para adivinar un número entre 1 y 100.");
            
           
            while (!adivina && trys < 10) {
                System.out.print("Introduce tu número: ");
                numeroJugador = captura.nextInt();
                trys++;
    
                if (numeroJugador==numeroacierto) {
                    adivina = true;
                    System.out.println("FELICITACIONES" + trys + " tuviste intentos.");
                } else if (numeroJugador<numeroacierto) {
                    System.out.println("Buen intento el numero es mayor a" + numeroJugador);
                } else {
                    System.out.println("casi! es menor a " + numeroJugador);
                }
            }
    
            if (!adivina) {
                System.out.println("por poco numero puesto era " + numeroacierto);

                captura.close();
            }
     }
      }
      //adivinar numero