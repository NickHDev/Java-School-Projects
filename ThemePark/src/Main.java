import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Attraction attraction = new Attraction();
        Playground playground = new Playground();
        IceCreamStall iceCreamStall = new IceCreamStall();
        TobaccoStall tobaccoStall = new TobaccoStall();
        Rollercoster rollercoster = new Rollercoster();
        CandyFlossStall candyFlossStall = new CandyFlossStall();
        Park park = new Park();
        Dodgems dodgems = new Dodgems();
        int age;
        for(int i = 0;i<1;)
        {
        System.out.println("""
                        ******** Visitor Menu ********
                        Enter number for Selection-------
                        1. Visit Playground\s
                        2. Visit Ice Cream Stall\s
                        3. Visit Tobacco Stall
                        4. Visit Candy Stall
                        5. Visit Dodgems
                        6. Visit Park
                        7. Visit Roller Coaster
                        8. Exit
                        """);
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
            switch (selection) {
                case 1 -> {
                    System.out.print("Enter Age : ");
                    age = input.nextInt();
                    boolean canPlay = playground.isAllowedTo(age);
                    if (canPlay) {
                        System.out.println("You can play at the Play Ground");
                        attraction.name = playground.getName();
                        attraction.rating = playground.getRating();
                        attraction.visitCount += 1;
                    }
                }
                case 2 -> {
                    attraction.name = playground.getName();
                    attraction.rating = playground.getRating();
                    attraction.visitCount += 1;
                }
                case 3 -> {
                    System.out.print("Enter Age of adult : ");
                    age = input.nextInt();
                    boolean canSmoke = tobaccoStall.isAllowedTo(age);
                    if (canSmoke) {
                        System.out.println("You can play at the Play Ground");
                        attraction.name = tobaccoStall.getName();
                        attraction.rating = tobaccoStall.getRating();
                        attraction.visitCount += 1;
                    }
                }
                case 4 -> {
                    attraction.name = candyFlossStall.getName();
                    attraction.rating = candyFlossStall.getRating();
                    attraction.visitCount += 1;
                }
                case 5 -> {
                    attraction.name = dodgems.getName();
                    attraction.rating = dodgems.getRating();
                    attraction.visitCount += 1;
                }
                case 6 -> {
                    attraction.name = park.getName();
                    attraction.rating = park.getRating();
                    attraction.visitCount += 1;
                }
                case 7 -> {
                    attraction.name = rollercoster.getName();
                    attraction.rating = rollercoster.getRating();
                    attraction.visitCount += 1;
                }
                case 8 -> {
                    System.out.println(attraction.name + attraction.rating);
                    System.out.println(attraction.visitCount);
                    i++;
                }
            }
        }
    }
}
