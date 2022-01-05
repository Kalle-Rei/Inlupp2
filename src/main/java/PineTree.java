import java.util.List;

public class PineTree {
    private int numOfCones;
    private int age;
    private int windSpeed;
    private static int numOfSquirrels = 0;
    private List<Squirrel> squirrels;
    private Owl owl;
    private boolean hasLumberJack = false;

    public PineTree(int numOfCones, int age, int windSpeed, List<Squirrel> squirrels, Owl owl, boolean hasLumberJack) {
        this.numOfCones = numOfCones;
        this.age = age;
        this.windSpeed = windSpeed;
        this.squirrels = squirrels;
        this.owl = owl;
        this.hasLumberJack = hasLumberJack;
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public void increaseNumOfSquirrels(){
        numOfSquirrels++;
    }

    public void decreaseNumOfSquirrels(){
        if (numOfSquirrels > 0){
            numOfSquirrels--;
        }
    }

}
