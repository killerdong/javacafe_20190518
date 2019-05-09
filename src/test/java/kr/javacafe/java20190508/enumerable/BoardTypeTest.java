package kr.javacafe.java20190508.enumerable;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BoardTypeTest {

    @Test
    public void boardTypeTest() {
        BoardType type = BoardType.IMAGE;

        assertThat(type.ordinal(), is(1));
        assertThat(type.toString(), is("IMAGE"));
    }

//    @Test
//    public void boardTypeValueTest() {
//        BoardType type = BoardType.IMAGE;
//
//        assertThat(type.getValue(), is(2));
//    }
//
//    @Test
//    public void boardTypeNameTest() {
//        BoardType type = BoardType.IMAGE;
//        assertThat(type.getKorName(), is("이미지 게시판"));
//    }

    @Test
    public void fileUploadTest() {
        BoardType type = BoardType.IMAGE;
        assertThat(type.isUploadingFile(), is(true));

        BoardType type2 = BoardType.FREE_BOARD;
        assertThat(type2.isUploadingFile(), is(false));
    }

}
