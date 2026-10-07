import java.util.Scanner;

public class edades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("Cual es tu edad? ");
        edad = entrada.nextInt();
        if (edad >=0){
            if (edad >= 0 && edad<=3){
                System.out.println("Bebe");
            }
            if (edad>=4 && edad<=10){
                System.out.println("Niño");
            }
            if (edad>=11 && edad<=18){
                System.out.println("Joven");
            }
            if (edad >=19 && edad <=40){
                System.out.println("Adulto");
            }
            if (edad>40){
                System.out.println("Adulto mayor");
            }
        }
        else {
            System.out.println("Error en la edad");
        }
        entrada.close();
    }
}
