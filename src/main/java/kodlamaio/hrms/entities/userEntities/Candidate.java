package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "candidates")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public
class Candidate extends User {

    @Column(name = "first_name",nullable = false)
    @NotBlank(message = "İsim alanı boş bırakılamaz!")

    private String firstName;

    @Column(name = "last_name",nullable = false)
    @NotBlank(message = "Soy isim alanı boş bırakılamaz!")

    private String lastName;

    @Column(name = "identity_no",nullable = false,unique = true)
    @NotBlank(message = "TC kimlik numarası alanı boş bırakılamaz!")

    private int identityNo;

    @Column(name = "birth_year",nullable = false)
    @NotBlank(message = "Doğum yılı alanı boş bırakılamaz!")

    private int birthYear;

//    @OneToOne()
//    @JoinColumn(name="user_id")
//    private User user;
}
