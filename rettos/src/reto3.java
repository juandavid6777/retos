
import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
    String nombreEmpleado ,nombreCliente;
    int valor , efectivo, p, total=0, contestacion;

       
    try (Scanner captura = new Scanner(System.in)) {
        System.out.println("digite nombre del empleado");
        nombreEmpleado = captura.nextLine();
        
        

        System.out.println("Esta registrado el producto 1 si es correcto, 2 si no"); contestacion =captura.nextInt();
            if (contestacion==2) {
                System.out.println("digite el producto");
            nombreCliente = captura.next();
            } else {
                System.out.println("Si esta el producto");
            }
            System.out.println("cual es el numero de productos que va a comprar");
            p=captura.nextInt();

            for(int i=0;i<p;i++){
            System.out.println("Digite precio del producto "); valor=captura.nextInt(); total=total+valor;  total++;
            }
            System.out.println("paga con"); efectivo=captura.nextInt();
    }

    if (efectivo<total) {
        System.out.println("No le alcanza para comprar ");
       }  else {
    int restante=efectivo-total;
    System.out.println("el restante es:"+restante);
    System.out.println("El nombre del empleado que la atendio es"+nombreEmpleado);

}

}
}
//registro de productos//

