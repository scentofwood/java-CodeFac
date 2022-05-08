public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl) { // 구현한class의instance를impl로받음
        this.impl = impl;
    }
    public void open() {
        impl.rawOpen(); // rawOpen()의구현을stringDisplayImpl에서처리
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