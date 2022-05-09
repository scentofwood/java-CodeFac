<<<<<<< HEAD
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
        System.out.println(getRowText(i));
        }
    }
=======
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
        System.out.println(getRowText(i));
        }
    }
>>>>>>> e97b4a725efdb8f7fbb47b9238916a892260de42
}