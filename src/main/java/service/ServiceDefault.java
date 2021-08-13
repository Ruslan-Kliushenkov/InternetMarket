package service;

import entities.*;
import entities.enums.Currency;
import entities.enums.Type;
import service.factory.CreateProduct;
import service.out.Out;

public final class ServiceDefault {
    CreateProduct creator = new CreateProduct();

    public Product create(Type typeOfProduct) {
        switch (typeOfProduct) {
            case NOTEBOOK:
                return createDefaultNotebook();
            case PHONE:
                return createDefaultPhone();
            case TV:
                return createDefaultTV();
            default:
                System.out.println("Illegal type");
                Out.exit();

        }
        return null;
    }

    public Product createDefaultNotebook() {
        return creator.create(Type.NOTEBOOK, new Price(123000, Currency.UAH), "GE76-11UH Black", "Rider");
    }

    public Product createDefaultPhone() {
        return creator.create(Type.PHONE, new Price(1000, Currency.USD), "iPhone 12 PRO MAX ULTRA MEGA (s)", "Apple");
    }

    public Product createDefaultTV() {
        return creator.create(Type.TV, new Price(445, Currency.EUR), "4K UHD Smart TV", "Samsung");
    }
}
