public class Squirrel {
    private double weight;
    private int age;
    private int numOfConesInNest;
    private boolean isHungry;

    public Squirrel(double weight, int age, int numOfConesInNest, boolean isHungry){
        weight = this.weight;
        age = this.age;
        numOfConesInNest = this.numOfConesInNest;
        isHungry = this.isHungry;
    }

    public void eat(){
        numOfConesInNest--;
        isHungry = false;
    }
}
