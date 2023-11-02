package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "balance")
    private double balance;
    @Column(name = "account_type")
    private String accounType;
    @Column(name = "currency")
    private String currency;



    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)  // у одного мэнэжера много продуктов
    private Set<Product> products= new HashSet<>();

    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)  // у одного мэнеджера много клиентовуам
    private Set<Customer> clients= new HashSet<>();

    @OneToOne(mappedBy = "account")
    private Customer customer;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

}
