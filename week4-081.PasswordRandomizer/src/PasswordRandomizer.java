import java.util.Random;

public class PasswordRandomizer {
    private final Random random = new Random();
    private final int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = "";
        for (int i = 1; i <= this.length; i++) {
            password = password + this.getRandomChar();
        }
        return password;
    }
    private char getRandomChar() {
        return "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
    }
}
