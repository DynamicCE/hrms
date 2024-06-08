package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.CoverLetterInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.CoverLetterInfoDao;
import kodlamaio.hrms.entities.cvEntities.CoverLetterInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.CoverLetterInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverLetterInfoManager implements CoverLetterInfoService {

    private final CoverLetterInfoDao coverLetterInfoDao;

    @Autowired
    public CoverLetterInfoManager(CoverLetterInfoDao coverLetterInfoDao) {
        this.coverLetterInfoDao = coverLetterInfoDao;
    }

    @Override
    public DataResult<List<CoverLetterInfo>> getAll() {
        List<CoverLetterInfo> result = coverLetterInfoDao.findAll();
        return new SuccessDataResult<>(result, "Tüm ön yazı bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<CoverLetterInfo> add(CoverLetterInfo coverLetterInfo) {
        CoverLetterInfo result = coverLetterInfoDao.save(coverLetterInfo);
        return new SuccessDataResult<>(result, "Ön yazı bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<CoverLetterInfo> update(CoverLetterInfo coverLetterInfo) {
        CoverLetterInfo result = coverLetterInfoDao.save(coverLetterInfo);
        return new SuccessDataResult<>(result, "Ön yazı bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        coverLetterInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Ön yazı bilgisi başarıyla silindi.");
    }

    @Override
    public
    DataResult<List<CoverLetterInfoDto>> getAllDtosByCandidateId ( Long candidateId ) {
        return null;
    }
}