import java.util.Optional;
import java.util.OptionalInt;

class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123")
                        .filter(x -> x.length() > 0)
                        .map(Integer::parseInt)
                        .get();         // Optional 안에 값이 있으면, 그 값을 리턴
        int result2 = Optional.of("")
                        .filter(x -> x.length() > 0)
                        .map(Integer::parseInt)
                        .orElse(-1);    // Optional 안에 값이 없으면, 매개변수값(여기서는 -1) 를 리턴
        System.out.println("result1 = " + result1);;
        System.out.println("result2 = " + result2);;

        Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.printf("result3 = %d%n", x));

        OptionalInt optInt1 = OptionalInt.of(0);    // 0을 저장
        OptionalInt optInt2 = OptionalInt.empty();  // 빈객체를 저장

        System.out.println(optInt1.isPresent());    // true
        System.out.println(optInt2.isPresent());    // false

        System.out.println(optInt1.getAsInt());     // 0
//        System.out.println(optInt2.getAsInt());     // java.util.NoSuchElementException

        System.out.println("optInt1 = " + optInt1); // OptionalInt[0]
        System.out.println("optInt2 = " + optInt2); // OptionalInt.empty
        System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2)); // false

        Optional<String> opt1 = Optional.ofNullable(null);   // null을 저장
        Optional<String> opt2 = Optional.empty();            // 빈객체를 저장

        System.out.println("opt1 = " + opt1);       // Optional.empty
        System.out.println("opt2 = " + opt2);       // Optional.empty
        System.out.println("opt1.equals(opt2) = " + opt1.equals(opt2)); // true

        int result4 = optStrToInt(Optional.of("123"), 0);
        int result5 = optStrToInt(Optional.of(""), 0);
        
        System.out.println("result4 = " + result4); // 123
        System.out.println("result5 = " + result5); // 0
    }

    private static int optStrToInt(Optional<String> optStr, int defaultValue) {
        try{
            return optStr.map(Integer::parseInt).get();
        } catch(Exception e) {
            return defaultValue;
        }
    }
}
