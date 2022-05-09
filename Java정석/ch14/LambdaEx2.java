@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {};
        Object obj = (MyFunction2)(() -> {});
        String st1 = ((MyFunction2)(() -> {})).toString();
        String st2 = ((Object)(MyFunction2)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(st1);
        System.out.println(st2);

        System.out.println((MyFunction2)(() -> {}));
        System.out.println(((MyFunction2)(() -> {})).toString());
        System.out.println(((Object)(MyFunction2)(() -> {})).toString());
    }
}
