package kodlamaio.hrms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "employees")
public
class Employees {
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "identity_no")
    private int identityNo;
    @Column(name = "birth_year")
    private int birthYear;
}
