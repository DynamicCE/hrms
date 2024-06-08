package kodlamaio.hrms.entities.dtos.cvDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageInfoDto {
    private String language;
    private int level;
}