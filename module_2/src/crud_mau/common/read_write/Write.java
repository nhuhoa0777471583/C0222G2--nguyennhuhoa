package crud_mau.common.read_write;

import crud_mau.model.CGV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write {

    public static void writeAll(List<String> stringList, String pathFile, boolean flag){
        try {
            FileWriter fw = new FileWriter(pathFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String str: stringList){
               bw.write(str);
               bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeSuatChieu(List<CGV> cgvList, boolean flag){
        List<String> stringList = new ArrayList<>();
        for (CGV cgv : cgvList){
            stringList.add(cgv.toInfoCinema());
        }
        writeAll(stringList,"src/crud_mau/common/data/suat_chieu.csv",flag);
    }



}
