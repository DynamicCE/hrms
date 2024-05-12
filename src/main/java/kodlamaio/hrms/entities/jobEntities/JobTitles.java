package kodlamaio.hrms.entities.jobEntities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "job_titles")
public
class JobTitles {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;


}
