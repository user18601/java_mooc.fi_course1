
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class InputHelper {

    private Scanner s;
    private Database db;

    public InputHelper(Scanner s, Database db) {
        this.s = s;
        this.db = db;
    }

    public void add() {
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Latin Name: ");
        String latinName = s.nextLine();
        db.add(new Bird(name, latinName));
    }

    public void observation() {
        System.out.print("What was observed:? ");
        String name = s.nextLine();
        Bird maybeBird = db.getBird(name);
        if (db.contains(maybeBird)) {
            db.add(new Observation(maybeBird));
        } else {
            System.out.println("Is not a bird!");
        }
    }

    public void statistics() {
        db.statistics();
    }

    public void show() {
        System.out.println("What?");
        String name = s.nextLine();
        Bird maybeBird = db.getBird(name);
        db.show(maybeBird);
    }
}
