package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     *
     * @return catches all GET requests for the URL '/products' and returns a List of products in JSON.
     */
    @GetMapping("/products")
    public List<Product> getAllTopics() {

        return productService.getAllProducts();
    }

    /**
     *
     * @param product
     * catches all POST requests for the URL '/products' and saves them to the Database.
     */
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {

        productService.addProduct(product);
    }
}