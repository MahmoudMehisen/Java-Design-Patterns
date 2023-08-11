import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show(){
        System.out.println("\n Product completed as below");
        parts.forEach(System.out::println);
    }
}
