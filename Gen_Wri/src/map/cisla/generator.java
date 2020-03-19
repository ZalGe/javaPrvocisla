package map.cisla;
import java.util.Random;

public class generator
{
    public static int generate()
    {
        Random rand = new Random();
        int rand_int= rand.nextInt(100);
        System.out.println(+rand_int);
        return rand_int;
    }
}
