package es.tiernogalvan.sportcenters.repositories;

import es.tiernogalvan.sportcenters.models.SportCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SportCenterRepository extends JpaRepository<SportCenter, String> {
    List<SportCenter> findSportCentersByCapacityBetween(int min, int max);

}
