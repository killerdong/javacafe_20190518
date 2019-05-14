package kr.javacafe.java20190508.enumerable;

import lombok.Getter;

import java.util.function.Supplier;

@Getter
public enum BoardTypeWithField {

    FREE_BOARD(1, "자유게시판"),
    IMAGE(2, "이미지게시판"),
    VIDEO(3, "동영상 게시판");

    private int value;
    private String korName;

    BoardTypeWithField(int value, String korName) {
        this.value = value;
        this.korName = korName;
    }
}
