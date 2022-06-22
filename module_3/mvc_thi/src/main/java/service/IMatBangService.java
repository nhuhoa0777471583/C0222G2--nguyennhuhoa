package service;

import model.MatBang;

import java.util.List;

public interface IMatBangService {
    List<MatBang> getAll();
    void save(MatBang matBang);
    void delete(String id);

}
