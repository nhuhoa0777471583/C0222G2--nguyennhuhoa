package crudtaosan.common.readwrite;

import crudtaosan.model.DienThoaiChinhHang;
import crudtaosan.model.DienThoaiXachTay;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {

    public static final String DATA_DIEN_THOAI_CHINH_HANG = "src/crudtaosan/data/dien_thoai_chinh_hang.csv";
    public static final String DATA_DIEN_THOAI_XACH_TAY = "src/crudtaosan/data/dien_thoai_xach_tay.csv";

    public static List<String> readAll(String pathFile, boolean flag) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<DienThoaiChinhHang> readDienThoaiChinhHang(){
        List<String> stringList= readAll(DATA_DIEN_THOAI_CHINH_HANG,true);
        List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
        String arr[]=null;
        for (String string: stringList){
            arr=string.split(",");
            dienThoaiChinhHangList.add(new DienThoaiChinhHang(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3]),arr[4],Integer.parseInt(arr[5]),arr[6]));
        }
        return dienThoaiChinhHangList;
    }
    public static List<DienThoaiXachTay> readDienThoaiXachTay(){
        List<String> stringList= readAll(DATA_DIEN_THOAI_XACH_TAY,true);
        List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
        String arr[]=null;
        for (String string: stringList){
            arr=string.split(",");
            dienThoaiXachTayList.add(new DienThoaiXachTay(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3]),arr[4],arr[5],arr[6]));
        }
        return dienThoaiXachTayList;
    }

}
