public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl) { // ������class��instance��impl�ι���
        this.impl = impl;
    }
    public void open() {
        impl.rawOpen(); // rawOpen()�Ǳ�����stringDisplayImpl����ó��
    }
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }
    public final void display() {
    open(); print(); close();
    }
}