public class Singleton {
    // the private reference to the one and only instance
    private volatile static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    private Singleton() {
    }

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn before it can enter the method
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { // we only synchronize the first time
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // add a set data here

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
