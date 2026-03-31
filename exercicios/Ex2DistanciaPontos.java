import java.util.Scanner;

public class Ex2DistanciaPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = 6371.01;

        double lat1;
        double long1;

        double lat2;
        double long2;

        
        System.out.println("Latitude da coordenada 1: ");
        lat1 = sc.nextDouble(); 
        
        System.out.println("Latitude da coordenada 2: ");
        lat2 = sc.nextDouble(); 
        
        System.out.println("Longitude da coordenada 1: ");
        long1 = sc.nextDouble(); 
        
        System.out.println("Longitude da coordenada 2: ");
        long2 = sc.nextDouble();
        
        double distancia = raio * Math.acos(
            Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + 
            Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * 
            Math.cos(Math.toRadians(long1 - long2))
        );
        
        System.out.println("A distância entre esses pontos é: " + distancia + " km");

        sc.close();
    }
}
