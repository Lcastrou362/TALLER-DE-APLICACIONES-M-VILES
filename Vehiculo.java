import java.util.Scanner;

public class Vehiculo {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese la marca del vehiculo");
        String marca=sc.nextLine();
        
        System.out.println("Ingrese el modelo del vehiculo");
        String modelo=sc.nextLine();
        
        System.out.println("Ingrese la cilindrada del vehiculo");
        float cilindrada=sc.nextFloat();
        sc.nextLine();
        
        System.out.println("Ingrese la tipo de combustible del vehiculo");
        String combustible=sc.nextLine();
        
        System.out.println("Ingrese la cantidad de pasajeros del vehiculo");
        int cant_pasajeros=sc.nextInt();
        sc.nextLine();
        
        System.out.println("La marca que ha ingresado es: "+marca);
        System.out.println("El modelo que ha ingresado es: "+modelo);
        System.out.println("La cilindrada que ha ingresado es: "+cilindrada);
        System.out.println("El tipo de combustible es: "+combustible);
        System.out.println("Tiene una capacidad de: "+cant_pasajeros+" pasajeros");
        
    }
    
}
