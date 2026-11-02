
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
      System.out.println("¿Cuánto quieres apostar?");
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

      while (Seguir == 1 && cuenta < 21) {
        carta cartaExtra = new carta();
        cartaExtra.asignarCarta();
        System.out.println(cartaExtra);

        cuenta += cartaExtra.getValor();
        System.out.println("Nueva Suma: " + cuenta);

        if (cuenta < 21) {
          System.out.println("¿Seguir pidiendo?");
          System.out.println("0: No");
          System.out.println("1: Si");
          Seguir = sc.nextInt();
        }
      }

      if (cuenta <= 21) {
        int cuentaCrupier = 0;
        System.out.println("Turno del Crupier: ");

        while (cuentaCrupier < 17) {
          carta cartaCrupier = new carta();
          cartaCrupier.asignarCarta();
          cuentaCrupier += cartaCrupier.getValor();
          System.out.println("El crupier saca: " + cartaCrupier + " (Suma: " + cuentaCrupier + ")");
        }

        System.out.println(" Resultados");
        System.out.println("Tu puntuación: " + cuenta);
        System.out.println("Puntuación del crupier: " + cuentaCrupier);

        //Como saber quíen gana
        if (cuentaCrupier > 21 || cuenta > cuentaCrupier) {
          System.out.println("¡Ganaste!");
          credito += (apuesta * 2);
        } else if (cuenta==cuentaCrupier) {
          System.out.println("Empate");
          credito+=apuesta;
        }else{
          System.out.println("Gana el crupier. Pierdes tu apuesta.");
        }
      } else {
        System.out.println("Te has pasado de 21. Pierdes.");
      }

      }
    }
  }

