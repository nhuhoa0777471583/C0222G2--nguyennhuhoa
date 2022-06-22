package crudtaosan.service.impl;

import crudtaosan.common.readwrite.Read;
import crudtaosan.model.DienThoaiChinhHang;
import crudtaosan.model.DienThoaiXachTay;

import java.util.ArrayList;
import java.util.List;

public class IPhoneServes {
    private static List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
    private static List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();

    public static Integer addId(){
        dienThoaiXachTayList = Read.readDienThoaiXachTay();
        dienThoaiChinhHangList = Read.readDienThoaiChinhHang();
        Integer id = 0;
        for(DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList){
            if(dienThoaiChinhHang.getId()>id){
                id = dienThoaiChinhHang.getId();
            }
        }
        for(DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList){
            if(dienThoaiXachTay.getId()>id){
                id = dienThoaiXachTay.getId();
            }
        }
        return ++id;
    }
}
