package ss16_io_text_file.bai_tap.coppy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFile(String pathFile) {
        List<String> listString = new ArrayList<>();

        try {
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                listString.add(line);
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("đường dẫn bị lỗi!!!");
        }
        return listString;
    }

    public static void writeFile(String pathFile, List<String> strings) {
        try {
            FileWriter fw = new FileWriter(pathFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String st : strings) {
                bw.write(st);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("copy ko thành công!!!");
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
             readFile("src/ss16_io_text_file/bai_tap/coppy_file/source_file.text");
        writeFile("src/ss16_io_text_file/bai_tap/coppy_file/target_file.txt", stringList);

    }
}
