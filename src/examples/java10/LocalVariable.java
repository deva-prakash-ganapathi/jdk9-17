package examples.java10;

public class LocalVariable {
    public static void main(String[] args) {
        var message = "hello world!";
        //var unknownType;
        someMethod(message);
    }

//    var stringInputMethod(var str) {
//        return str;
//    }
    static String someMethod(String str) {
        return str;
    }
}
