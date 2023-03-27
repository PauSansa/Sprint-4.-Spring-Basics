package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain.Fruita;
import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.repository.IFruita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitaService implements IFruitaService{

    @Autowired
    private IFruita data;

    @Override
    public List<Fruita> getAll() {
        return (List<Fruita>) data.findAll();
    }

    @Override
    public Optional<Fruita> getOne(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Fruita f) {
        int res = 0;
        Fruita fruita = data.save(f);
        if(!fruita.equals(null)){
            res= 1;
        }
        return res;
    }

    @Override
    public void delete(int Id) {
        data.deleteById(Id);
    }
}
