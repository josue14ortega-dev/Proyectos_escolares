import java.util.Scanner;

public class promedio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Cali1, Cali2;
        float Promedio;
        System.out.println("Ingresa la primera calificacion: ");
        Cali1 = entrada.nextInt();
        System.out.println("Ingresa la segunda calificacion: ");
        Cali2 = entrada.nextInt();
        Promedio = (Cali1 + Cali2)/2.0f;
        System.out.println("El promedio es: "+ Promedio);
        entrada.close();
    }

}
