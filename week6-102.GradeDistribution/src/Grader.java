
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Grader {

    public Grader() {

    }

    public int getGrade(int score) {
        if (score < 0 || score > 60) {
            return -1;
        } else if (score < 30) {
            return 0;
        } else if (score < 35) {
            return 1;
        } else if (score < 40) {
            return 2;
        } else if (score < 45) {
            return 3;
        } else if (score < 50) {
            return 4;
        } else {
            return 5;
        }
    }

    public String generateStars(int quantity) {
        String stars = "";
        while (stars.length() < quantity) {
            stars = stars + "*";
        }
        return stars;
    }

    public double getAcceptance(ArrayList<Integer> grades, Grader g) {
        double z = Collections.frequency(grades, 0);
        double s = grades.size();
        double dec = 1 - z / s;
        return 100 * dec;
    }

}
