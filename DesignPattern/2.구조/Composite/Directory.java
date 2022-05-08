import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private String name;
    private Vector directory = new Vector();
    public Directory(String name) {
        this.name = name;
    }
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        int size = 0;
        Iterator it = directory.iterator();
//System.out.print("½ÃÀÛ" + this.getName() + ">> ");
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
//System.out.print("+" + entry.getName() + "(");
            size += entry.getSize();
//System.out.print(size + ")");
        }
//System.out.println("³¡");
        return size;
    }

    @Override
    protected void printList(String prefix) {
        // TODO Auto-generated method stub
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
