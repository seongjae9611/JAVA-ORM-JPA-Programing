package hellojpa.jpql;

import jakarta.persistence.*;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    private Long id;
    private int orderAmount;
    @Embedded
    private Adress adress;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
}
