package com.foodrunner.app.entities;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private String paymentStatus;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    // getters and setters
}
