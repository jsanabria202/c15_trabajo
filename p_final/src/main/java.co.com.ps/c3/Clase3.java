package c3;

public class Clase3 {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Digite su edad:");
        int edad = scanner.nextInt();

        System.out.println("Su nombre es: "+nombre+" y su edad es: "+ edad +" anios Bienvenido.");
        */
        Persona persona = new Persona("Mauricio",18,"190","1022","M");


        System.out.println(persona.getNombre());


    }
