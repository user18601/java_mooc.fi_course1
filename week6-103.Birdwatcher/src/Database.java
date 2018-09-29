
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * É
 *
 * @author Admin
 */
public class Database {

    private ArrayList<Bird> birds;
    private ArrayList<Observation> obs;

    public Database() {
        birds = new ArrayList();
        obs = new ArrayList();
    }

    public void add(Bird bird) {
        birds.add(bird);
    }

    public void add(Observation ob) {
        obs.add(ob);
    }

    public Bird getBird(String name) {
        Bird maybeBird = null;
        for (Bird b : this.birds) {
            if (b.getName().equals(name)) {
                maybeBird = b;
            }
        }
        return maybeBird;
    }

    public boolean contains(Bird b) {
        return this.birds.contains(b);
    }

    private HashMap<Bird, Integer> toMap() {
        HashMap<Bird, Integer> o = new HashMap();
        for (Observation ob : obs) {
            Bird b = ob.getBird();
            if (o.containsKey(b)) {
                o.put(b, o.get(b) + 1);
            } else {
                o.put(b, 1);
            }
        }
        return o;
    }

    public void statistics() {
        for (Bird b : this.birds) {
            this.show(b);
        }
    }

    public void show(Bird b) {
        HashMap<Bird, Integer> map = this.toMap();
        if (b != null) {
            System.out.println(b.toString() + ": " + map.getOrDefault(b, 0) + " observations");
        }
    }

}
