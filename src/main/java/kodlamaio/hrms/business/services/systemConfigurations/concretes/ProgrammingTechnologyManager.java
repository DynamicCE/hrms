package kodlamaio.hrms.business.services.systemConfigurations.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.ProgrammingTechnologyService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.ProgrammingTechnologyDao;
import kodlamaio.hrms.entities.systemConfigurationsEntities.ProgrammingTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingTechnologyManager implements ProgrammingTechnologyService {

    private final ProgrammingTechnologyDao programmingTechnologyDao;

    @Autowired
    public ProgrammingTechnologyManager(ProgrammingTechnologyDao programmingTechnologyDao) {
        this.programmingTechnologyDao = programmingTechnologyDao;
    }

    @Override
    public DataResult<List<ProgrammingTechnology>> getAll() {
        List<ProgrammingTechnology> result = programmingTechnologyDao.findAll();
        return new SuccessDataResult<>(result, "Tüm programlama teknolojileri başarıyla getirildi.");
    }

    @Override
    public DataResult<ProgrammingTechnology> add(ProgrammingTechnology programmingTechnology) {
        ProgrammingTechnology result = programmingTechnologyDao.save(programmingTechnology);
        return new SuccessDataResult<>(result, "Yeni programlama teknolojisi başarıyla eklendi.");
    }

    @Override
    public DataResult<ProgrammingTechnology> update(ProgrammingTechnology programmingTechnology) {
        ProgrammingTechnology result = programmingTechnologyDao.save(programmingTechnology);
        return new SuccessDataResult<>(result, "Programlama teknolojisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        programmingTechnologyDao.deleteById(id);
        return new SuccessDataResult<>(null, "Programlama teknolojisi başarıyla silindi.");
    }
}