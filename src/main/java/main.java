import java.util.ArrayList;
public class main {

    public static void main(String[] args) {
        ArrayList<Squirrel> squirrelList = makeSquirrels();
        Owl owl1 = makeOwl();
        PineTree tree1 = makePineTree(squirrelList, owl1);

        System.out.println("tree1: " + tree1.toString());

        System.out.println("\nsquirrels after eat() has been called: ");
        for(Squirrel e: tree1.getSquirrels()){
            e.eat(tree1);
            System.out.println(e);
        }

        owl1.eat(tree1);
        System.out.println("\nOwl and squirrels after owl.eat() has been called: ");
        System.out.println(owl1);
        for(Squirrel e: tree1.getSquirrels()){
            System.out.println(e);
        }
        tree1.fall(tree1.getWindSpeed(), tree1.getAge(), tree1.isHasLumberJack());
        System.out.println("\ntree1 after fall() has been called: ");
        System.out.println(tree1.toString());
    }
    public static ArrayList<Squirrel> makeSquirrels(){
        ArrayList<Squirrel> squirrelList = new ArrayList<Squirrel>();
        Squirrel squirrel1 = new Squirrel(1.5, 2, 12, true);
        Squirrel squirrel2 = new Squirrel(1.2, 1, 0, true);
        Squirrel squirrel3 = new Squirrel(0.8, 1, 1, true);
        squirrelList.add(squirrel1);
        squirrelList.add(squirrel2);
        squirrelList.add(squirrel3);
        return squirrelList;
    }
    public static Owl makeOwl(){
        Owl owl1 = new Owl(20,20,20, true);
        return owl1;
    }
    public static PineTree makePineTree(ArrayList<Squirrel> squirrelList, Owl owl1){
        PineTree tree1 = new PineTree(200, 20,21, squirrelList, owl1, false);
        tree1.updateNumOfSquirrels();
        return tree1;
    }
}
