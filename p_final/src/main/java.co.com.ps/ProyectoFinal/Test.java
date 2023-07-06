package ProyectoFinal;
import java.util.Scanner;

public class Test {
    public static void main(String args){
        Scanner leer = new Scanner(System.in);
        int seleccion_de_operacion = 0;
        double numero1= 0;
        double numero2= 0;
        double resultado= 0;
        do {
            System.out.println("/n");

            System.out.println("seleccione un nunmero para la operacion que desea realizar");

            System.out.println("1-----Suma");

            System.out.println("2-----Resta");

            System.out.println("3-----Multiplicar");

            System.out.println("4-----Division");

            System.out.println("5-----Potencia");

            System.out.println("6-----Salir");

            seleccion_de_operacion = leer.nextInt();
            if (seleccion_de_operacion !=6){
                  System.out.print("inserte primer numero");
                  numero1 = leer.nextInt();
                System.out.print("inserte segundo numero");
                numero2 = leer.nextInt();
            }
            switch (seleccion_de_operacion){
                case 1:
                    seleccion_de_operacion=1;
                    resultado= numero1+numero2;
                    System.out.println("el resultado de la Suma es:"+ resultado);
                    break;
                case 2:
                    seleccion_de_operacion=2;
                    resultado= numero1-numero2;
                    System.out.println("el resultado de la Resta es:"+ resultado);
                    break;
                case 3:
                    seleccion_de_operacion=3;
                    resultado= numero1*numero2;
                    System.out.println("el resultado de la Multiplicacion es:"+ resultado);
                    break;
                case 4:
                    seleccion_de_operacion=4;
                    resultado= numero1/numero2;
                    System.out.println("el resultado de la Division es:"+ resultado);
                    break;
                case 5:
                    seleccion_de_operacion=5;
                    resultado= numero1*numero1;
                    System.out.println("el resultado de la Potencia es:"+ resultado);
                    break;
            }
        } while (seleccion_de_operacion !=6);
        System.out.println("Usted ha escogido Salir, por ende, el proceso ha terminado, gracias");
}
}
