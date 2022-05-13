package crud_mau.common.read_write;

import crud_mau.model.CGV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {

    public static List<String> readAll(String pathFile, boolean flag){
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fr = new FileReader("src/crud_mau/common/data/suat_chieu.csv");
            BufferedReader br = new BufferedReader(fr);
            String line= null;
           while ((line=br.readLine())!=null){
               stringList.add(line);
           }
           fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<CGV> readSuatChieu(){
        List<String> listString = readAll("src/crud_mau/common/data/suat_chieu.csv",false);
        List<CGV> cgvList = new ArrayList<>();
        String[]arr=null;
        for (String str: listString){
            arr=str.split(",");
            cgvList.add(new CGV(arr[0],arr[1],arr[2],arr[3]));
        }
        return cgvList;
    }
}
