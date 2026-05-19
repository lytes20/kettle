import java.math.BigDecimal;

public class Money {
    private BigDecimal value;

    public  Money(BigDecimal value){
        this.value = value;
    }

    public Money add(Money money){
        return new Money(value.add(money.getValue()));
    }


    public Money subtract(Money money){
        return new Money(value.subtract(money.getValue()));
    }

    public BigDecimal getValue(){
        return value;
    }
}
