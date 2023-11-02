package entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agreements")
public class Agreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "balance")
    private double balance;

    @Column(name = "account_type")
    private String account_type;

    @Column(name = "currency")
    private String currency;

    @ManyToMany
    @JoinTable(name = "agreement_product",
            joinColumns = @JoinColumn(name = "agreement_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;

    public Agreement orElse(Object o) {
        return null;
    }
}
