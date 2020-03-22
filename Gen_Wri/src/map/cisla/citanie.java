package map.cisla;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;

public class citanie
{
    @NotNull
    public static Vector<Integer> Read_N()
    {
        // Čítanie zo súboru pomocou Scannera a následné zapísanie do vektora
        int cisla;
        Vector<Integer> v = new Vector<Integer>();
        try (Scanner sc = new Scanner(new FileReader("Cisla.txt")))
        {
            while (sc.hasNextInt())
            {
                cisla = sc.nextInt();

                v.add(cisla);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor sa nepodarilo otvorit");
        }
        return v;
    }

    @NotNull
    public static Vector<Integer> Read_P()
    {
        // Čítanie zo súboru pomocou Scannera a následné zapísanie do vektora
        int a;
        Vector<Integer> w = new Vector<Integer>();
        try (Scanner sc = new Scanner(new FileReader("Prvocisla.txt")))
        {
            while (sc.hasNextInt())
            {
                a = sc.nextInt();

                w.add(a);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor sa nepodarilo otvorit");
        }
        return w;
    }
}