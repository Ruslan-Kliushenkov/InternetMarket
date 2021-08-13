package entities;

import entities.enums.Currency;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public final class Price  implements Cloneable{
    private int value;
    private Currency currency;

    public Price(int value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
