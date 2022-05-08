public class StringDisplayImpl extends DisplayImpl {
    private String string; // 표시해야할 문자열
    private int width; // 바이트 단위로 계산한 문자열의"길이"
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println("|" + string + "|"); // 앞뒤에 "|" 를붙여서표시
    }
    public void rawClose() {
        printLine();
    }
    private void printLine() { // 모서리에 ‘+’ 와 width 개의 ‘-’ 를표시
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
