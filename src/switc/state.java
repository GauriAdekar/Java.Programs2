package switc;
import java.util.Scanner;
public class state {
    public static void main(String[] args) {
//        int marks;
//        System.out.println("Enter your marks");
//        Scanner sc = new Scanner(System.in);
//        marks = sc.nextInt();
//        if (marks==35){
//            System.out.println("You are Pass!");
//        }
//        else if(marks<=70){
//            System.out.println("You are pass with First Class!");
//        }
//        else if(marks<=80) {
//            System.out.println("You are pass with Distinction!");
//        }
//        else{
//                System.out.println("You are Fail!");
//            }


//
        switch(marks){
            case 35:
                System.out.println("You are going to pass!");
                break;
            case 70:
                System.out.println("You are going to pass with first class!");
                break;
            case 80:
                System.out.println("You are going to pass with distinction!");
                break;
            default:
                System.out.println("Study hard for better improvement!");


        }

        String var = "Gauri";
        switch(var){
            case "Vijay":
                System.out.println("You are going to pass!");
                break;
            case "Dhanashri":
                System.out.println("You are going to pass with first class!");
                break;
            case "Vaibhav":
                System.out.println("You are going to pass with distinction!");
                break;
            default:
                System.out.println("Study hard for better improvement!");


        }

        }

    }

