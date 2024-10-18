public class WithoutVisitorDemo {
    public static void main(String[] args) {
        SimpleConcreteElementAWithoutVisitor elementA = new SimpleConcreteElementAWithoutVisitor();
        SimpleConcreteElementBWithoutVisitor elementB = new SimpleConcreteElementBWithoutVisitor();

        // Now, if you wanted to perform a specific operation on these elements,
        // you would call their methods directly.
        elementA.operationA();
        elementB.operationB();
    }
}