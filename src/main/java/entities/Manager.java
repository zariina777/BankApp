package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "managers")
public class Manager {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private UUID id;

     @Column(name = "first_name")
     private String firstName;

     @Column(name = "last_name")
     private String lastName;

     @Column(name = "date_of_birth")
     private Date dateOfBirth;

     @Column(name = "gender")
     private String gender;

     @Column(name = "address")
     private String address;

     @Column(name = "phone_number")
     private String phoneNumber;

     @Column(name = "email")
     private String email;

     @OneToMany(mappedBy = "manager")
     private List<Customer> customers;

     @ManyToMany
     @JoinTable(name = "manager_product",
             joinColumns = @JoinColumn(name = "manager_id"),
             inverseJoinColumns = @JoinColumn(name = "product_id"))
     private List<Product> products;





}
