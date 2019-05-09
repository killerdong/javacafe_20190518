package kr.javacafe.java20190508.generics;

//public class GenericException<T> extends Exception {
//public class GenericException<T> extends Throwable {
//}

public class GenericException<T extends Exception> {
    public void parse(Dog file) throws T {
        // ...
    }

//    public <E extends Exception> void aaa() {
//        try{
//
//        } catch (E ex) {
//
//        }
//    }
}
