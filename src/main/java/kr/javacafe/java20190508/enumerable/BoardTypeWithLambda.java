package kr.javacafe.java20190508.enumerable;

import lombok.Getter;

import java.util.function.Supplier;

@Getter
public enum BoardTypeWithLambda {

    FREE_BOARD(1, "자유게시판", () -> false),
    IMAGE(2, "이미지게시판", () -> true),
    VIDEO(3, "동영상 게시판", () -> true);

    private int value;
    private String korName;
    private Supplier<Boolean> checker;

    BoardTypeWithLambda(int value, String korName, Supplier<Boolean> checker) {
        this.value = value;
        this.korName = korName;
        this.checker = checker;
    }

    public boolean isUploadingFile() {
        return checker.get();
   }

}
