public class Squirrel {
    private double weight;
    private int age;
    private int numOfConesInNest = 10;
    private boolean isHungry = true;

    public Squirrel(double weight, int age, int numOfConesInNest, boolean isHungry){
        weight = this.weight;
        age = this.age;
        numOfConesInNest = this.numOfConesInNest;
        isHungry = this.isHungry;
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
}
