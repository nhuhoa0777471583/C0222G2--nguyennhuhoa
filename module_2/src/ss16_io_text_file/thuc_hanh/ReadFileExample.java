package ss16_io_text_file.thuc_hanh;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TinhTongTrongFileText {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter br = new BufferedWriter(new FileReader(file));
            String line = " ";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

        } catch (Exception e) {
            System.err.println("File lỗi ");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhap duong dan file: ");
        Scanner scanner=new Scanner(System.in);
        String path= scanner.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
