package PBL_Earthquake;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
//project by 149

public class Main {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("data.csv");
        List<Earthquake_Data> dataList = csvReader.readData();

        while (true){
            System.out.println("\n\n");
            System.out.println("1. Biggest Earthquakes between 2009 to 2013.");
            System.out.println("2. Recent 5 Earthquakes from Each Country.");
            System.out.println("3. Most Recent Earthquakes above 6 Magnitude.");
            System.out.println("4. Exit \n");

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Number : ");

            switch (scan.next()){
                case "1" -> {

                    Problem_1 Problem_1 = new Problem_1();
                    Problem_1.findLargestEarthquakes(dataList);
                    Problem_1.displayLargestEarthquakes();
                }
                //project by 149
                case "2" -> {

                    Problem_2 Problem_2 = new Problem_2();
                    Problem_2.findRecentEarthquakes(dataList);
                    Problem_2.displayRecentEarthquakes();
                }
                //project by 149
                case "3" -> {

                    Problem_2 Problem_2 = new Problem_2();
                    Problem_2.findRecentEarthquakes(dataList);
                    HashMap<String, LinkedStack> countryStackMap = Problem_2.getCountryStackMap();

                    List<LinkedStack> countryStacks = new ArrayList<>(countryStackMap.values());

                    Problem_3 Problem_3 = new Problem_3();
                    Problem_3.findMostRecentEarthquakesAboveMagnitude(countryStacks);
                    Problem_3.displayMostRecentEarthquakesAboveMagnitude();
                }
                //project by 149
                case "4" -> System.exit(0);
            }
        }
        //project by 149
    }
}
//project by 149