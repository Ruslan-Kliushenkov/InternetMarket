package service.builder;

import entities.Price;
import entities.Product;

public interface ProductBuilder {
    ProductBuilder withCompany(String company);
    ProductBuilder withModel(String model);

    ProductBuilder withPrice(Price price);

    Product toBuild();
}
