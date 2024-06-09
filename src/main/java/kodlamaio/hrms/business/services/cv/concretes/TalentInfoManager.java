package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.TalentInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.TalentInfoDao;
import kodlamaio.hrms.entities.cvEntities.Talent;
import kodlamaio.hrms.entities.dtos.cvDtos.TalentInfoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TalentInfoManager implements TalentInfoService {

    private final TalentInfoDao talentInfoDao;
    private final ModelMapper modelMapper;
    @Autowired
    public TalentInfoManager( TalentInfoDao talentInfoDao, ModelMapper modelMapper ) {
        this.talentInfoDao = talentInfoDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public DataResult<List<Talent>> getAllByCandidateId( Long candidateId) {
        List<Talent> result = talentInfoDao.findAllByCandidateId(candidateId);
        return new SuccessDataResult<>(result, "Adayın yetenek bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<Talent> add( Talent talentInfo) {
        Talent result = talentInfoDao.save(talentInfo);
        return new SuccessDataResult<>(result, "Yetenek bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<Talent> update( Talent talentInfo) {
        Talent result = talentInfoDao.save(talentInfo);
        return new SuccessDataResult<>(result, "Yetenek bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        talentInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Yetenek bilgisi başarıyla silindi.");
    }

    @Override
    public DataResult<List<TalentInfoDto>> getAllDtosByCandidateId(Long candidateId) {
        List<Talent> talentInfos = talentInfoDao.findAllByCandidateId(candidateId);
        List<TalentInfoDto> talentInfoDtos = talentInfos.stream()
                .map(talentInfo -> modelMapper.map(talentInfo, TalentInfoDto.class))
                .collect(Collectors.toList());
        return new SuccessDataResult<>(talentInfoDtos, "Talent infos listed successfully");
    }



}