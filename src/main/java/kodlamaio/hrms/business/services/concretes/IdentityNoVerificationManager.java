package kodlamaio.hrms.business.services.concretes;

import kodlamaio.hrms.business.services.abstracts.IdentityNoVerificationService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;

public class IdentityNoVerificationManager implements IdentityNoVerificationService{

    private CandidateDao candidateDao;

    public
    IdentityNoVerificationManager ( CandidateDao candidateDao ) {
        this.candidateDao = candidateDao;
    }

    @Override
    public boolean checkIdentityNo(int identityNo) {
        return candidateDao.existsByIdentityNo ( identityNo);
    }

}
