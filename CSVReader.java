package PBL_Earthquake;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//project by 149

public class CSVReader {
    private String filePath;

    public CSVReader(String filePath) {
        this.filePath = filePath;
    }
    //project by 149

    public List<Earthquake_Data> readData() {
        List<Earthquake_Data> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;  // Skip the header line
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                //project by 149
                String[] values = line.split(",");
                if (values.length == 3) {
                    int year = Integer.parseInt(values[0]);
                    String country = values[1];
                    double magnitude = Double.parseDouble(values[2]);

                    Earthquake_Data data = new Earthquake_Data(year, country, magnitude);
                    dataList.add(data);
                }
                //project by 149
            }
            //project by 149
        } catch (IOException e) {
            e.printStackTrace();
        }
        //project by 149
        return dataList;
    }
    //project by 149
}
