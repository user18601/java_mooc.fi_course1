/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Observation {

    private Bird bird;

    public Observation(Bird bird) {
        this.bird = bird;
    }

    /**
     * @return the bird
     */
    public Bird getBird() {
        return bird;
    }

    /**
     * @param bird the bird to set
     */
    public void setBird(Bird bird) {
        this.bird = bird;
    }

}
