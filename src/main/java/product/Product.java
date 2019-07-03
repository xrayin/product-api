package product;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Amount currentPrice;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp lastUpdate;

    public Product() {

    }

    public Product(String name, Amount currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public Product(String name, Amount currentPrice, Timestamp lastUpdate) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Amount currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}