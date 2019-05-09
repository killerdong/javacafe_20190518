package kr.javacafe.java20190508.generics;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class PersonWithObject {

    private Object name;
    private Object id;

    @Builder
    public PersonWithObject(Object name, Object id) {

        if ( name instanceof String || name instanceof Name) {
            this.name = name;
        } else {
            throw new RuntimeException("타입 제한");
        }

        this.id = id;
    }
}
