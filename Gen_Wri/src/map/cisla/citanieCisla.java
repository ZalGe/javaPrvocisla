package map.cisla;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class citanieCisla
{
    public static void Read_N()
    {

        try
        {
            FileReader reader = new FileReader("Cisla.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String cisla;

            while ((cisla = bufferedReader.readLine())!=null)
            {
                System.out.println(cisla);
            }
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor sa nepodarilo otvorit");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void change()
    {
        String cisla;
        //int Cisla = Integer.parseInt(cisla);
    }
}
