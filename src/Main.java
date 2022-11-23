import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Arraylist = a resizable array.
                      Elements can be added and removed after compilation phase
                      store reference data types
         */

        ArrayList<String> food = new ArrayList();

        food.add("Chicken");
        food.add("Pizza");
        food.add("Hamburger");

        for(int i = 0; i< food.size(); i++){
        System.out.println(food.get(i));
    }
}}