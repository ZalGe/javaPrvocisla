package map.cisla;

import java.util.*;

public class uprava
{
    public static List<Integer> Sort()
    {
        /*Vector<Integer> l = citanie.Read_P();
        Integer [] PrimeNum = new Integer[l.size()];
        l.toArray(PrimeNum);
         */
        int [] Prime_Num = konverzia.Convertion_P();

        //Arrays.sort(Prime_Num);

        /*LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(PrimeNum));
        Integer[] Prime_Num = linkedHashSet.toArray(new Integer[]{});
        System.out.println(Arrays.toString(Prime_Num));


         */
/*
        int count =0;

        for(int i=0;i<Prime_Num.length;i++)
        {
            count=1;
            for(int j=i+1;j<=Prime_Num.length-1;j++)
            {
                if(Prime_Num[i]==Prime_Num[j] && Prime_Num[i]!='\0')
                {
                    count++;
                    Prime_Num[j] = '\0';
                }
            }
            if(Prime_Num[i]!='\0')
            {
                System.out.println(Prime_Num[i] + "     " + count);
            }
        }
        return Prime_Num;*/
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> outputArray = new ArrayList<>();

        // Assign elements and their count in the list and map
        for (int current : Prime_Num) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            outputArray.add(current);
        }

        // Compare the map by value
        SortComparator comp = new SortComparator(map);

        // Sort the map using Collections CLass
        Collections.sort(outputArray, comp);

        // Final Output
       /* for (Integer i : outputArray) {
            System.out.print(i + " ");
        }*/
       return outputArray;
    }

    public static Integer[] Clear()
    {
        List<Integer> cisla = uprava.Sort();
        Integer [] Ccisla = new Integer[cisla.size()];
        cisla.toArray(Ccisla);

        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(Ccisla));
        Integer[] Prime_Num = linkedHashSet.toArray(new Integer[]{});
        //System.out.println(Arrays.toString(Prime_Num));
        return Prime_Num;
    }

    public static Vector<Integer> Freq()
    {
        Vector<Integer> b = new Vector<Integer>();
        int []freq_num = konverzia.Convertion_F();
        //System.out.println(Arrays.toString(freq_num));

        int count =0;

        for(int i=0;i<freq_num.length;i++)
        {
            count=1;
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
                b.add(count);
                //System.out.println(freq_num[i] + "     " + count);
            }
        }
        System.out.println(b);
        return b;
    }
}

// Implement Comparator Interface to sort the values
class SortComparator implements Comparator<Integer> {
    private final Map<Integer, Integer> freqMap;

    // Assign the specified map
    SortComparator(Map<Integer, Integer> tFreqMap)
    {
        this.freqMap = tFreqMap;
    }

    // Compare the values
    @Override
    public int compare(Integer k1, Integer k2)
    {

        // Compare value by frequency
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));

        // Compare value if frequency is equal
        int valueCompare = k1.compareTo(k2);

        // If frequency is equal, then just compare by value, otherwise -
        // compare by the frequency.
        if (freqCompare == 0)
            return valueCompare;
        else
            return freqCompare;
    }
}
