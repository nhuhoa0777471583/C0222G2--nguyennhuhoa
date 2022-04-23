package ss16_io_text_file.bai_tap.doc_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src/ss16_io_text_file/bai_tap/doc_file/file_doc.txt"));

            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitsData = csvLine.split(";");
            for (int i = 0; i < splitsData.length; i++) {
                result.add(splitsData[i]);
            }
        }
        return result;
    }

    public static void printCountry(List<String> country) {
        System.out.println("Country: id=" + country.get(0) + ","
                + "code: " + country.get(1) + ","
                + "name: " + country.get(2));
    }
}
