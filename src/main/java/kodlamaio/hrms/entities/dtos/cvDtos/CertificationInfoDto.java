package kodlamaio.hrms.entities.dtos.cvDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationInfoDto {
    private String name;
    private String description;
    private String issueDate;
    private String expirationDate;
}