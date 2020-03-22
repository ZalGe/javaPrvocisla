package map.cisla;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Vector;

public class zapis
{
    public static void Write_N() throws Exception
    {
        // Buffrovaný zápis generovaných čísel do súboru
        FileWriter writer = new FileWriter("Cisla.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for (int i= 0;i<=999;++i)
        {
            bufferedWriter.write((generator.generate()) + " ");
        }

        bufferedWriter.close();
    }

    public static void Write_P() throws Exception
    {
        // Prevod vektoru na Integer pole
        Vector<Integer> n = prvocisla.Prime();
        Integer [] PrimeNum = new Integer[n.size()];
        n.toArray(PrimeNum);

        // Buffrovaný zápis pola do súboru
        FileWriter writer = new FileWriter("Prvocisla.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        int lenght = PrimeNum.length;
        for (Integer integer : PrimeNum) {
            writer.write(integer + " ");
        }
        bufferedWriter.close();
    }

}
