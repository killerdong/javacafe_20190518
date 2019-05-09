package kr.javacafe.java20190508.generics;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Set;

@Getter
@EqualsAndHashCode
public class Person {

    private String name;
    private int id;

    @Builder
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    <T> String runWith(T item) {
        return this.name + "는 " + item.toString() + "과 함께 뜁니다.";
    }

    @Override
    public String toString() {
        return this.name;
    }

//    public void print(Set<String> strSet) { }
//    public void print(Set<Integer> intSet) { }
}
