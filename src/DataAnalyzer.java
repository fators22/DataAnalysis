// DataAnalyzer.java
import java.util.ArrayList;

public class DataAnalyzer {
    public ArrayList<Country> getCountryInternet() {
        ArrayList<Country> list = new ArrayList<>();
        list.add(new Country("USA",     92.5));
        list.add(new Country("Brazil",  74.3));
        list.add(new Country("India",   43.0));
        list.add(new Country("Germany", 89.7));
        list.add(new Country("Nigeria", 36.1));
        list.add(new Country("Japan",   93.2));
        return list;
    }
}