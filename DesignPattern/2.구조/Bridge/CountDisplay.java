public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) { 
        // 상위class와같이 bridge 역할을하는field
        super(impl);
    }
    public void multiDisplay(int times){ 
        // open()과 close()로 틀을 만들고 string을 times 만큼출력
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
