package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", false, (int) (short) 100, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 15, (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!" + "'", str3, "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\r", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 0, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true, 183, (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (int) '\r', (-14));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", pattern1, "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! " + "'", str3, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\r", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 196, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 873, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", pattern1, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 3, (-453));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (-453));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", pattern1, "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        long[] longArray3 = new long[] { (-1L), (short) -1, (-6) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, -1, -6]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 182 + "'", int3 == 182);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", pattern1, "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true, (int) (short) 10, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 29, 196);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!? hi!hi!??hi!hi!? hi!hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 0, (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double[] doubleArray2 = new double[] { 7, (-3) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[7.0, -3.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true, 453, (java.lang.CharSequence) " ", 7, 30);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r", 94, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true, 182, (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (int) (short) -1, 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r", (int) ' ', 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rh\ri\r!\r\r\r", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (-313), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\rh\ri\r!\r\r\r", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 10, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", false, 493, (java.lang.CharSequence) " \n ", (-452), (-452));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 493);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        short[] shortArray1 = new short[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        java.lang.Class<?> wildcardClass6 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", 29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", " \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 494 + "'", int3 == 494);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-86));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false, 24, (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) '\n', 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false, 54, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 48, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        long[] longArray2 = new long[] { '4', 3 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass7 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[52, 3]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        long[] longArray6 = new long[] { 10, 24, 1, (-72), 100, (-6) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, 24, 1, -72, 100, -6]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false, 48, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 67, 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?? ? ? ?? ? ? ??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!hi!hi!?hi!hi!?hi!hi! hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\n", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", "\r\r\n", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-43));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (-452), (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\r hi!hi!\nhi!hi! hi!hi!", "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-44));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-44) + "'", int3 == (-44));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\n", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "\n", "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!" + "'", str3, "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (-401));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) "\r\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", pattern1, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r" + "'", str3, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi! hi!hi!\nhi!hi! hi!hi!", "\n\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 16, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", true, 6, (java.lang.CharSequence) "hi!", 6, 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-195) + "'", int3 == (-195));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 393, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        char[] charArray0 = new char[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 54, 477);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 122);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", 183, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) " \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n \n \n \n\n \n \n ", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        char[] charArray7 = new char[] { ' ', ' ', '#', '4', '#' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 452, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54 + "'", int3 == 54);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n ", 6, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n ", true, 452, (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 13, 21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n \n \n \n\n \n \n ", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi!hi!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, i, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, !, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, i, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, !, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \n,  , \n,  , \n,  , \n, \n,  , \n,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", charSequence1, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", charSequence1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!hi!?hi!hi!?hi!hi! hi!hi!?hi!hi!?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r" + "'", str3, "hi!hi!\r");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false, 400, (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 122, (-21));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        boolean[] booleanArray6 = new boolean[] { false, false, true, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", 787);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\r", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hi!\r", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi! hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\r hi!hi!\nhi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??? hi!hi!?hi!hi! hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        short[] shortArray5 = new short[] { (short) 1, (short) 100, (byte) 0, (short) 0, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 100, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hi!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi! hi!hi!\nhi!hi! hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!h??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!i??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!!??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!h??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!i??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!!??hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r", false, (-22), (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (int) (short) 1, 452);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\r", false, 400, (java.lang.CharSequence) " ", 122, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", true, 22, (java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 2, (-44));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", 494);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rh\ri\r!\r\r\r", " ", " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 452, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (-14), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray12);
        java.lang.Class<?> wildcardClass20 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "\r\n \n \n \n\n \n \n ", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!hi!", "\n", "\r", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charSequence1, (-313));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n]");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", 16, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 6, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 182, 183);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charSequence1, (-401));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", false, 51, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (-393), 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 491 + "'", int1 == 491);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (byte) 100, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "\r", "", "", "" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true, 103, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 0, (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", 72, 452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "", "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\r\n", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        long[] longArray3 = new long[] { (-1L), (short) -1, (-6) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, -1, -6]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true, (-3), charSequence3, (int) (byte) -1, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 493);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (short) -1, (short) -1, (byte) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, -1, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", (java.lang.CharSequence) "hi!hi!hi!\r", 183);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", 13, (-452));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", 97, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (int) (short) 1, (-43));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 19, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false, (int) '\000', (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 494, 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!hi!", "\n", "\r", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n" + "'", str3, "\r\r\n");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) " \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "", "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?????? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? ?? ? ? ?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!????hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false, (-27), (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 2, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", 0, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!", "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 494);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n", 196, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 45, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", pattern1, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! " + "'", str3, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 477);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", 453);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass10 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", false, (-27), (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", 14, (-452));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi! hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 97, (-44));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", false, (int) (byte) 0, (java.lang.CharSequence) " ", (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n ", pattern1, "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n " + "'", str3, " \n ");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", (-43), (-401));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r", pattern1, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r" + "'", str3, "\n\r\r");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        char[] charArray7 = new char[] { ' ', ' ', '#', '4', '#' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray13);
        java.lang.Class<?> wildcardClass22 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", " \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rh\ri\r!\r\r\r", "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 94, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 5, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rh\ri\r!\r\r\r", " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (int) (short) -1, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\n", true, 86, (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", 23, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-195));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-44), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\r", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r", (-24), 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 0, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, i, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, !, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, i, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, !, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \n,  , \n,  , \n,  , \n, \n,  , \n,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 453 + "'", int3 == 453);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! " + "'", str3, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false, 45, (java.lang.CharSequence) "\n\r\r", 10, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!", " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!" + "'", str3, "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (-43));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true, (-7), (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", (-6), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 7, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, \r, \r, \n,  , \n,  , \n,  , \n, \n,  , \n,  , \n,  , h, i, !, h, i, !, \r, \n,  , \n,  , \n,  , \n, \n,  , \n,  , \n,  , h, i, !, h, i, !, \r, \n,  , \n,  , \n,  , \n, \n,  , \n,  , \n,  , h, i, !, h, i, !, \r, \r, \r, \n,  , \n,  , \n,  , \n, \n,  , \n,  , \n,  , h, i, !, h, i, !, \r, \n,  , \n,  , \n,  , \n, \n,  , \n,  , \n,  , h, i, !, h, i, !, \r, \n,  , \n,  , \n,  , \n, \n,  , \n,  , \n,  , h, i, !, h, i, !]");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", true, 51, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", 23, 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 43, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        float[] floatArray2 = new float[] { 10L, (-19) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, -19.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-452), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!", pattern1, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r" + "'", str3, "hi!hi!\r");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\rhi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-72), (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\r", "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        short[] shortArray4 = new short[] { (short) 0, (short) 0, (byte) 100, (byte) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass7 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 0, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "\n", "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!" + "'", str3, "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true, 43, (java.lang.CharSequence) "\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\rhi!hi!", 63, 22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-45), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 103, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 400);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r\n \n \n \n\n \n \n \r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        double[] doubleArray1 = new double[] { 787 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[787.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 401 + "'", int3 == 401);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r\r\nhi!hi!\r\r\nhi!hi!\r\r\nhi!hi! hi!hi!\r\r\nhi!hi!\r\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!\n\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi! \n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (-45), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

