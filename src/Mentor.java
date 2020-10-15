import java.util.Random;

public class Mentor extends Person {

    private boolean isInGoodMood;
    public static final int RANDOM = new Random().nextInt();


    public Mentor(String name, String surname, int age) {
        super(name, surname, age);
        this.isInGoodMood = true;
    }
}
