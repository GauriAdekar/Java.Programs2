import java.util.Scanner;
public class practiceset4 {
    public static void main(String[] args) {

//        //Question 1
//        int a = 10;
//        if(a == 11){
//            System.out.println("I m 11");
//        }
//        else{
//            System.out.println("I m not 11");
//        }

        //Question 2
//        byte m1, m2 , m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks in physics");
//        m1 = sc.nextByte();
//        System.out.println("Enter marks in chemistry");
//        m2 = sc.nextByte();
//        System.out.println("Enter marks in mathematics");
//        m3 = sc.nextByte();
//
//        float avg = (m1 + m2 + m3)/3.0f;
//        System.out.println("Overall percentage is:" +avg);
//        if(avg >= 40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Student is pass!");
//        }
//        else{
//            System.out.println("Student is fail");
//        }
//         Scanner sc = new Scanner(System.in);
//         int day = sc.nextInt();
        int day = 2;
         switch (day){
             case 1:
                 System.out.println("monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;


         }
    }
}
