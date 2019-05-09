package kr.javacafe.java20190508.generics;

import lombok.Builder;

@Builder
public class Dog implements Animal<String, String> {

//    public String runWith2(Object o) {
//        return this.runWith2((String) o);
//    }

    @Override
    public String runWith2(String o) {
        return "개는 " + o + "과 뜁니다." ;
    }

    @Override
    public <U> String runWith(U o) {
        return "개는 " + o.toString() + "과 뜁니다." ;
    }
}
