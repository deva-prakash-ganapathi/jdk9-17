package examples.java15;

public class SealedClassDemo {
    public static void main(String[] args) {
        SealedClass obj = new ChildA();
        handleSealedClass(obj);
    }

    //pattern matching for switch expressions is introduced in JDK17
    private static void handleSealedClass(SealedClass obj) {
        switch (obj) {
            case ChildA a -> a.classAMethod();
            case ChildB b -> b.classBMethod();
            case SealedClass sc -> sc.commonMethod();
        }
    }
}
