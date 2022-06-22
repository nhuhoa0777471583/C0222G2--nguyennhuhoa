package repository;

import model.MatBang;

import java.util.List;

public interface IMatBangRepository {
    List<MatBang> getAll();
    void delete(String id);
    MatBang findById (Integer id);
    void save(MatBang matBang);
//    List<MatBang> search()


}
