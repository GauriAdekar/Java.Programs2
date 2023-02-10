import java.util.Random;
public class Pass {
    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }

    private static char[] generatePassword( int length){
        String capitalcaseletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseletters = "abcdefghijklmnopqrstuvwxyz";
        String specialcharacters = "!@#$";
        String numbers = "1234567890";
        String combinedchars = capitalcaseletters + lowercaseletters + specialcharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowercaseletters.charAt(random.nextInt(lowercaseletters.length()));
        password[1] = capitalcaseletters.charAt(random.nextInt(capitalcaseletters.length()));
        password[2] = specialcharacters.charAt(random.nextInt(specialcharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i< length; i++) {
            password[i] = combinedchars.charAt(random.nextInt(combinedchars.length()));
        }
        return password;
    }

}
