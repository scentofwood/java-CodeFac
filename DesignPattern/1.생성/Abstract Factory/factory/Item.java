package factory;

public abstract class Item {
    protected String caption;
    public Item() {
    }
    public Item(String caption) { this.caption = caption; }
    public abstract String makeHTML();
}
