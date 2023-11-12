import java.util.ArrayList;

public class Main {
    public static void main(String[] Args){
        ArrayList<String> students = new ArrayList<>();
        ArrayList<String> faculty = new ArrayList<>();
        University uni = new University();
        uni.menu(students, faculty);
    }
}
