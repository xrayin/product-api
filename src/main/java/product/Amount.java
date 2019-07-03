package product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Entity
public class Amount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double price;

    @JsonIgnore
    @OneToMany(mappedBy = "currentPrice")
    private List<Product> product;

    public Amount() {
    }

    public Amount(double price) {
        this.price = price;
    }

    public Amount(double price, List<Product> product) {
        this.price = price;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
