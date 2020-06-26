public class Main {

    public static void main(String[] args) {
        RandomizedCollection obj = new RandomizedCollection();
        System.out.println(obj.getRandom());

        System.out.println(obj.insert(1));

        System.out.println(obj.remove(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(3));
        System.out.println(obj.getRandom());

    }

}
