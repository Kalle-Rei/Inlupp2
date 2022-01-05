public class Owl {
    private int wingSpan;
    private int age;
    private int height;
    private boolean isHungry;

    public Owl(int wingSpan, int age, int height, boolean isHungry) {
        this.wingSpan = wingSpan;
        this.age = age;
        this.height = height;
        this.isHungry = isHungry;
    }

    public void eat(PineTree pineTree){
        isHungry = false;
    }
}
