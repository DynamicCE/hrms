package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employers")  
public
class Employer extends User {

    @Column(name = "company_name")
    private String companyName;
    @Column(name = "website")
    private String website;
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne()
    @JoinColumn(name="user_id")
    private User user;
}
