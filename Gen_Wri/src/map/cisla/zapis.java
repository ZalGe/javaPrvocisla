package map.cisla;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class zapis
{
    public static void Write_N()
    {
        try
        {
            FileWriter writer = new FileWriter("Cisla.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i= 0;i<=999;++i)
            {
                bufferedWriter.write((generator.generate()) + " ");
            }

            bufferedWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void Write_P() throws Exception
    {
        Vector<Integer> n = prvocisla.Prime();
        Integer [] PrimeNum = new Integer[n.size()];
        n.toArray(PrimeNum);

        FileWriter writer = new FileWriter("Prvocisla.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        int lenght = PrimeNum.length;

        for (int i = 0; i<lenght;++i)
        {
            writer.write(PrimeNum[i] + " ");
        }
        writer.close();
    }

    public static void Write_F()
    {
        int c = uprava.Freq();
        Integer[] Cnum = uprava.Clear();


    }
}
