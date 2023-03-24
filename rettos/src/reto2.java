import java.util.Scanner;
public class reto2{
    public static void main(String[] args) {
    {try (Scanner reto2 = new Scanner(System.in)) {
    } }{
            String NombreBebe;
            String NombreMamá;
            double pesoBebe;
            double mesesBebe;


            System.out.println ("ingrese el nombre del bebe");
            NombreBebe = reto2.nextLine();
            System.out.println ("ingrese el nombre de la mamá");
            NombreMamá = reto2.nextLine();
            System.out.print ("ingrese el peso del bebe");
            pesoBebe = reto2.nextLine();
            System.out.print ("ingrese los meses del bebe");
            mesesBebe = reto2.nextLine();
            System.out.print ("La dosis para el bebé es: "+ ((pesoBebe+10)/(mesesBebe*10)*8));
        }
}

    private static String nextLine() {
        return null;
        

        
        

    }
}
//vacuna bebé//