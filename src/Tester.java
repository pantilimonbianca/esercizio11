import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        House house= null;

        System.out.println("Registrazione:");

        int floorsNumbers= 0;
        System.out.println("Inserisci il numero del piano: ");
        floorsNumbers =scanner.nextInt();

        scanner.nextLine();

        System.out.println("Inserisci l'indirizzo: ");
        String address= null;
        address=scanner.nextLine();

        System.out.println("Inserisci i nomi dei residenti: ");
        String residents =scanner.nextLine();
        String [] residentName=null;


        residentName=residents.split(" ,");
        house=new House(floorsNumbers,address,residentName);

        System.out.printf("House floors: %d \nAddress: %s \nResidents: %s", house.getFloorsNumber(),house.getAddress(),String.join(" ,", house.getResidentsName()));







    }
}
