package kr.javacafe.java20190508.enumerable;

import lombok.Getter;

import java.util.function.Supplier;

@Getter
public enum BoardType {

    FREE_BOARD,
    IMAGE,
    VIDEO;

//    FREE_BOARD(1, "자유 게시판", () -> false),
//    IMAGE(2, "이미지 게시판", () -> true),
//    VIDEO(3, "비디오 게시판", () -> true);

    private int value;
    private String korName;
    private Supplier<Boolean> checker;

//    BoardType(int value, String korName) {
//        this.value = value;
//        this.korName = korName;
//    }
//
//
//    BoardType(int value, String korName, Supplier<Boolean> checker) {
//        this.value = value;
//        this.korName = korName;
//        this.checker = checker;
//    }

//    public boolean isUploadingFile() {
//        if (BoardType.IMAGE == this || BoardType.VIDEO == this) {
//            return true;
//        }
//
//        return false;
//    }

    //abstract boolean isUploadingFile();

    public boolean isUploadingFile() {
        return checker.get();
    }

}
