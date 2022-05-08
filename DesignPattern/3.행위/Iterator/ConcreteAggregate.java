public class ConcreteAggregate implements Aggregate {
    private char alphabet[] = {'A', 'B', 'C', 'D', 'E'};

    @Override
    public Iterator getIterator() {
        // TODO Auto-generated method stub
        return new ConcreteIterator(alphabet);
    }
    
}
