package kodlamaio.hrms.api.controllers.commonControllers;

import kodlamaio.hrms.business.services.common.abstracts.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cities")
public
class CityController {
    private
    CityService cityService;
    @Autowired
    public
    CityController ( CityService cityService ) {
        this.cityService = cityService;
    }
}
