/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BoundedCounter {
    private int value;
    private int limit;
    
    public BoundedCounter(int limit) {
        this.value = 0;
        this.limit = limit;
    }
    public void next() {
        value = (value + 1) % (limit+1);
    }
    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int newValue){
        if (0 <= newValue && newValue <= limit) {
            value = newValue;
        }
    }
}
