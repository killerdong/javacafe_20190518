package kr.javacafe.java20190508.enumerable;

import lombok.Getter;

@Getter
public enum BoardTypeWithAbstractMethod {

    FREE_BOARD(1, "자유게시판"){
        @Override
        boolean isUploadingFile() {
            return false;
        }
    },
    IMAGE(2, "이미지게시판") {
        @Override
        boolean isUploadingFile() {
            return true;
        }
    },
    VIDEO(3, "동영상 게시판") {
        @Override
        boolean isUploadingFile() {
            return true;
        }
    };

    private int value;
    private String korName;

    BoardTypeWithAbstractMethod(int value, String korName) {
        this.value = value;
        this.korName = korName;
    }

    abstract boolean isUploadingFile();
}
