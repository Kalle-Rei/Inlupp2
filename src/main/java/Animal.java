public abstract class Animal {
    protected int age;
    protected boolean isHungry;

    public Animal(int age, boolean isHungry){
        this.age = age;
        this.isHungry = isHungry;
    }
    abstract void eat(PineTree pineTree);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
