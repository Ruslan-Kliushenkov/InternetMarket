package service.builder;

import entities.Price;
import entities.TV;

public class TVBuilder{
    private final Price price;
    private final String model;
    private final String company;

    public TVBuilder(Price price, String model, String company) {
        this.price = price;
        this.model = model;
        this.company = company;
    }

    public Price getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public static class Builder implements ProductBuilder{
        private Price price;
        private String model;
        private String company;

        @Override
        public TVBuilder.Builder withCompany(String company) {
            this.company = company;
            return this;
        }

        @Override
        public TVBuilder.Builder withModel(String model) {
            this.model = model;
            return this;
        }

        @Override
        public TVBuilder.Builder withPrice(Price price) {
            this.price = price;
            return this;
        }

        @Override
        public TV toBuild() {
            if (this.company == null){
                this.company = "Unknown company";
            }
            if (this.model == null){
                this.model = "Unknown model";
            }
            return new TV(this.price,this.model,this.company);
        }

    }
}
