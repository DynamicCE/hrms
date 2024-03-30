package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "employees")
public
class Employee extends User {

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "identity_no",nullable = false,unique = true)
    private int identityNo;

    @Column(name = "birth_year",nullable = false)
    private int birthYear;
}
