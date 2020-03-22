package map.cisla;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class uprava
{
    public static List<Integer> Sort()
    {
        int [] Prime_Num = konverzia.Convertion_P();

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> outputArray = new ArrayList<>();

        // Priradí prvočísla a ich počet do listu a mapy
        for (int current : Prime_Num) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            outputArray.add(current);
        }

        // Porovný mapu podľa hodnoty
        SortComparator comp = new SortComparator(map);

        // Zoradí mapu podľa výskytu
        outputArray.sort(comp);

       return outputArray;
    }

    public static void Freq() throws Exception
    {

        int []freq_num = konverzia.Convertion_F();

        // Priradí k jednotlivým prvočíslam ich početnosť a zmaže duplicity
        for(int i=0;i<freq_num.length;i++)
        {
            int count=1;
            for(int j=i+1;j<=freq_num.length-1;j++)
            {
                if(freq_num[i]==freq_num[j] && freq_num[i]!='\0')
                {
                    count++;
                    freq_num[j] = '\0';
                }
            }
            if(freq_num[i]!='\0')
            {
                // Výsledné hodnoty priradí do stringu a následne zapíše do súboru "Prvocisla.txt"
                String str = freq_num[i] + "  " + count +"\n";

                FileWriter writer = new FileWriter("Pocetnost.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);

                bufferedWriter.write(str);

                bufferedWriter.close();
            }
        }
    }
}

// Implementácia Comparator Interface na triedenie hodnôt
class SortComparator implements Comparator<Integer> {
    private final Map<Integer, Integer> freqMap;

    // Priradí špecifikovanú mapu
    SortComparator(Map<Integer, Integer> tFreqMap)
    {
        this.freqMap = tFreqMap;
    }

    // Porovná hodnoty ...
    @Override
    public int compare(Integer k1, Integer k2)
    {

        // ... podľa frekvencie
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));

        // Porovná hodnoty ak je frekvencia ich výskytu rovnaká
        int valueCompare = k1.compareTo(k2);

        // Porovnáva podľa hodnoty
        if (freqCompare == 0)
            return valueCompare;
        // Porovná podľa frekvencie
        else
            return freqCompare;
    }
}
