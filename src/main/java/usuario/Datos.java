package usuario;

import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Gracias, para completar el registro le pediremos algunos datos a continuacion");
        System.out.println("Porfavor ingrese su nombre completo:");
        String name = leer.nextLine();
        System.out.println("A continuacion ingrese su celular:");
        String cel = leer.nextLine();
        System.out.println("Por ultimo inserte su edad:");
        String age = leer.nextLine();
        System.out.print("Bienvenido señor/a " + name + ", es un placer para nosotros contar con una persona de " + age + " años." +
                "\n" + "Próximamente nos comunicaremos con usted al numero " + cel + "." +
                "\n" + "Feliz día.");
    }
}
