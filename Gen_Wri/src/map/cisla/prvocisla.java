package map.cisla;

import org.jetbrains.annotations.NotNull;

import java.util.Vector;

public class prvocisla
{

    @NotNull
    public static Vector<Integer> Prime()
    {
        Vector<Integer> u = new Vector<Integer>();
        int [] array = konverzia.Convertion_N();
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] == 0)
                isPrime = false;
            if (array[i] == 1)
                isPrime = false;
            else
            {
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime)
                u.add(array[i]);
        }
        return u;
    }
}
