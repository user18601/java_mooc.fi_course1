
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters; 
    }
    public int price(Apartment apartment) {
        return apartment.pricePerSquareMeter * apartment.squareMeters;
    }
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(price(this) - price(otherApartment));
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return price(this) > price(otherApartment);
    }
    
}
