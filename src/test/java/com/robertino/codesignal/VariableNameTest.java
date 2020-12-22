package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VariableNameTest {

    private static VariableName variableName;

    @BeforeClass
    public static void setup() {
        variableName = new VariableName();
    }

    @Test
    public void test1() {
        String name = "var_1__Int";
        assertThat(variableName.variableName(name)).isEqualTo(true);
    }

    @Test
    public void test2() {
        String name = "qq-q";
        assertThat(variableName.variableName(name)).isEqualTo(false);
    }

    @Test
    public void test3() {
        String name = "2w2";
        assertThat(variableName.variableName(name)).isEqualTo(false);
    }

    @Test
    public void test4() {
        String name = " variable";
        assertThat(variableName.variableName(name)).isEqualTo(false);
    }

    @Test
    public void test5() {
        String name = "va[riable0";
        assertThat(variableName.variableName(name)).isEqualTo(false);
    }

    @Test
    public void test6() {
        String name = "variable0";
        assertThat(variableName.variableName(name)).isEqualTo(true);
    }

    @Test
    public void test7() {
        String name = "a";
        assertThat(variableName.variableName(name)).isEqualTo(true);
    }

    @Test
    public void test8() {
        String name = "_Aas_23";
        assertThat(variableName.variableName(name)).isEqualTo(true);
    }

    @Test
    public void test9() {
        String name = "a a_2";
        assertThat(variableName.variableName(name)).isEqualTo(false);
    }

    @Test
    public void test10() {
        String name = "0ss";
        assertThat(variableName.variableName(name)).isEqualTo(false);
    }
}
