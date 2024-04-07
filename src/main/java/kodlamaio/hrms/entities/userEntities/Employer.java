package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employers")  
public
class Employer extends User {

    @Column(name = "company_name",nullable = false,unique = true)
    private String companyName;
    @Column(name = "website",unique = true)
    private String website;
    @Column(name = "phone_number",nullable = false,unique = true)
    private String phoneNumber;

    
}
