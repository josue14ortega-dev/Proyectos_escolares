import java.util.Scanner;

public class numero{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float num;
        float suma;
       
        int Cantidad_num;
        suma = 0;
        Cantidad_num = 0;
        do{
            System.out.println("Escribe un numero del 0-100: ");
            num = ent.nextFloat();
            if (num>=0 && num<= 100){
                suma = suma + num;
                Cantidad_num= Cantidad_num +1;
            }

            
        }while (num >= 0 && num <=100);
        System.out.println("El promedio es igual a: "+(Float) suma/Cantidad_num);
        System.err.println("La cantidad de numero es "+ (int)Cantidad_num);
    ent.close();
    }
}