package map.cisla;
import java.util.Random;

public class generator
{
    public static int generate()
    {
        Random rand = new Random();
        int rand_int= rand.nextInt(100);

        return rand_int;
    }
}
