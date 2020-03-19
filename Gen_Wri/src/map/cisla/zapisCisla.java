package map.cisla;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class zapisCisla extends generator {
    public static void Write_N()
    {
        try
        {
            FileWriter writer = new FileWriter("Cisla.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i= 0;i<=1000;++i)
            {
                bufferedWriter.write((generate()) + " ");
            }

            bufferedWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
