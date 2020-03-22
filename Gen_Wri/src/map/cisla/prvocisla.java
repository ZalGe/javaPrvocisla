package map.cisla;

import org.jetbrains.annotations.NotNull;

import java.util.Vector;

public class prvocisla
{

    @NotNull
    public static Vector<Integer> Prime()
    {
        Vector<Integer> u = new Vector<Integer>();
        // Načíta int pole
        int [] array = konverzia.Convertion_N();
        for (int value : array) {
            // Vylúči z hladania 0,1
            boolean isPrime = true;
            if (value == 0)
                isPrime = false;
            if (value == 1)
                isPrime = false;
            else {
                // Hladanie prvočísel
                for (int j = 2; j <= value / 2; j++) {
                    if (value % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime)
                u.add(value);
        }
        return u;
    }
}
