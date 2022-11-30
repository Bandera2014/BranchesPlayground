import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws InterruptedException  {
          Scanner in = new Scanner(System.in);
          while(true){
               System.out.println("Role Call, when you hear your name, say hear");
               System.out.println("Gogel\nHorstman\nBrant\nCarreno\nKoehler\nGrisham\nLenahan\nBatts\nJuarez-Fernandez\nScheller");
               String response = in.nextLine();
               switch(response){
                    case("Gogel"):
                         break;
                    default:
                         bueller();
                         break;
               }
          }
     }

     // Gogel
     // Horstman
     // Brant
     // Carreno
     // Koehler
     private static void koehler(){
          
     }
     // Grisham
     // Lenahan
     // Batts
     // Juarez-Fernandez
     // Scheller

     private static void bueller() throws InterruptedException {
          for(int i=0;i<3;i++){
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
