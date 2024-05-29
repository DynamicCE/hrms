package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
public
class Employee extends User {

    @Column(name = "first_name",nullable = false)
    @NotBlank(message = "İsim alanı boş bırakılamaz!")
    private String firstName;

    @Column(name = "last_name",nullable = false)
    @NotBlank(message = "Soy isim alanı boş bırakılamaz!")
    private String lastName;

    @Column(name = "identity_no",nullable = false,unique = true)
    @NotBlank(message = "tcNo alanı boş bırakılamaz!")
    private int identityNo;

    @Column(name = "birth_year",nullable = false)
    private int birthYear;

//    @OneToOne
//    @JoinColumn(name="user_id")
//    private User user;
}
