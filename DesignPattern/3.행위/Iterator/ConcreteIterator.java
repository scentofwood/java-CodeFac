
public class ConcreteIterator implements Iterator {
    private int idx;
    private char[] items;
    public ConcreteIterator(char[] items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        if (idx < items.length)
            return true;
        else
            return false;
    }
    @Override
    public Object next() {
        // TODO Auto-generated method stub
        if (this.hasNext())
            return items[idx++];
        else
            return null;
    }
    
}
