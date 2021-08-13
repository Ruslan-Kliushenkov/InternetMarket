package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
public final class Phone extends Product{

    public Phone(Price price, String model,String company) {
        super(price, model,company);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model: "+this.getModel()+
                ", price :"+this.getPrice().getValue()+"("+
                this.getPrice().getCurrency()+
                ")"+ ", company: " + this.getCompany()+
                '}';
    }
}
