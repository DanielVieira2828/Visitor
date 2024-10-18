package comPadrao;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();

        Visitor visitor = new ConcreteVisitor();

        elementA.accept(visitor); // Visitor visits ConcreteElementA
        elementB.accept(visitor); // Visitor visits ConcreteElementB
    }
}