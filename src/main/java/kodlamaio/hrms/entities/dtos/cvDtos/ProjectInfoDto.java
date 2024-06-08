package kodlamaio.hrms.entities.dtos.cvDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectInfoDto {
    private String projectName;
    private String description;
    private int startYear;
    private Integer endYear;
}