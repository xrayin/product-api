package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    private ProductService productService;

    @Autowired
    public App(ProductService productService) {
        this.productService = productService;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     *
     * @param args
     * @throws Exception
     * With this method the Database for the table Product and Amount get prepopulated with data.
     * In order to run a GET request with a REST client, without having to POST data.
     */
    @Override
    public void run(String... args) throws Exception {

        this.productService.addProduct(new Product("ProductOne", new Amount(10)));
        this.productService.addProduct(new Product("ProductTwo", new Amount(279)));
        this.productService.addProduct(new Product("ProductThree", new Amount(587)));
    }
}