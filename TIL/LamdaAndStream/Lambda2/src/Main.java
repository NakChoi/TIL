@FunctionalInterface
interface MyFunction{
    void myMethod();
}

public class Main {
    public static void main(String[] args) {
        MyFunction f = () -> {};
        Object obj = (MyFunction)(() -> {}); // Object 타입으로 형변환이 생략됨.
        String str = ((Object)(MyFunction)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        // System.out.println(() -> {}); // 람다식은 Object 타입으로 형변환 안됨.
        System.out.println((MyFunction)(() -> {}));
        //System.out.println((MyFunction)(() -> {}).toString()); // 오류 발생
        System.out.println(((Object) (MyFunction) ( () -> {})).toString());
    }
}