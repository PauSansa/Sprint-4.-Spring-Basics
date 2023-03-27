package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain.Fruita;

import java.util.List;
import java.util.Optional;

public interface IFruitaService {
    List<Fruita> getAll();
    Optional<Fruita> getOne(int id);
    int save(Fruita f);
    void delete(int Id);


}
