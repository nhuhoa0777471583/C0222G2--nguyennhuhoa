package ss16_io_text_file.bai_tap.coppy_file;

import java.io.*;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readLine(String pathFile) {

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("error!!");
        }
    }

    public void writeFile(String filePath, StringBuilder text) {
        try {
            FileWriter write = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(write);
            bufferedWriter.write(String.valueOf(text));
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap duong dan: ");
        String path = scanner.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        readAndWriteFile.readLine(path);


//        StringBuilder lines = new StringBuilder();
//        readAndWriteFile.writeFile("src/ss16_io_text_file/bai_tap/coppy_file/copyfile.text",lines);
    }


}
