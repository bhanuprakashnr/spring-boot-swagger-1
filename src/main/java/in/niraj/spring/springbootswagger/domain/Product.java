package in.niraj.spring.springbootswagger.domain;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class Product {

    @ApiModelProperty(notes = "The  product ID")
    private Integer productId;

    @ApiModelProperty(notes = "The product name")
    private String productName;

    @ApiModelProperty(notes = "The product description")
    private String description;

    @ApiModelProperty(notes = "The image URL of the product")
    private String imageUrl;

    @ApiModelProperty(notes = "The price of the product", required = true)
    private BigDecimal price;

    public Product(Integer productId, String productName, String description, String imageUrl, BigDecimal price) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}