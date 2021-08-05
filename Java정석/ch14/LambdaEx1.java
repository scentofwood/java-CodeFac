@FunctionalInterface
interface MyFunction1 {
    void run();
}

class LambdaEx1 {
    static void execute(MyFunction1 f) {
        f.run();
    }

    static MyFunction1 getMyFunction1() {
        MyFunction1 f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 M<yFunction의 run()을 구현
        // 컴파일러가 어떻게 같은 걸로 인식하나?
        // 매개변수 타입과 개수 그리고 반환값이 일치하기에 
        MyFunction1 f1 = () -> System.out.println("f1.run()");
        f1.run();

        // 익명클래스로 M<yFunction의 run()을 구현
        // 컴파일하면 익명클래스 'LambdaEx1$1.class' 만들어짐
        MyFunction1 f2 = new MyFunction1() {
            public void run() {
                System.out.println("f2.run()");
            }
        };
        f2.run();

        // 참조변수로 MyFunction1의 run()을 구현
        MyFunction1 f3 = getMyFunction1();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));

        System.out.println(f1); // LambdaEx1$$Lambda$1/0x0000000840060840@2626b418 // 외부클래스이름$Labda$번호
        System.out.println(f2); // LambdaEx1$1@5a07e868                            // 외부클래스이름$번호
        System.out.println(f3); // LambdaEx1$$Lambda$2/0x0000000840061040@76ed5528 // 외부클래스이름$Labda$번호
    }
}