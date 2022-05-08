public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) { 
        // ����class�Ͱ��� bridge �������ϴ�field
        super(impl);
    }
    public void multiDisplay(int times){ 
        // open()�� close()�� Ʋ�� ����� string�� times ��ŭ���
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
