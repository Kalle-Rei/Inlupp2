import java.util.Random;

public class Squirrel {
    private double weight;
    private int age;
    private int numOfConesInNest = 10;
    private boolean isHungry = true;

    public Squirrel(double weight, int age, int numOfConesInNest, boolean isHungry){
        this.weight = weight;
        this.age = age;
        this.numOfConesInNest = numOfConesInNest;
        this.isHungry = isHungry;
    }

    public void eat(PineTree pineTree){
        Random random = new Random();
        if(numOfConesInNest > 0){
            numOfConesInNest--;
            isHungry = false;
            //increase weight slightly after eating
            setWeight(getWeight()+0.01);
        }
        // if there is enough cones on the tree the squirrel has a 60% chance to succeed in refilling its nest
        else if((pineTree.getNumOfCones() >= 10) && (random.nextInt(10) > 3)){
            refillNest(pineTree);
            //recursive function call to eat from the recently filled nest
            eat(pineTree);
        }
    }

    public void refillNest(PineTree pineTree){
        if (getNumOfConesInNest() < 10 && pineTree.getNumOfCones() >= 10){
            setNumOfConesInNest(getNumOfConesInNest()+10);
            pineTree.setNumOfCones(pineTree.getNumOfCones()-10);
        }
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "weight=" + weight +
                ", age=" + age +
                ", numOfConesInNest=" + numOfConesInNest +
                ", isHungry=" + isHungry +
                '}';
    }
}
