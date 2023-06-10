package PBL_Earthquake;

import java.util.List;
//project by 149

public class Problem_1 {
    private LinkedQueue earthquakeQueue;

    public Problem_1() {
        earthquakeQueue = new LinkedQueue();
    }
    //project by 149

    public void findLargestEarthquakes(List<Earthquake_Data> dataList) {
        int startYear = 2009;
        int endYear = 2013;

        for (int year = startYear; year <= endYear; year++) {
            Earthquake_Data largestEarthquake = null;
            double maxMagnitude = Double.MIN_VALUE;

            for (Earthquake_Data data : dataList) {
                if (data.getYear() == year && data.getMagnitude() > maxMagnitude) {
                    maxMagnitude = data.getMagnitude();
                    largestEarthquake = data;
                }
                //project by 149
            }

            if (largestEarthquake != null) {
                earthquakeQueue.add(largestEarthquake);
            }
        }
        //project by 149
    }

    public void displayLargestEarthquakes() {
        System.out.println("Largest earthquakes between 2009 and 2013:");

        while (!earthquakeQueue.isEmpty()) {
            Earthquake_Data earthquake = (Earthquake_Data) earthquakeQueue.remove();
            System.out.println("Year: " + earthquake.getYear() + ", Magnitude: " + earthquake.getMagnitude() +
                    ", Country: " + earthquake.getCountry());
        }
        //project by 149
    }
}
