package service.builder;

import entities.Phone;
import entities.Price;

public class PhoneBuilder{
    private final Price price;
    private final String model;
    private final String company;

    public PhoneBuilder(Price price, String model, String company) {
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
        public Builder withCompany(String company) {
            this.company = company;
            return this;
        }

        @Override
        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        @Override
        public Builder withPrice(Price price) {
            this.price = price;
            return this;
        }

        @Override
        public Phone toBuild() {
            if (this.company == null){
                this.company = "Unknown company";
            }
            if (this.model == null){
                this.model = "Unknown model";
            }
            return new Phone(this.price,this.model,this.company);
        }

    }
}
