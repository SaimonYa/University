import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age=in.nextInt();
        float height=in.nextFloat();
        String name=in.nextLine();
        Person person = new Person(age, height, name);
        if (person.valid()==true)
            person.info();
        else System.out.println("Mistake");
    }
}