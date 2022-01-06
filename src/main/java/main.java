import java.util.ArrayList;
public class main {

    public static void main(String[] args) {

        Squirrel squirrel1 = new Squirrel(1.5, 2, 12, false);
        //System.out.println("squirrel1: " + squirrel1.toString());
        Squirrel squirrel2 = new Squirrel(1.2, 1, 8, false);
        //System.out.println("squirrel2: " + squirrel2.toString());
        ArrayList<Squirrel> squirrelList = new ArrayList<Squirrel>();
        squirrelList.add(squirrel1);
        squirrelList.add(squirrel2);
        Owl owl1 = new Owl(20,20,20, true);
        PineTree tree1 = new PineTree(200, 20,15, squirrelList, owl1, false);
        tree1.updateNumOfSquirrels();
        System.out.println("tree1: " + tree1.toString());
        System.out.println("\ntree1.getNumOfSquirrels: " + tree1.getNumOfSquirrels());
        owl1.eat(tree1);
        System.out.println("\ncheckEat: " + tree1.checkEat());
        System.out.println("\ntree1.getNumOfSquirrels: " + tree1.getNumOfSquirrels());


    }
}
