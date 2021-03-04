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
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (java.lang.CharSequence) "   \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\n  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???  ??????       ?  ?  ?  ?  ?  ?  ? ??????       ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ?  ??  ?  ?  ?  ?  ?  ?  ?????hi!?hi!?hi!?hi!?hi!?hi!?hi!?h?hi!?hi!?hi!?hi!?hi!?hi!?hi!?i?hi!?hi!?hi!?hi!?hi!?hi!?hi!?!?hi!?hi!?hi!?hi!?hi!?hi!?hi!?????hi!?hi!?hi!?hi!?hi!?hi!?hi!?h?hi!?hi!?hi!?hi!?hi!?hi!?hi!?i?hi!?hi!?hi!?hi!?hi!?hi!?hi!?!?hi!?hi!?hi!?hi!?hi!?hi!?hi!????? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", false, 29, (java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", (-238), 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        float[] floatArray6 = new float[] { 28, (byte) 0, '\r', ' ', 87, (-94) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[28.0, 0.0, 13.0, 32.0, 87.0, -94.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 131 + "'", int1 == 131);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n" + "'", str3, "\n \n");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     " + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "\r", " ", "\r", "hi!", "\r", "hi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 316 + "'", int1 == 316);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "   \n    \n    \n    \n\n   \n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass13 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        double[] doubleArray2 = new double[] { (byte) 0, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-39), 537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 341 + "'", int3 == 341);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (-21), 286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (-537), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (int) (short) 100, 316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", 341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, i, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n,  , \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, i, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 370, (-238));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) " \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        short[] shortArray2 = new short[] { (byte) 1, (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n", "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:      ?  ?  ?  ?  ?  ?  ?  ?????????????????????????????? ? ? ? ? ???????????????? ? ? ? ? ? ? ? ? ? ? ? ?    ?  ?  ?  ?  ?  ?  ?  ?????????????????????????????? ? ? ? ? ???????????????? ? ? ? ? ? ? ? ? ? ? ? ?    ?  ?  ?  ?  ?  ?  ?  ?????????????????????????????? ? ? ? ? ???????????????? ? ? ? ? ? ? ? ? ? ? ? ?  ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", (-299));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        char[] charArray5 = new char[] { ' ', '#', ' ' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 0 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        char[] charArray6 = new char[] { ' ', '#', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", (java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-95) + "'", int3 == (-95));
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        short[] shortArray2 = new short[] { (byte) 1, (byte) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass4 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n", 322, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        short[] shortArray4 = new short[] { (byte) 0, (byte) 100, (byte) 0, (short) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 100, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n  \n  \n  \n  \n  \n  \n", "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, " \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        char[] charArray11 = new char[] { '#', '4', ' ', '#', '\000' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\r\r\r\r     ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 341);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        char[] charArray9 = new char[] { '#', '4', ' ', '#', '\000' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", false, 298, (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (int) '\000', 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\rh\ri\r!\r", " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", 0, 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        long[] longArray1 = new long[] { '#' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[35]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n  \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, \n,  , \n, \n, \n,  , \n, \n, \n,  , \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 4, (-47));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r   \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", 24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

