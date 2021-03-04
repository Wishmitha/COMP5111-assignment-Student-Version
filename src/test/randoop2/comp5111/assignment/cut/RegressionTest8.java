package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, h, \r, i, \r, !, \r, h, \r, i, \r, !, \r, \r, \r, \n, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, h, \r, i, \r, !, \r, h, \r, i, \r, !, \r, \r, \r, \r, h, \r, i, \r, !, \r, h, \r, i, \r, !, \r, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, h, \r, i, \r, !, \r, h, \r, i, \r, !, \r, \r, \r,  , h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, h, \r, i, \r, !, \r, h, \r, i, \r, !, \r, \r, \r, \r, h, \r, i, \r, !, \r, h, \r, i, \r, !, \r, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", 25, 799);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, \r, \r, \r, \r, \n, \r, \r,  , \r, \r, \n, \r, \r,  , \r, \r, \n, \r, \r,  , \r, \r, \n, \r, \r, \n, \r, \r,  , \r, \r, \n, \r, \r,  , \r, \r, \n, \r, \r,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 182 + "'", int1 == 182);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r" + "'", str3, "hi!hi!\r");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 22, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "\r\n \n \n \n\n \n \n ", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        float[] floatArray3 = new float[] { 453, '\n', (-94) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[453.0, 10.0, -94.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        long[] longArray2 = new long[] { '4', 3 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[52, 3]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\r", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r" + "'", str3, "\n\r\r");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!hi!", "\n", "\r", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r,  , h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (-45));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r", (java.lang.CharSequence) "\n\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", charSequence1, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-22), 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        boolean[] booleanArray6 = new boolean[] { false, false, true, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r" + "'", str3, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-44), 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        short[] shortArray4 = new short[] { (short) 100, (byte) -1, (short) 100, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass11 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        int[] intArray1 = new int[] { (byte) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "hi!hi! hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        float[] floatArray2 = new float[] { 10.0f, (short) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (-27));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\r", " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\r", 0, 870);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r", 8, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r" + "'", str3, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n" + "'", str3, "\r\r\n");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", 27, 870);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false, 91, (java.lang.CharSequence) "\n\r\r", (-27), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", pattern1, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! " + "'", str3, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        float[] floatArray4 = new float[] { (-19), '#', 12, 45 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-19.0, 35.0, 12.0, 45.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", false, (-7), (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", 23, (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", (java.lang.CharSequence) "\r", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (int) '4', (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true, 0, (java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 87, 53);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (-393), 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-7), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        long[] longArray6 = new long[] { 10, 24, 1, (-72), 100, (-6) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass8 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, 24, 1, -72, 100, -6]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r\n \n \n \n\n \n \n ", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", charArray9);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", false, 400, (java.lang.CharSequence) " ", 4, 452);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 100, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 400, 182);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 177 + "'", int3 == 177);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n \n \n \n\n \n \n ", pattern1, "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r", false, 196, (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", 439, 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true, 103, (java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", (-14), 54);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 874);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", 183, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", true, 16, (java.lang.CharSequence) "hi!hi!hi!\r", 23, 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r", pattern1, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true, 0, (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) 'a', (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double[] doubleArray3 = new double[] { 3, (byte) 10, 'a' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[3.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        long[] longArray3 = new long[] { (short) 0, (-91), 48 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -91, 48]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (-177));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\r", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r" + "'", str3, "\n\r\r");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r\r\r\r\r \rh\ri\r!\rh\ri\r!\r\n\rh\ri\r!\rh\ri\r!\r \rh\ri\r!\rh\ri\r!\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r, \r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 13, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 80 + "'", int3 == 80);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        short[] shortArray4 = new short[] { (short) 1, (short) -1, (short) 1, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-452), 798);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r" + "'", str3, "\r\r\r\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r\n\r\r\n\r\r \r\r\n\r\r \r\r\n\r\r \r\r");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        int[] intArray4 = new int[] { (byte) 0, '\000', (short) 10, 'a' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 10, 97]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }
}

