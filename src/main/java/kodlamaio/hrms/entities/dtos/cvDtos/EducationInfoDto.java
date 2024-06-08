package kodlamaio.hrms.entities.dtos.cvDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationInfoDto {
    private String schoolName;
    private String department;
    private int startYear;
    private Integer graduationYear;
    private String schoolStatus;
}