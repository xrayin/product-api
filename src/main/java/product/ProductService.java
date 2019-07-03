package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     *
     * @return all products currently available in the database.
     */
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    /**
     *
     * @param product
     */
    public void addProduct(Product product) {

        productRepository.save(product);
    }
}
