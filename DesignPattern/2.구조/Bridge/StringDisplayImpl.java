public class StringDisplayImpl extends DisplayImpl {
    private String string; // ǥ���ؾ��� ���ڿ�
    private int width; // ����Ʈ ������ ����� ���ڿ���"����"
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println("|" + string + "|"); // �յڿ� "|" ���ٿ���ǥ��
    }
    public void rawClose() {
        printLine();
    }
    private void printLine() { // �𼭸��� ��+�� �� width ���� ��-�� ��ǥ��
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
