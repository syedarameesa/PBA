package PBL_Earthquake;

import java.util.LinkedList;
import java.util.List;

public class Problem_3 {
    private LinkedList<Earthquake_Data> recentEarthquakesList;

    public Problem_3() {
        recentEarthquakesList = new LinkedList<>();
    }
    //project by 149

    public void findMostRecentEarthquakesAboveMagnitude(List<LinkedStack> countryStacks) {
        for (LinkedStack countryStack : countryStacks) {
            while (!countryStack.isEmpty()) {
                Earthquake_Data earthquake = (Earthquake_Data) countryStack.pop();
                if (earthquake.getMagnitude() > 6) {
                    recentEarthquakesList.addFirst(earthquake);
                    break;
                }
                //project by 149
            }
            //project by 149
        }
        //project by 149
    }

    public void displayMostRecentEarthquakesAboveMagnitude() {
        System.out.println("Most recent earthquakes above 6 magnitude:");

        for (Earthquake_Data earthquake : recentEarthquakesList) {
            System.out.println("Year: " + earthquake.getYear() + ", Country: " + earthquake.getCountry() +
                    ", Magnitude: " + earthquake.getMagnitude());
        }
    }
    //project by 149
}
