package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.ProgrammingTechnologyService;
import kodlamaio.hrms.dataAccess.cvDao.ProgrammingTechnologyDao;
import kodlamaio.hrms.entities.systemConfigurationsEntities.ProgrammingTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingTechnologyManager implements ProgrammingTechnologyService {

    private ProgrammingTechnologyDao programmingTechnologyDao;

    @Autowired
    public ProgrammingTechnologyManager(ProgrammingTechnologyDao programmingTechnologyDao) {
        this.programmingTechnologyDao = programmingTechnologyDao;
    }

    @Override
    public List<ProgrammingTechnology> getAll() {
        return programmingTechnologyDao.findAll();
    }

    @Override
    public ProgrammingTechnology add(ProgrammingTechnology programmingTechnology) {
        return programmingTechnologyDao.save(programmingTechnology);
    }

    @Override
    public ProgrammingTechnology update(ProgrammingTechnology programmingTechnology) {
        return programmingTechnologyDao.save(programmingTechnology);
    }

    @Override
    public void delete(Long id) {
        programmingTechnologyDao.deleteById(id);
    }
}