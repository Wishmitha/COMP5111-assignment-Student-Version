package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-10), 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", pattern1, "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", (int) '\000', 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, 4, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 805, (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-32) + "'", int3 == (-32));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 694);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 710, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", 3, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "\n", "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (java.lang.CharSequence) " hi!hi!hi!", 696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", 694);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 766);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        char[] charArray3 = new char[] { '\n', '#', ' ' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        boolean[] booleanArray3 = new boolean[] { false, false, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 649 + "'", int3 == 649);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        char[] charArray4 = new char[] { '\n', '#', ' ' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", true, 7, (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", 2, 694);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! ", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 538, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", true, 0, (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", 116, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!", true, 3, charSequence3, (-84), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", false, 7, (java.lang.CharSequence) "", (-91), (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] { '4', ' ', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", (int) (short) 100, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        boolean[] booleanArray4 = new boolean[] { false, false, false, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (byte) -1, (-1) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) objArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        char[] charArray6 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "hi!hi!hi!hi!", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (-124), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charSequence1, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (-15), 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", 14, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 699);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 649 + "'", int1 == 649);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 349 + "'", int3 == 349);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", 691);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!hi!hi!hi!hi!hi!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!hi!hi!hi!hi!hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        double[] doubleArray4 = new double[] { 10.0d, 100L, 0.0f, (-1) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", 16, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 12, (-120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        long[] longArray3 = new long[] { (-20), 4, (short) 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-20, 4, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (int) '4', 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!", 340);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 340 + "'", int3 == 340);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 45, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        char[] charArray8 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charSequence1, 699);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true, (int) '\r', (java.lang.CharSequence) "", (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 45, (-124));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!" + "'", str3, " hi!hi!");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 0, (-849));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-32));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\r", true, (-3), (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-20), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !]");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", false, 519, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", 66, (-833));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 129, 696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        char[] charArray10 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 697);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 3, 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\r", false, (int) (short) -1, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-91), (-10));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        double[] doubleArray6 = new double[] { 100, (byte) 0, (byte) 10, 10, 10L, '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 0.0, 10.0, 10.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r", 849, 249);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        char[] charArray9 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (-124));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) " ", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        long[] longArray6 = new long[] { (-18), 'a', (-694), (-12), '\n', (-1) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-18, 97, -694, -12, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true, 0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!", 693, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! ", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        double[] doubleArray1 = new double[] { (short) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (-833));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray11);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\n\rhi!hi!hi!\n", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\n");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        long[] longArray2 = new long[] { (short) 10, 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass6 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        float[] floatArray2 = new float[] { (short) 100, '4' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", 0, 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 2, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!\r", pattern1, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\r" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, 44, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (-7), 116);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-9), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", true, 49, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 100, (-849));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", true, 713, (java.lang.CharSequence) " hi!", 24, 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        long[] longArray5 = new long[] { '\n', 693, 1L, (-9), (-6) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 693, 1, -9, -6]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!", pattern1, "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (int) '\r', 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-6));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", 246);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 6, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", " hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", 231);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, i, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        short[] shortArray4 = new short[] { (short) -1, (byte) -1, (short) 1, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass7 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, -1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\r", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", pattern1, " hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!\r", " hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\n", false, 710, charSequence3, 66, 710);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 132);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, 69, (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-1), 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 10, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        char[] charArray8 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!" + "'", str3, "hi!hi!hi!");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, (int) 'a', (java.lang.CharSequence) " ", 0, 696);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = new char[] { '4', ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-697) + "'", int3 == (-697));
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (int) '\r', (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        short[] shortArray3 = new short[] { (short) 100, (short) 100, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        float[] floatArray3 = new float[] { (-833), 0L, 246 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-833.0, 0.0, 246.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 42 + "'", int3 == 42);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence0);
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 352 + "'", int1 == 352);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        float[] floatArray3 = new float[] { 91, (-1L), 6 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[91.0, -1.0, 6.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 116);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!" + "'", str3, " hi!hi!hi!");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi!hi!hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!", 45, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!hi!\n\rhi!hi!hi!\n", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, 129, (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", 4, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 132 + "'", int3 == 132);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        short[] shortArray5 = new short[] { (byte) 10, (short) -1, (byte) 0, (byte) 0, (short) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        java.lang.Class<?> wildcardClass14 = shortArray5.getClass();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!", 49, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass20 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!", false, 6, (java.lang.CharSequence) "hi!hi!hi!\r", (int) '#', 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", false, (-6), (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (int) '\r', 21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true, (-1), (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 12, 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray12 = new char[] { '4', ' ', '#' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence8, charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-26), 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.lang.Object obj1 = new java.lang.Object();
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        char[] charArray19 = new char[] { ' ', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray19);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray19);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray19);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray19);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray19);
        byte[] byteArray25 = new byte[] {};
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean28 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        boolean boolean29 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { '\000', obj1, 3, charArray8, boolean24, byteArray25 };
        boolean boolean31 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!", true, 694, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 249, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", 15, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        char[] charArray6 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (int) (short) 0, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (-21));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! " + "'", str3, "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", 538, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!?hhi!hi!hi!?ihi!hi!hi!?!hi!hi!hi!??hi!hi!hi!?hi!hi!hi!hi! hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence5, charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !, \n,  , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !, h,  , h, i, !, h, i, !, i,  , h, i, !, h, i, !, !,  , h, i, !, h, i, !]");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-32), 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!", (-6));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 7, 538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\r", 682);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        boolean[] booleanArray3 = new boolean[] { false, false, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 91, (-849));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", " hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", "hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 214 + "'", int1 == 214);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!hi!hi!", 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!", (-72), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 16, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\n", false, (-6), (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", (-697), 42);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\r", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", 246);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        char[] charArray7 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\n", (-32), 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, (-694), (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charSequence1, 713);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 670 + "'", int1 == 670);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 69, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (int) '\r', 519);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 66);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 0, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 14, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", false, (int) (byte) 100, (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (int) (byte) 10, (-697));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }
}

