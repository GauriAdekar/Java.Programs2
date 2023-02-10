import java.util.Scanner;
public class Strings_Chapter3 {
    public static void main(String[] args) {
        String  name = "Gauri";
        System.out.println("Gauri");

        int a = 10;
        float b = 6.789f;
        System.out.printf("The value of a is %d and value of b is %f", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);

        Scanner sc = new Scanner(System.in);
       // String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);

    }
}
