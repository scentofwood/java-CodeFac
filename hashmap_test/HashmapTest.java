import java.util.HashMap;

class HashmapTest {
    public static void main(String[] args) {
        String priClnn = "";
        // HashMap<String, String> hm = new HashMap<String, String>();
        // HashMap<String, String> hm = new HashMap<>(10000000);
        HashMap<String, String> hm = new HashMap<String, String>(10000000);

        for (int i = 0; i < 10000000; i++) {
            priClnn = "P" + makeString(i);
            hm.put(priClnn, "");
            if (i % 10000 == 0) {
                System.out.println("현재 " + i + "번째 " +  priClnn);
            }
        }
        System.out.println("put 끝");

        int j = 0, k = 0;
        for (int i = 0; i < 10000000; i ++) {
            priClnn = "P" + makeString(i);
            if (i % 5000 == 0) {
                k++;
                priClnn = priClnn + k;
            }
            if (hm.containsKey(priClnn)) {
                j++;
                if (j % 1000 == 0) {
                    System.out.println("O 고객 " + priClnn);
                }
            } else {
                System.out.println("X 고객 " + priClnn);
            }
        }

        System.out.println("get 끝");
    }

    static String  makeString(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        if (len < 9) {
            for (int i = 0; i < 9 - len; i++) {
                s = "0" + s;
            }
        }
        return s;
    }
}
