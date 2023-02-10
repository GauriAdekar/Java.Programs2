import java.util.Scanner;
public class Literals {
    public static void main(String[] args) {
        System.out.println("Percentage of student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        int a = sc.nextInt();
        System.out.println("Enter subject 2 marks");
        int b = sc.nextInt();
        System.out.println("Enter subject 3 marks");
        int c = sc.nextInt();
        System.out.println("Enter subject 4 marks");
        int d = sc.nextInt();
        System.out.println("Enter subject 5 marks");
        int e = sc.nextInt();

        int total = a+b+c+d+e;
        total = a+b+c+d+e;
        double average = (total/5.0);
        double percentage = (total/500.0)*100;
        System.out.println("Total marks =" +total);
        System.out.println("Average marks =" +average);
        System.out.println("percentage is =" +percentage);



    }

}
