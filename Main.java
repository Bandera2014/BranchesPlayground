import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws InterruptedException  {
          Scanner in = new Scanner(System.in);
          while(true){
               System.out.println("\n\n\n\n\n\nRole Call, when you hear your name, say hear");
               System.out.println("Gogel\nHorstman\nBrant\nCarreno\nKoehler\nGrisham\nLenahan\nBatts\nJuarez-Fernandez\nScheller");
               String response = in.next();
               System.out.println(response);
               switch(response){
                    case "Juarez":
                         Juarez();
                         break;
                    case "Scheller":
                         scheller();
                    case "Horstman":
                         Horstman();
                         break;
                    case "Koehler":
                         koehler();
                         break;
                    case "Brant":
                         brant();
                         break;
                    case "Carreno":
                         Carreno();
                         break;
                    default:
                         bueller();
               }
          }
     }

     private static void bander(){
          System.out.println("Hello There");
     }
     private static void brant(){
          System.out.println("Bang!");
     }

     // Gogel
     // Horstman
     private static void Horstman(){
          System.out.println("Hello There");
     }

     // Brant
     // Carreno
     private static void Carreno(){
          System.out.println("According to all known laws of aviation, there is no way a bee should be able to fly.");
     }
     // Koehler
     private static void koehler(){
          System.out.println("I like coffee");
     }
     // Grisham
     // Lenahan
     // Batts
     // Juarez-Fernandez
     private static void Juarez(){
          System.out.println("I need charger");
     }
     // Scheller
     public static void scheller() {
          System.out.println("\nThe Emoji Movie Was Pretty Good\n");
     }

     private static void bueller() throws InterruptedException {
          for(int i=0;i<1;i++){
               System.out.print("Bueller");
               delayDots(3);
          }
     }
     /**
          * This prints an ellipses with 1 second between each period
          * It then moves to the next line.
     */
    public static void delayDots(int dotAmount) throws InterruptedException 
    {
        for (int i=0; i<dotAmount; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println();
    }

}
