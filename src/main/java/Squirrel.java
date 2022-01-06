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

    public void eat(){
        setNumOfConesInNest(getNumOfConesInNest()-1);
        isHungry = false;
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
