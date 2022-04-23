package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        List<Integer> numbers = readWriteFile.readFile("src/ss16_io_text_file/thuc_hanh/tim_gia_tri_lon_nhat_va_ghi_file/numbers.txt");
        int maxValue = findMax(numbers);
        readWriteFile.writeFile("src/ss16_io_text_file/thuc_hanh/tim_gia_tri_lon_nhat_va_ghi_file/result.txt", maxValue);
    }
}
