import java.util.Scanner;
 
public class reto5
{
    public static void main(String args[]) {
      try (Scanner captura = new Scanner(System.in)) {int Opcionjugador; System.out.println("piedra, papel o tijera");
        int Opcionsistema = (int)(Math.random() * 3) + 1;
        System.out.println("Indique su eleccion \r.Piedra \P.apel \T.ijera");
        Opcionjugador = captura.nextInt();
 
        System.out.print("La computadora habia escogido: ");
        switch ( Opcionsistema )
        {
            case 1:System.out.println("Piedra");
                switch ( Opcionjugador )
                {
                   case 1: System.out.println("igual"); 
                   break;
                   case 2: System.out.println("victoria"); 
                   break;
                   case 3: System.out.println("fallaste");
                    break;
                }
                break;
 
            case 2:System.out.println("Papel");
                switch ( Opcionjugador )
                {
                    case 1: System.out.println("igual"); 
                    break;
                   case 2: System.out.println("victoria"); 
                   break;
                   case 3: System.out.println("fallaste"); 
                   break;
                }
                break;
 
            case 3:System.out.println("Tijera");
                switch ( Opcionjugador )
                {
                   case 1: System.out.println("igual"); 
                   break;
                   case 2: System.out.println("victoria"); 
                   break;
                   case 3: System.out.println("fallaste"); 
                   break;
                }
                break;
        }
    }
    }
}
//piedra papel o tijeras