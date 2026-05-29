package internship.fullstack.shecan.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="form")
public class Form {
    @Id
    @Column(name="email", nullable = false,unique = false)
    private String email;

    @Column(name="name", nullable = false)
    private String name;



    @Column(name="message", nullable = false)
    private String message;

}
