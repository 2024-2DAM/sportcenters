package es.tiernogalvan.sportcenters.services;

import es.tiernogalvan.sportcenters.models.SportCenter;
import es.tiernogalvan.sportcenters.repositories.SportCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class SportCenterService {
    @Autowired
    private SportCenterRepository repository = null;

    public List<SportCenter> getAll() {
        return repository.findAll();
    }

    public SportCenter getById(String id) {
        //return repository.findById(id).orElse(null);
        //La línea de arriba es lo mismo que estas de abajo:
        Optional<SportCenter> optional = repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    public SportCenter save(SportCenter sportCenter) {
        return repository.save(sportCenter);
    }

    public List<SportCenter> getByCapacity(int min, int max){
        return repository.findSportCentersByCapacityBetween(min, max);
    }
}
