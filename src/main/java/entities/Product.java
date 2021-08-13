package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product implements Cloneable{
    private Price price;
    private String model;
    private String company;

    public Product(Price price, String model, String company) {
        this.price = price;
        this.model = model;
        this.company = company;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        Product cloned = (Product)super.clone();
        cloned.setPrice((Price)cloned.getPrice().clone());
        return cloned;
    }
}
