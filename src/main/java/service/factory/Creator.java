package service.factory;

import entities.Price;
import entities.Product;
import entities.enums.Type;

public interface Creator {
    Product create(Type type, Price price, String model, String company);
}
