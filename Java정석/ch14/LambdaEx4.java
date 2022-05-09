import java.util.*;

class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // list의 모든 요소를 출력한다.
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // list에서 2 또는 3의 배수를 제거한다.
        list.removeIf(y -> y % 2 == 0 || y % 3 == 0);
        System.out.println(list);

        //list의 각 요소에 10을 곱한다.
        list.replaceAll(z -> z * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");

        // map의 모든 요소를 {k, v}의 형식으로 출력한다. 
        map.forEach((k, v) -> System.out.print("{" + k + ", " + v + "} "));
        System.out.println();

    }
}
