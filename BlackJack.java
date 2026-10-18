
import java.util.Scanner;

public class BlackJack {

  public static void main(String[] args) {

    //Variables 
    int credito = 2000;
    boolean seguir = true;
    boolean split = false;
    boolean repetir = false;
    boolean fallado = false;
    int cuenta = 0;
    int rondas = 0;
    boolean inicio = false;
    Scanner sc = new Scanner(System.in);

//Inicio
    System.out.println("-----BlackJack------");
    System.out.println("Introduce: \"e\" para empezar");
    String comienzo = sc.nextLine();

    if (comienzo.equals("e")) {
      inicio = true;
    }

    while (inicio) {
      System.out.println("Crédido: " + credito);
      System.out.println();
      System.err.println("¿Cuánto quieres apostar?");
      int apuesta = sc.nextInt();
      credito = -apuesta;

      for (int i = 0; i < 2; i++) {
        carta nuevacarta = new carta();
        nuevacarta.asignarCarta();
        System.out.println(nuevacarta);
        System.err.println("");

        cuenta = cuenta + nuevacarta.getValor();

      }

      System.out.println("Suma: " + cuenta);
      System.out.println("¿Seguir?");
      System.out.println("0: No");
      System.out.println("1: Si");
      int Seguir = sc.nextInt();

      if (cuenta >= 21) {

        fallado = true;
      }


    }

  }


}