import java.util.Scanner;

public class reto7 {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int empates = 0, VICTORIA = 0, perdidas = 0;
        String ID;
        int valorapuesta;
        int apuesta=0;
        int OpcionJugador;
        System.out.println("Ingrese su ID:");
        ID=captura.nextLine();
        System.out.println("cuanto quieres apostar: ");
        valorapuesta=captura.nextInt();

        if (valorapuesta < 10000) {
            System.out.println("Su apuesta tiene que ser mayor a 20.000");
            return;
        }

        System.out.println("Cuántas rondas quieres jugar: ");
        int Rondas = captura.nextInt();

        
        for (int i = 0; i < Rondas; i++) {
            System.out.println("Ronda " + (i + 1));
            System.out.println("Indique su jugada \1.Piedra \2.Papel \3.Tijera");
            OpcionJugador = captura.nextInt();
            int OpcionCompu = (int)(Math.random() * 3) + 1;
            System.out.println("la eleccion de la pc fue");


            System.out.print("la eleccion de la pc fue: ");
        switch ( OpcionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( OpcionJugador )
                {
                   case 1: System.out.println("Empatan"); 
                   empates++;
                   break;
                   case 2: System.out.println("Ganadoor"); 
                   VICTORIA++;
                   apuesta=valorapuesta+apuesta;
                   break;
                   case 3: System.out.println("La pc es gana");
                   perdidas++;
                    break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( OpcionJugador )
                {
                   case 1: System.out.println("La pc gana");
                   perdidas++;
                   break;
                   case 2: System.out.println("Empatan"); 
                   empates++;
                   break;
                   case 3: System.out.println("VICTORIA"); 
                   VICTORIA++;
                   apuesta=valorapuesta+apuesta;

                   break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( OpcionJugador )
                {
                   case 1: System.out.println("VICTORIA"); VICTORIA++;
                   apuesta=valorapuesta+valorapuesta;
                   break;
                   case 2: System.out.println("La compu es ganador"); perdidas++; apuesta=valorapuesta-valorapuesta;
                   break;
                   case 3: System.out.println("Empatan"); empates++;
                   break;
                }
                break;
        }
 }
        System.out.println("Jugador:"+ID);
        System.out.println("Ganadas: " + VICTORIAS);
        System.out.println("Perdidas: " + perdidas);
        System.out.println("Empates: " + empates);
        System.out.println("Valor apuesta: " + apuesta);


        captura.close();
}
}
//piedra papel o tijera bucles
