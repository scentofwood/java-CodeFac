import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class InstanceTest 
{
    public static int list = 0, map = 0, set = 0, collection = 0;
    public static void collectionCounter(String name, Object abc)
    {
        System.out.print(name + " >>\t");
        if (abc instanceof List) {list++; System.out.print("List ");} 
        if (abc instanceof Map) {map++; System.out.print("Map ");}
        if (abc instanceof Set) {set++; System.out.print("Set ");}
        if (abc instanceof Collection) {collection++; System.out.print("Collection ");}
        System.out.println("");
    }

    public static void main(String[] args)
    {
        collectionCounter("HashSet",    new HashSet<Object>());
        collectionCounter("HashMap",    new HashMap<Object, Object>());
        collectionCounter("ArrayList",  new ArrayList<Object>());
        collectionCounter("LinkedList", new LinkedList<Object>());
        collectionCounter("Stack",      new Stack<Object>());
        collectionCounter("TreeSet",    new TreeSet<Object>());
        collectionCounter("TreeMap",    new TreeMap<Object, Object>());

        System.out.println("");
        System.out.println("list = " + list + " map = " + map + " set = " + set + " collection = " + collection);
    }
}