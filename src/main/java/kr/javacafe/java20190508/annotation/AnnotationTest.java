package kr.javacafe.java20190508.annotation;

import java.lang.annotation.*;

//@Inherited // 상속
//@Documented // 문서에 정보가 표현
@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후에도 JVM에 의해서 참조가 가능합니다
//@Retention(RetentionPolicy.CLASS)   // Compiler가 클래스를 참조할 때까지 유효합니다
//@Retention(RetentionPolicy.SOURCE)  // 컴파일 이후 이후 사라집니다
//@Target({
//        ElementType.PACKAGE, // 패키지 선언시
//        ElementType.TYPE, // 타입 선언시
//        ElementType.CONSTRUCTOR, // 생성자 선언시
//        ElementType.FIELD, // 멤버 변수 선언시
//        ElementType.METHOD, // 메소드 선언시
//        ElementType.ANNOTATION_TYPE, // 어노테이션 타입 선언시
//        ElementType.LOCAL_VARIABLE, // 지역 변수 선언시
//        ElementType.PARAMETER, // 매개 변수 선언시
//        ElementType.TYPE_PARAMETER, // 매개 변수 타입 선언시
//        ElementType.TYPE_USE // 타입 사용시
//})
public @interface AnnotationTest {

    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}
