public class Practice_set_3 {
    public static void main(String[] args) {
       //Problem 1
         String name = "Gauri Adekar";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2
         String color = "My favourite color is pink";
         color = color.replace(" ","_");
         System.out.println(color);

         //problem 3
        String letter = "Dear <|name|>, Thanks a alot";
        letter = letter.replace("<|name|>","Gauri");
        System.out.println(letter);

        //problem 4
        String fruit = "My favourite fruit  is mango";
        System.out.println(fruit.lastIndexOf("  "));
        System.out.println(fruit.lastIndexOf("   "));

        //problem 5
        String letters = "Dear Gauri,\nThis java course is nice.\nThanks!";
        System.out.println(letters);


    }
}
