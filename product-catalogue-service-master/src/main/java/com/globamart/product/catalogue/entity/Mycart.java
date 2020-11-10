package com.globamart.product.catalogue.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/*@EmbeddedId
@Entity*/
public class Mycart {

    Product product;

    int cartCount;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }

    @Override
    public String toString() {
        return "Mycart{" +
                "product=" + product +
                ", cartCount=" + cartCount +
                '}';
    }
}
