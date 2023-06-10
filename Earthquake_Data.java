package PBL_Earthquake;

public class Earthquake_Data {
    private int year;
    private String country;
    private double magnitude;

    public Earthquake_Data(int year, String country, double magnitude) {
        this.year = year;
        this.country = country;
        this.magnitude = magnitude;
    }
    //project by 149

    public int getYear() {
        return year;
    }
    //project by 149

    public String getCountry() {
        return country;
    }
    //project by 149

    public double getMagnitude() {
        return magnitude;
    }
    //project by 149
}
