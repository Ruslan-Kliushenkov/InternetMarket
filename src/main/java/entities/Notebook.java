package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Notebook extends Product{

    public Notebook(Price price,String model, String company) {
        super(price,model, company);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model: "+this.getModel()+
                ", price :"+this.getPrice().getValue()+"("+
                this.getPrice().getCurrency()+
                ")"+ ", company: " + this.getCompany()+
                '}';
    }
}
