import java.util.Scanner;
public class compararEdades {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu edad: ");
        int edad1 = sc.nextInt();
        System.out.println("Ingresa la edad de tu compañero: ");
        int edad2 = sc.nextInt();
        if(edad1 > edad2){
            System.out.println("La primera persona es mayor ");
            else{
                (edad1 < edad2)
                System.out.println("La segunda persona es menor");
            }
        }
        sc.close();
    }
}
