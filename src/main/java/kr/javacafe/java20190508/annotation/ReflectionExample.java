package kr.javacafe.java20190508.annotation;

import kr.javacafe.java20190508.generics.Dog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public class ReflectionExample {

    public void refectionEample() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Dog dog = Dog.builder().build();

        dog.runWith2("!!!!");

        Object dog2 = Dog.class.newInstance();

        Method method = dog2.getClass().getMethod("runWith2", null);

        method.invoke(dog2);
    }

    Optional<String> annotationReflection(Class clazz) {

        if (clazz.isAnnotationPresent(ClassChecker.class)) {

            ClassChecker annotationTest = (ClassChecker) clazz.getAnnotation(ClassChecker.class);

            String author = annotationTest.author();
            String date = annotationTest.date();

            return Optional.of(author + " " + date);
        }

        return Optional.empty();
    }

    Optional<String> methodReflection(Class clazz) {

        for(Method method : clazz.getMethods()) {
            if(method.isAnnotationPresent(MethodChecker.class)) {
                return Optional.of("Method Annotation 실행");
            }
        }

        return Optional.empty();
    }

}
