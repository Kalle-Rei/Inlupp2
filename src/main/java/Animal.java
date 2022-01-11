public abstract class Animal {
    protected int age;
    protected boolean isHungry;

    public Animal(int age, boolean isHungry){
        this.age = age;
        this.isHungry = isHungry;
    }
    public abstract void eat(PineTree pineTree);
}
