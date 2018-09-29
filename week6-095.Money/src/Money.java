
public class Money {

    private final int euros;
    private final int cents;
    private int newCents;
    private int newEuros;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        newCents = this.cents + added.cents;
        newEuros = this.euros + added.euros;
        if (newCents > 99) {
            newCents = newCents % 100;
            newEuros++;
        }
        return new Money(newEuros, newCents);
    }

    public boolean less(Money compared) {
        return (this.euros < compared.euros || (this.euros == compared.euros && this.cents < compared.cents));
    }

    public Money minus(Money decremented) {
        newCents = this.cents - decremented.cents;
        newEuros = this.euros - decremented.euros;
        if (newCents < 0) {
            newCents = newCents + 100;
            newEuros--;
        }
        if (newEuros < 0) {
            return new Money(0, 0);
        }
        return new Money(newEuros, newCents);

    }

}
