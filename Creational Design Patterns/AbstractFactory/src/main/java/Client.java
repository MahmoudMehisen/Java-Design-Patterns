public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFact = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFact.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFact.getShape("SQUARE");
        shape2.draw();

        AbstractFactory colorFact = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFact.getColor("RED");
        color1.fill();

        Color color2 = colorFact.getColor("Green");
        color2.fill();

    }
}
