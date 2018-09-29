public class Reformatory {
    
    private int weightCounter = 0;

    public int weight(Person person) {
        // return the weight of the person
        weightCounter++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(weight(person)+1);
    }
    
    public int totalWeightsMeasured() {
        return weightCounter;
    }

}
