package service.builder;

import entities.*;

public class NotebookBuilder{
    private final Price price;
    private final String model;
    private final String company;

    public NotebookBuilder(Price price, String model, String company) {
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
        public NotebookBuilder.Builder withCompany(String company) {
            this.company = company;
            return this;
        }

        @Override
        public NotebookBuilder.Builder withModel(String model) {
            this.model = model;
            return this;
        }

        @Override
        public NotebookBuilder.Builder withPrice(Price price) {
            this.price = price;
            return this;
        }

        @Override
        public Notebook toBuild() {
            if (this.company == null){
                this.company = "Unknown company";
            }
            if (this.model == null){
                this.model = "Unknown model";
            }
            return new Notebook(this.price,this.model,this.company);
        }

    }
}
