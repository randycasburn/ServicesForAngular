package com.fidelity.servicesforangular.endpoints;


import com.fidelity.servicesforangular.models.Car;
import com.fidelity.servicesforangular.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    CarRepository repo;

    @GetMapping
    public List<Car> getCars(@RequestParam(defaultValue = "") String filter, @RequestParam(required = false) Integer count ) {
        int limit = count != null? count : 0;
        return repo.getCars(filter, limit);
    }
}
