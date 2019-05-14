package kr.javacafe.java20190508.enumerable;

import lombok.Getter;

@Getter
public enum BoardTypeWithMethod {

    FREE_BOARD(1, "자유게시판"),
    IMAGE(2, "이미지게시판"),
    VIDEO(3, "동영상 게시판");

    private int value;
    private String korName;

    BoardTypeWithMethod(int value, String korName) {
        this.value = value;
        this.korName = korName;
    }

    public boolean isUploadingFile() {
        if (BoardTypeWithMethod.IMAGE == this || BoardTypeWithMethod.VIDEO == this) {
            return true;
        }

        return false;
    }
}
