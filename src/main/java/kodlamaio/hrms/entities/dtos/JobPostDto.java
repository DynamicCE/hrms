package kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public
class JobPostDto {
    private String jobTitle;
    private String jobDescription;
    private String companyName;
    private String city;
    private Double minSalary;
    private Double maxSalary;
    private Integer openPositions;
    private LocalDate applicationDeadline;
    private LocalDate postedDate;
}
