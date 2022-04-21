package ss16_io_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TimGiaTriLonNhat {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = " ";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("file ko tồn tại");
        }
        return numbers;
    }

    public void writeFile(String filPath, int max) {
        try {
            FileWriter writer = new FileWriter(filPath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("gia tri lon nhat: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMAx(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadWriteFile readWriteFile =new ReadWriteFile();
        List<Integer> numbers= readWriteFile.readFile("numbers.txt");
        int maxValue=findMAx(numbers);
        readWriteFile.writeFile("result.txt",maxValue);
    }

}
