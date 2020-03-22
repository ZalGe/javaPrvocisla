package map.cisla;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Vector;

public class konverzia
{
    @NotNull
    public static int[] Convertion_N()
    {
        Vector<Integer> vec = citanie.Read_N();
        Integer [] Cisla = new Integer[vec.size()];
        vec.toArray(Cisla);

        int lenght = Cisla.length;
        int[] cisla = new int[lenght];
        try
        {
            for (int i = 0; i <Cisla.length; ++i) {
                cisla[i] = (int) Cisla[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Chyba");
        }
        return cisla;
    }

    @NotNull
    public static int[] Convertion_P()
    {
        Vector<Integer> l = citanie.Read_P();
        Integer [] PrimeNum = new Integer[l.size()];
        l.toArray(PrimeNum);

        int lenght = PrimeNum.length;
        int[] prime_num = new int[lenght];
        try
        {
            for (int i = 0; i <PrimeNum.length; ++i) {
                prime_num[i] = (int) PrimeNum[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Chyba");
        }
        return prime_num;
    }

    @NotNull
    public static int[] Convertion_F()
    {
        List<Integer> SortNumbers = uprava.Sort();
        Integer[] Sort_Numbers = new Integer[SortNumbers.size()];
        SortNumbers.toArray(Sort_Numbers);

        int lenght = Sort_Numbers.length;
        int[] sort_numbers = new int[lenght];
        try
        {
            for (int i = 0; i <Sort_Numbers.length; ++i) {
                sort_numbers[i] = (int) Sort_Numbers[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Chyba");
        }
        return sort_numbers;
    }
}
