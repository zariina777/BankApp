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
@Table(name = "productы")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")                  //идентификатор продукта банка
    private UUID id;

    @Column(name = "product_name")        // Название продукта банка
    private String productName;

    @Column(name = "description")         // Описание продукта
    private String description;

    @Column(name = "interest_rate")       // Процентная ставка по продукту
    private double interestRate;

    @Column(name = "currency")            // Валюта, в которой предоставляется продукт
    private String currency;

    @Column(name = "term_months")         // Срок (в месяцах) действия продукта
    private int termMonths;

    @ManyToMany(mappedBy = "products")
    private List<Agreement> agreements;


}
