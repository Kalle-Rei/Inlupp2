public class Owl extends Animal {
    private int wingSpan;
    private int height;

    public Owl(int wingSpan, int age, int height, boolean isHungry) {
        super(age, isHungry);
        this.wingSpan = wingSpan;
        this.height = height;
    }
    @Override
    public void eat(PineTree pineTree){
        if(pineTree.getNumOfSquirrels() > 0){
            pineTree.removeSquirrel();
            isHungry = false;
            // reduce height as the owl swoops down
            setHeight(getHeight()-(getHeight()/2));
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Owl{" +
                "wingSpan=" + wingSpan +
                ", age=" + age +
                ", height=" + height +
                ", isHungry=" + isHungry +
                '}';
    }
}
