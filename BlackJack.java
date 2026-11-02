
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
      cuenta = 0;
      credito -= apuesta;

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

      //Bucle para pedir cartas
      while (Seguir == 1 && cuenta < 21) {
        carta cartaExtra = new carta();
        cartaExtra.asignarCarta();
        System.out.println(cartaExtra);
        cuenta = cuenta + cartaExtra.getValor();
        System.out.println(cuenta);

        if (cuenta < 21) {
          System.out.println("¿Seguir pidiendo?");
          System.out.println("0: No");
          System.out.println("1: Si");
          Seguir = sc.nextInt();
        }


      }
    }

  }
  }