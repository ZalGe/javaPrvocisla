package map.cisla;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        zapis.Write_N();                        // Zapíše vygenerované čísla do súboru "Cisla.txt"
        citanie.Read_N();                       // Prečíta údaje zo súboru "Cisla.txt" a uloží ich do vektoru
        konverzia.Convertion_N();               // Prevedie vektor na int pole
        prvocisla.Prime();                      // Zo zadaných údajov vyberie prvočísla
        zapis.Write_P();                        // Zapíše prvočísla do súboru "Prvocisla.txt"
        citanie.Read_P();                       // Prečíta údaje zo súboru "Prvocisla.txt" a uloží ich do vektoru
        konverzia.Convertion_P();               // Prevedie vektor na int pole
        uprava.Sort();                          // Zadané prvočísla zoradí podľa počtu ich výskytu a zapíše do listu
        konverzia.Convertion_F();               // Prevedie list na int pole
        uprava.Freq();                          // Priradí k danému prvočíslu jeho početnosť v poli a zmaže duplicity zapíše do súboru "Pocetnost.txt"
    }
}
