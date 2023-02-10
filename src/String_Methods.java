public class String_Methods {
    public static void main(String[] args) {
        String Flower = "Sunflower";
        int value = Flower .length();
        System.out.println(value);

        String letters = Flower .toLowerCase();
        System.out.println(letters);

        String up = Flower .toUpperCase();
        System.out.println(up);

        String test = Flower.trim();
        System.out.println(test);

        System.out.println(Flower.substring(3));
        System.out.println(Flower.substring(0,4));

        System.out.println(Flower.replace('F','G'));
        System.out.println(Flower.replace("Fe","Te"));

        System.out.println(Flower.startsWith("Su"));
        System.out.println(Flower.endsWith("Su"));

        System.out.println(Flower.charAt(6));
        System.out.println(Flower.indexOf("o"));

        String modifiedName = "Sunflowerwer";
        System.out.println(modifiedName.indexOf("wer"));
        System.out.println(modifiedName.lastIndexOf("wer",4));

        System.out.println(Flower.equals("Sunflow"));
        System.out.println(Flower.equalsIgnoreCase("suNfLoWeR"));



    }
}
