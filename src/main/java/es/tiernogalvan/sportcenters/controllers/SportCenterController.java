package es.tiernogalvan.sportcenters.controllers;

import es.tiernogalvan.sportcenters.models.SportCenter;
import es.tiernogalvan.sportcenters.services.SportCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportCenterController {
    @Autowired
    private SportCenterService sportCenterService;

    //- GET /sportcenter: devuelve todos los polideportivos
    @GetMapping("/sportcenter")
    public List<SportCenter> getSportCenters() {
        return sportCenterService.getAll();
    }

    //- GET /sportcenter/{name}: devuelve el polideportivo con ese id
    @GetMapping("/sportcenter/{name}")
    public SportCenter getSportCenter(@PathVariable String name) {
        return sportCenterService.getById(name);
    }

    //- POST /sportcenter: inserta un polideportivo que le pasamos en el cuerpo de la petición HTTP en formato JSON.
    @PostMapping("/sportcenter")
    public SportCenter createSportCenter(@RequestBody SportCenter sportCenter) {
        //Voy a comprobar que no estuviera ya uno con ese nombre:
        if (sportCenterService.getById(sportCenter.getName()) == null) {
            return sportCenterService.save(sportCenter);
        } else {
            return null;
        }
    }

    //PUT /sportcenter/{name}: modifico el polideportivo con ese id con los datos del cuerpo de la petición HTTP.
    //Ejemplo: localhost:3030/sportcenter/ezequiel
    @PutMapping("/sportcenter/{name}")
    public SportCenter updateSportCenter(@PathVariable String name, @RequestBody SportCenter sportCenter) {
        return sportCenterService.update(name, sportCenter);
    }

    //DELETE /sportcenter: necesito la variable de la url id, y elimina ese polideportivo.
    // //Ejemplo: localhost:3030/sportcenter?name=2
    @DeleteMapping("/sportcenter")
    public void deleteSportCenter(@RequestParam String name) {
        sportCenterService.delete(name);
    }

    //- GET /sportcenter/capacity: con variables min y max. EJ: localhost:3030/sportcenter/capacity?min=XX&max=ZZ
    @GetMapping("/sportcenter/capacity")
    public List<SportCenter> getByCapacity(@RequestParam int min, @RequestParam int max){
        return sportCenterService.getByCapacity(min, max);
    }

    //localhost:3030/sportcenter/capacity/min/XX?max=YY
    @GetMapping("/sportcenter/capacity/min/{min}")
    public List<SportCenter> getByCapacityRaro(@PathVariable int min, @RequestParam int max){
        return sportCenterService.getByCapacity(min, max);
    }
}
