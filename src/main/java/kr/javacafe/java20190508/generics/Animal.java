package kr.javacafe.java20190508.generics;

public interface Animal<T, S> {

    <U> String runWith(U o);

    default String runWith2(T o) {
        return "동물은 " + o.toString() + "과 달립니다.";
    }



//    <U extends Animal> String runWith(U o);
//    <U extends Person> String runWith(U o);
}
