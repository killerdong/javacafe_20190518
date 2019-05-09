package kr.javacafe.java20190508.generics;


import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
class PersonWithIdStringType {

    private String name;
    private String id;

    @Builder
    PersonWithIdStringType(String name, String id) {
        this.name = name;
        this.id = id;
    }
}