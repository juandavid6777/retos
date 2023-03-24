
import java.util.Scanner;
public class reto6 {
    public static void main (String[]args){
      Scanner captura = new Scanner(System.in); 

        int victoria;
        int eleccion;
      
        
        System.out.println("Cara o sello");
        victoria = (int)(Math.random() * 2) + 1;
    
 
        System.out.println("Indique su jugada \1.cara \2.sello ");
        eleccion = captura.nextInt();
 System.out.print("victoria:");
        switch ( victoria ) {case 1:
              System.out.print("cara");
              switch (eleccion) {case 1:
                System.out.print("victoria");
                break;
                case 2:System.out.print("fallaste");
            }
            break;
            case 2:System.out.print("sello");
            switch (eleccion) {case 1:
                System.out.print("fallaste");
                break;
                case 2: System.out.print("victoria");
                switch (eleccion) {case 1:
                  System.out.print("fallaste");
            }
            break;



        }   

captura.close();

    }
}
}

//cara sello bucles
