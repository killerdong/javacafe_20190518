package kr.javacafe.java20190508.generics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PersonTest {

    @Test
    public void personTest() {

        Person person = new Person("서동우", 1);

        assertThat(person.getName(), is("서동우"));
        assertThat(person.getId(), is(1));
    }

    @Test
    public void personWithIdStringTypeTest() {

        PersonWithIdStringType person = new PersonWithIdStringType("서동우", "wdqwdqwdwqd");
        PersonWithIdStringType person2 = PersonWithIdStringType.builder()
                .id("서동우")
                .name("qwdqwdwqdqwdq").build();


        assertThat(person.getName(), is("서동우"));
        assertThat(person.getId(), is("wdqwdqwdwqd"));
    }

    @Test
    public void personWithObjectTest() {
        PersonWithObject person = PersonWithObject.builder()
                .id("wdqwdwwdqwd")
                .name(Name.builder().firstName("동우").lastName("서").build())
                .build();

        assertThat(person.getName().toString(), is("동우 서"));
        assertThat(person.getId().toString(), is("wdqwdwwdqwd"));
    }

    @Test(expected = RuntimeException.class)
    public void notValidPersonWithObjectTest() {
        PersonWithObject person = PersonWithObject.builder()
                .id("wdqwdwwdqwd")
                .name(1123)
                .build();
    }

    @Test
    public void notValidPersonWithGenericsTest() {
        PersonWithGenerics<Name, String> person =
                PersonWithGenerics.<Name, String>builder()
                .id("wdqwdwwdqwd")
                .name(Name.builder().lastName("wqdqwdwqd").firstName("qwdqwdqd").build())
                //.name("dwquidwhuqduhiqdhqui")
                .build();

        assertThat(person.getName().toString(), is("qwdqwdqd wqdqwdwqd"));
        assertThat(person.getId(), is("wdqwdwwdqwd"));
    }

    @Test
    public void rawGenericTypeTest() {
        PersonWithGenerics person =  PersonWithGenerics.builder()
                .id("wqdqwdwqd").name("qwdqwdqwdqwd").build();
        //PersonWithGenerics person2 = new PersonWithGenerics("", "");

        assertThat(person.getName().toString(), is("qwdqwdqwdqwd"));
        assertThat(person.getId(), is("wqdqwdwqd"));
    }

    @Test
    public void runWithTest() {
        Person person = Person.builder().id(1).name("서동우").build();
        Person person2 = Person.builder().id(2).name("우하하").build();

        assertThat(person.runWith(person2), is("서동우는 우하하과 함께 뜁니다."));
    }

    @Test
    public void runWithTest2() {
        Animal animal = Dog.builder().build();
        Animal animal2 = Dog.builder().build();
        Person person2 = Person.builder().id(2).name("우하하").build();

        assertThat(animal.runWith(person2), is("개는 우하하과 뜁니다."));
        //assertThat(animal.runWith(animal2), is("개는 우하하과 뜁니다."));
    }

    @Test
    public void wildCardTest() {
        PersonWithGenerics<?, ?> person =
                PersonWithGenerics.<Name, String>builder()
                        .id("wdqwdwwdqwd")
                        .name(Name.builder().lastName("wqdqwdwqd").firstName("qwdqwdqd").build())
                        .build();

        PersonWithGenerics<?, ?> person2 =
                PersonWithGenerics.<String, String>builder()
                        .id("wdqwdwwdqwd")
                        .name("dwquidwhuqduhiqdhqui")
                        .build();

        PersonWithGenerics<Object, Object> person3 =
                PersonWithGenerics.builder()
                        .id("wdqwdwwdqwd")
                        .name("dwquidwhuqduhiqdhqui")
                        .build();

        PersonWithGenerics<? extends Animal, ? extends String> person4 =
                PersonWithGenerics.<Dog, String>builder()
                        .id("wdqwdwwdqwd")
                        .name(Dog.builder().build())
                        .build();

        PersonWithGenerics<? super Name, ? super String> person5 =
                PersonWithGenerics.builder()
                        .id("wdqwdwwdqwd")
                        .name(Name.builder().lastName("wqdqwdwqd").firstName("qwdqwdqd").build())
                        .build();

        assertThat(person.getName().toString(), is("qwdqwdqd wqdqwdwqd"));
        assertThat(person.getId(), is("wdqwdwwdqwd"));
    }


}
