package kodlamaio.hrms.api.controllers.systemConfigurationsControllers;

import kodlamaio.hrms.business.services.systemConfigurations.abstracts.CityService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.systemConfigurationsEntities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cities")
public
class CityController {
    private final
    CityService cityService;
    @Autowired
    public
    CityController ( CityService cityService ) {
        this.cityService = cityService;
    }

    @GetMapping()
    ResponseEntity<DataResult<List<City>>> getAll(){
        DataResult<List<City>> result = cityService.getAll ();
        return ResponseEntity.ok ( result);
    }
}
