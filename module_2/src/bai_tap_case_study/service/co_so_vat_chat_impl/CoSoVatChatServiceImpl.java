package bai_tap_case_study.service.co_so_vat_chat_impl;

import bai_tap_case_study.common.validate.ValidateAll;
import bai_tap_case_study.model.co_so_vat_chat.House;
import bai_tap_case_study.model.co_so_vat_chat.Room;
import bai_tap_case_study.model.co_so_vat_chat.Villa;
import bai_tap_case_study.service.interf.i_co_so_vat_chat.ICoSoVatChatService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CoSoVatChatServiceImpl implements ICoSoVatChatService {

    static {
    }
    @Override
    public void displayCoSo() {
        new HouseService().dislayHouse();
        new VillaService().displayVilla();
        new RoomService().displayRoom();
    }

    @Override
    public void displayBaoTri() {

    }
}
