package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {
    @Test
    @DisplayName("TestUtil.genScanner() 테스트")
    void t1() {
        Scanner scanner = TestUtil.genScanner("""
                등록
                커리어 스킬
                존 손메즈
                """.stripIndent());
        String cmd = scanner.nextLine();
        String content = scanner.nextLine();
        String authorName = scanner.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(content).isEqualTo("커리어 스킬");
        assertThat(authorName).isEqualTo("존 손메즈");
    }

    @Test
    @DisplayName("TestUtil.setOutToByteArray() 테스트")
    void t2() {
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutToByteArray();

        System.out.println("2 / 존 손메즈 / 커리어 스킬");

        String out = byteArrayOutputStream.toString().trim();

        assertThat(out).isEqualTo("2 / 존 손메즈 / 커리어 스킬");

        TestUtil.clearSetOutToByteArray(byteArrayOutputStream);
        System.out.println("화면에 출력합니다");
    }
}