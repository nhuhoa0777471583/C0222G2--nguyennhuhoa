package repository;

import model.MatBang;

import java.util.List;

public interface IMatBangRepository {
    List<MatBang> getAll();
    void delete(Integer id);
    MatBang findById (Integer id);
//    List<MatBang> search()


}
