package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.entities.systemProfileEntities.ProgrammingTechnology;

import java.util.List;

public interface ProgrammingTechnologyService {
    List<ProgrammingTechnology> getAll();
    ProgrammingTechnology add(ProgrammingTechnology programmingTechnology);
    ProgrammingTechnology update(ProgrammingTechnology programmingTechnology);
    void delete(Long id);
}
