import java.util.Scanner;

public class Switch {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введи возраст");
       String age = scanner.nextLine();
       switch(age){
           case "zero" :
               System.out.println("Ты родился");
               break;
           case "ten" :
               System.out.println("Ты в школе");
               break;
           case "twelve" :
               System.out.println("Ты закончил шк");
               break;
           default:
               System.out.println("нет подход отв");
       }
   }

}
