import java.util.Scanner;
// algoritmodonde un usuario tenga 3 oportunidades de adivinar el numero ,
// el numero es un aleatorio entre 1-10 si lo adivina se gana un bono de 50k

public class adivinar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAleatorio = (int) (Math.random() * 10) + 1;
        int intentos = 3;
        int numUser;

        while (intentos > 0) {

            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Adivina el número (entre 1 y 10): ");
            numUser = scanner.nextInt();

            if (numUser == numAleatorio) {
                System.out.println("Has ganado!");
                System.out.println("Ganaste un bono de 50k!");
                break;
            } else if (numUser < numAleatorio) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
        
                // intentos--;
        
                // if (intentos == 0) {
                //     System.out.println("Perdiste!");
                    
                // }
        
            } 
            
            intentos--;
        
            if (intentos == 0) {
                System.out.println("Perdiste!");
                System.out.println("El numero era: " + numAleatorio);

                    break;
            }
        }
    }
}

// leer el nombre de una persona al igual que su edad imprimir el nombre de la persona y los dias vividos