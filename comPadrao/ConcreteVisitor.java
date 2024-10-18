package comPadrao;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor visiting: " + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor visiting: " + elementB.operationB());
    }
}