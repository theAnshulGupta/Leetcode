import java.util.ArrayList;

public class RandomizedCollection {

    /**
     *      * .add (x) adds an item at position x
     *      * .size() is the amount of elements
     *      * .get(x) gets the element at position x
     *      * .remove(x) removes an item at position x
     *      * .contains(y) finds if item y exists (boolean)
     *      * .indexOf(y) find the position of item (no item returns -1)
     *      * .addAll(arraylist) adds a whole arraylist to the current arraylist
     *      * .toArray(array) converts the ArrayList into an array
     */

    private ArrayList<Integer> integers;
//    private int count;
    java.util.Random rand = new java.util.Random();
    /** Initialize your data structure here. */
    public RandomizedCollection() {

        this.integers = new ArrayList<Integer>();
//        this.count = -1;
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {

        boolean exists = integers.contains(val);
        if (exists){
            integers.add(val);
            return false;
        }
        integers.add(val);
        return true;
        

    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        boolean exists = integers.contains(val);
        if (exists){
            integers.remove(integers.indexOf(val));
            return true;
        }
        return false;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
//        count++;
//        if(count==integers.size()){
//            count = 0;
//        }
//        if(integers.size()==0){
//            return -1;
//        }
        return integers.get(rand.nextInt(integers.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */