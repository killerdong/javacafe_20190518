package kr.javacafe.java20190508.annotation;

import kr.javacafe.java20190508.generics.Dog;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AnnotationTest {

    @Test
    public void annotationTest() {


        ReflectionTest test = new ReflectionTest();

        Optional<String> result = test.annotationReflection(UserAnnotation.class);
        assertThat(result.get(), is("DongWoo 2019-11-26"));

        Optional<String> result2 = test.annotationReflection(Dog.class);

        assertThat(result2, is(Optional.empty()));



    }

    @Test
    public void methodAnnotationTest() {

        ReflectionTest test = new ReflectionTest();

        Optional<String> result = test.methodReflection(UserAnnotation.class);
        assertThat(result.get(), is("Method Annotation 실행"));

        Optional<String> result2 = test.methodReflection(Dog.class);

        assertThat(result2, is(Optional.empty()));



    }

}
