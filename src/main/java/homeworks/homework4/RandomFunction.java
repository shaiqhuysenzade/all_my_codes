package homeworks.homework4;
import java.util.Random;
public abstract class RandomFunction {
    Random random = new Random();
    public int getRandom (){

        return random.nextInt(101);
    }
}
