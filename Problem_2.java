package PBL_Earthquake;

import java.util.HashMap;
import java.util.List;
//project by 149

public class Problem_2 {
    private HashMap<String, LinkedStack> countryStackMap;

    public Problem_2() {
        countryStackMap = new HashMap<>();
    }
    //project by 149

    public void findRecentEarthquakes(List<Earthquake_Data> dataList) {
        for (Earthquake_Data data : dataList) {
            String country = data.getCountry();
            LinkedStack countryStack = countryStackMap.getOrDefault(country, new LinkedStack());

            if (countryStack.size() < 5) {
                countryStack.push(data);
            } else {
                countryStack.pop();
                countryStack.push(data);
            }
            //project by 149

            countryStackMap.put(country, countryStack);
        }
        //project by 149
    }

    public void displayRecentEarthquakes() {
        System.out.println("Recent 5 earthquakes from each country:");

        for (String country : countryStackMap.keySet()) {
            LinkedStack countryStack = countryStackMap.get(country);

            System.out.println("Country: " + country);
            while (!countryStack.isEmpty()) {
                Earthquake_Data earthquake = (Earthquake_Data) countryStack.pop();
                System.out.println("Year: " + earthquake.getYear() + ", Magnitude: " + earthquake.getMagnitude());
            }
            //project by 149
            System.out.println();
        }
    }
    //project by 149

    public HashMap<String, LinkedStack> getCountryStackMap() {
        return countryStackMap;
    }
}
//project by 149