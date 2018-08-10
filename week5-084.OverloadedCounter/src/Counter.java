/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Counter {
    
    private int value;
    private boolean check;
    
    public Counter() {
        this(0, false);        
    }
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    public Counter(boolean check) {
        this(0, check);
    }
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }
    public int value() {
        return this.value;
    }
    public void increase() {
        this.value++;
    }
    public void decrease() {
        if (this.check) {
            this.value = Math.max(this.value - 1, 0);
        } else {
            this.value--;
        }
    }
    public void increase(int increaseAmount) {
        this.value += Math.max(increaseAmount, 0);
    }
    public void decrease(int decreaseAmount) {
        if (check) {
            this.value = Math.max(value - Math.max(decreaseAmount, 0), 0);
        }
        else {
            this.value = value - Math.max(decreaseAmount, 0);
        }
                
    }
}
