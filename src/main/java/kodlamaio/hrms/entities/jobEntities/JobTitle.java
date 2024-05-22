package kodlamaio.hrms.entities.jobEntities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "job_titles")
public
class JobTitle {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;


}
