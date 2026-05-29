import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        GalloCampero campero= new GalloCampero("El mochilero",2.8,"Antioquia");
        GalloFino fino = new GalloFino("El bacano",2.1,"Dorado");
        GalloPeleon peleon = new GalloPeleon("El bravo",2.5);

        System.out.println("===== PELEA DE GALLOS =====");
        System.out.println("\n1."+campero);
        System.out.println("\n2."+fino);
        System.out.println("\n3."+peleon);

        ArrayList<Gallo> torneo = new ArrayList<>();
        torneo.add(campero);
        torneo.add(fino);
        torneo.add(peleon);

        for(Gallo g : torneo) {
            System.out.println(g.pelear());
        }
        for(Gallo g : torneo) {
            System.out.println(g.cacarear());
        }

        System.out.println("\nSelecciona tu gallo (1,2 o 3): ");
        int opcion = scanner.nextInt();
        Gallo jugador ;
        if(opcion==1){
            jugador=campero;

        } else if (opcion==2) {
            jugador=fino;

        }else{
            jugador=peleon;
        }
        System.out.println("\nHas seleccionado: "+jugador.getNombre());


    }
}