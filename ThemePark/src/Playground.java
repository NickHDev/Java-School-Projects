import java.util.Scanner;

class Playground extends Attraction implements ISecurity,IReviewed {
    @Override
    public boolean isAllowedTo(int Visitor) {
        return Visitor <= 15;
    }
    @Override
    public int getRating() {
        System.out.println("leave a rating of Attraction : ");
        Scanner input = new Scanner(System.in);
        rating = input.nextInt();
        return rating;
    }
    @Override
    public String getName() {
        System.out.println("leave your name");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        return name;
    }
}
