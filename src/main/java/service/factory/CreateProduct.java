package service.factory;

import dao.builder.NotebookBuilder;
import dao.builder.PhoneBuilder;
import dao.builder.TVBuilder;
import entities.Price;
import entities.Product;
import entities.enums.Type;
import service.out.Out;

public class CreateProduct implements Creator{
    @Override
    public Product create(Type type, Price price, String model, String company) {
        switch (type){
            case NOTEBOOK:
                return new NotebookBuilder.Builder()
                        .withModel(model)
                        .withPrice(new Price(price.getValue(), price.getCurrency()))
                        .withCompany(company)
                        .toBuild();
            case PHONE:
                return new PhoneBuilder.Builder()
                        .withModel(model)
                        .withPrice(new Price(price.getValue(), price.getCurrency()))
                        .withCompany(company)
                        .toBuild();
            case TV:
                return new TVBuilder.Builder()
                        .withModel(model)
                        .withPrice(new Price(price.getValue(), price.getCurrency()))
                        .withCompany(company)
                        .toBuild();
            default:
                System.out.println("Illegal type");
                Out.exit();
        }
        return null;
    }
}