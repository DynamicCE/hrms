package kodlamaio.hrms.entities.dtos.cvDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateCvDto {
    private String firstName;
    private String lastName;
    private String email;
    private List<EducationInfoDto> educationInfos;
    private List<ExperienceInfoDto> experienceInfos;
    private List<LanguageInfoDto> languageInfos;
    private List<ProjectInfoDto> projectInfos;
    private List<TalentInfoDto> talentInfos;
    private List<CoverLetterInfoDto> coverLetterInfos;
    private ImageInfoDto imageInfo;
}