package crudtaosan.common.readwrite;

import crudtaosan.model.DienThoaiChinhHang;
import crudtaosan.model.DienThoaiXachTay;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write {
    public static final String DATA_DIEN_THOAI_CHINH_HANG = "src/crudtaosan/data/dien_thoai_chinh_hang.csv";
    public static final String DATA_DIEN_THOAI_XACH_TAY = "src/crudtaosan/data/dien_thoai_xach_tay.csv";

    public static void writeAll(List<String> stringList, String pathFile, boolean flag) {
        try {
            FileWriter fw = new FileWriter(pathFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String str : stringList) {
                bw.write(str);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDienThoaiXachTay(List<DienThoaiXachTay> dienThoaiXachTayList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
            stringList.add(dienThoaiXachTay.getInfoDienThoaiXachTay());
        }
        writeAll(stringList, DATA_DIEN_THOAI_XACH_TAY, flag);
    }

    public static void writeDienThoaiChinhHang(List<DienThoaiChinhHang> dienThoaiChinhHangList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
            stringList.add(dienThoaiChinhHang.getInfoDienThoaiChinhHang());
        }
        writeAll(stringList, DATA_DIEN_THOAI_CHINH_HANG, flag);
    }

}
