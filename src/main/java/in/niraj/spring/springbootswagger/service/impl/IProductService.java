package in.niraj.spring.springbootswagger.service.impl;

import in.niraj.spring.springbootswagger.domain.Product;

import java.util.List;

/**
 * created by niraj on Sep, 2018
 */
public interface IProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
