package kr.javacafe.java20190508.generics;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class PersonWithGenerics<T, S> {

    private T name;
    private S id;

    @Builder
    public PersonWithGenerics(T name, S id) {
        this.name = name;
        this.id = id;
    }
}
