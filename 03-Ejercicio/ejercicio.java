/*
Ejercicio escolar numero 3.
 */
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int CantidadPro;
        double PrecioU;
        double ImporteOriginal;
        double Descuento;
        double CargoEnvio; 
        double Total;
        System.out.println("Ingresa la cantidad de productos: ");
        CantidadPro = entrada.nextInt();
        System.out.println("Ingresa el precio unitario: ");
        PrecioU = entrada.nextDouble();
        ImporteOriginal = CantidadPro * PrecioU;
        if(ImporteOriginal >= 2500) {
            Descuento  = ImporteOriginal * 0.10;
            CargoEnvio = 0;
        }else { 
            CargoEnvio = 150;
            Descuento = 0;
        }
        Total = (ImporteOriginal - Descuento + CargoEnvio);

        System.out.print("El importe Original es: " + ImporteOriginal+
                        " El descuento es de: " + Descuento +
                        " El cargo de envio es de: " + CargoEnvio+
                        " El total es de: "+ Total);
        entrada.close();
    }
    
}
