package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class TV  extends Product {

    public TV(Price price, String model,String company) {
        super(price, model, company);

    }

    @Override
    public String toString() {
        return "TV{" +
                "model: "+this.getModel()+
                ", price :"+this.getPrice().getValue()+"("+
                this.getPrice().getCurrency()+
                ")"+ ", company: " + this.getCompany()+
                '}';
    }
}
