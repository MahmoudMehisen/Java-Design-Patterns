public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();


        singleton1.setData(55);

        System.out.println("First Ref: " + singleton1);
        System.out.println("Data is: " + singleton1.getData());

        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Second Ref: " + singleton2);
        System.out.println("Data is: " + singleton2.getData());
    }
}
