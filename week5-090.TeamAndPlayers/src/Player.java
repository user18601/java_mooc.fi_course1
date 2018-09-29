/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Player {
    private String name;
    private int goals;
    
    public Player(String name) {
        this.name = name;
    }
    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the goals
     */
    public int goals() {
        return goals;
    }
    public String toString() {
        return name + ", goals " + goals;
    }
    
}
