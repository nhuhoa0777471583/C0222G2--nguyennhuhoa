package ss16_io_text_file.bai_tap.doc1_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCountry {
    public static void main(String[] args) {
        List<Country> countrys = new ArrayList<>();
        countrys.add(new Country(1, "HL", "Hà Lan"));
        countrys.add(new Country(2, "VN", "Việt Nam"));
        countrys.add(new Country(3, "TQ", "Trung Quốc"));

        for (Country cou : countrys) {
            System.out.println(cou);
        }
        //phương thức writeCountry này viết dữ liệu trong main ra file
        writeCountry(countrys);//phải truyền tham số vào vì nó viết từ những dữ liệu đc tạo sẵn

        // phương thức readCountry này đọc dữ liệu từ file,
        // mà file thì đc writeCountry viết từ những dữ liệu nhập vào và đc add vào Country
        readCountry();//ko cần tham số truyền vào trong () vì nó đọc từ file qua
    }

    public static List<Country> readCountry() {
        List<Country> countries = new ArrayList<>();
        try {
            FileReader fr = new FileReader("src/ss16_io_text_file/bai_tap/doc1_file/doc_file.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            //đọc từng dòng(br.readLine) của file rồi gán cho line và ktra coi dòng nào có rỗng ko
            while ((line = br.readLine()) != null) {
                //tách chuỗi line dựa trên dấu(,)
                //rồi gán vào mảng
                String[] splitLine = line.split(",");
                //thêm các thuộc tính vào object thì nó đang hiểu là string nên phải parseInt để chuyển string thành kiểu số
                countries.add(new Country(Integer.parseInt(splitLine[0]), splitLine[1], splitLine[2]));
            }
            br.close();

        } catch (Exception e) {
            System.out.println("đường dẫn lỗi rồi!!");
        }
        return countries;
    }

    public static void writeCountry(List<Country> countryList) {
        try {
            FileWriter fw = new FileWriter("src/ss16_io_text_file/bai_tap/doc1_file/doc_file.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Country country : countryList) {
                bw.write(country.properties());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
