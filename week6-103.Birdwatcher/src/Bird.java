/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Bird {

    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
    @Override
    public String toString() {
        return name + " (" + latinName + ")";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the latinName
     */
    public String getLatinName() {
        return latinName;
    }

    /**
     * @param latinName the latinName to set
     */
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

}
