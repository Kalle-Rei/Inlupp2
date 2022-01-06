import java.util.ArrayList;
import java.util.Random;

public class PineTree {
    private int numOfCones;
    private int age;
    private int windSpeed;
    private int numOfSquirrels;
    private ArrayList<Squirrel> squirrels;
    private Owl owl;
    private boolean hasLumberJack;

    public PineTree(int numOfCones, int age, int windSpeed, ArrayList<Squirrel> squirrels, Owl owl, boolean hasLumberJack) {
        this.numOfCones = numOfCones;
        this.age = age;
        this.windSpeed = windSpeed;
        this.squirrels = squirrels;
        this.owl = owl;
        this.hasLumberJack = hasLumberJack;
    }

    public void removeSquirrel() {
        squirrels.remove(0);
        decreaseNumOfSquirrels();
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public void decreaseNumOfSquirrels(){
        if (numOfSquirrels > 0){
            numOfSquirrels--;
        }
    }

    public int getNumOfSquirrels(){
        return numOfSquirrels;
    }

    public void updateNumOfSquirrels(){
        numOfSquirrels = 0;
        for(Squirrel e: squirrels){
            numOfSquirrels++;
        }
    }

    public void fall(int windSpeed, int age, boolean hasLumberJack){
        Random random = new Random();
        //if conditions are met there is a 70% chance of the tree falling
        if(((windSpeed > 20 && age > 80) || hasLumberJack) && (random.nextInt(10) > 2)){
            // the tree falls and the squirrels disappear
            while(numOfSquirrels > 0){
                removeSquirrel();
            }
        }
        else{
            // the tree doesn't fall
        }

    }

    public int getAge() {
        return age;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public boolean isHasLumberJack() {
        return hasLumberJack;
    }

    public ArrayList<Squirrel> getSquirrels() {
        return squirrels;
    }

    @Override
    public String toString() {
        return "PineTree{" +
                "numOfCones=" + numOfCones +
                ", age=" + age +
                ", windSpeed=" + windSpeed +
                ", \nsquirrels=" + squirrels +
                ", \ngetNumOfSquirrels=" + getNumOfSquirrels() +
                ", \nowl=" + owl +
                ", \nhasLumberJack=" + hasLumberJack +
                '}';
    }

}
