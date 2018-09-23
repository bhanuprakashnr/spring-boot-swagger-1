package in.niraj.spring.springbootswagger.service.impl;

import in.niraj.spring.springbootswagger.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {


    private static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "first product", "first product description", "anyUrl", BigDecimal.ONE));
        productMap.put(2, new Product(2, "second product", "second product description", "anyUrl", BigDecimal.TEN));
        productMap.put(3, new Product(3, "third product", "third product description", "anyUrl", BigDecimal.valueOf(1000l)));


    }


    @Override
    public List<Product> listAllProducts() {
        return productMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public Product getProductById(Integer id) {
        return productMap.get(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productMap.put(product.getProductId(), product);
    }


    @Override
    public void deleteProduct(Integer id) {
        productMap.remove(id);
    }
}