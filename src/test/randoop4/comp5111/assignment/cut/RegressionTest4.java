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
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray3 = new double[] { (short) -1, (-1.0f), '4' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", 16, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", (-239));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", false, (-39), (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (int) '#', 87);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", pattern1, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     " + "'", str3, "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 298);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 15, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        short[] shortArray4 = new short[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, 0, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", (-21), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        char[] charArray8 = new char[] { '#', '4', ' ', '#', '\000' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", pattern1, "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        long[] longArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n" + "'", str3, "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", (int) 'a', (-537));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 36, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\n\n\n", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "   \n  \n  \n  \n  \n  \n  \n  \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     " + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n]");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 0, (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n  \n  \n  \n  \n  \n  \n", "\n \n", "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, " \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", "\rh\ri\r!\r", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r" + "'", str3, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-47) + "'", int3 == (-47));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        char[] charArray12 = new char[] { ' ', '#', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", pattern1, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n" + "'", str3, "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (-94), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 25, 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 31, (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", 3, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r" + "'", str3, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n", 65, 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) " \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", (java.lang.CharSequence) " \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 0, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", false, (int) '\000', (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", 32, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "\r", " ", "\r", "hi!", "\r", "hi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        java.lang.Class<?> wildcardClass11 = charSequenceArray6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", false, 22, (java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (-22), (-39));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", " \n  \n  \n  \n  \n  \n  \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n \n \n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        char[] charArray9 = new char[] { '#', '4', ' ', '#', '\000' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     " + "'", str3, "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        char[] charArray6 = new char[] { ' ', '#', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n \n\n\n \n\n\n \n\n\n", pattern1, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n \n\n\n \n\n\n \n\n\n" + "'", str3, "\n\n\n \n\n\n \n\n\n \n\n\n");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", pattern1, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     " + "'", str3, "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?h?i?!??h?i?!??h?i?!??h?i?!??h?i?!??h?i?!?     ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\n\n\n", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", pattern1, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", 7, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n", "\n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n", "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", charSequence1, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 191 + "'", int1 == 191);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n", "", "   \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n    \n    \n    \n\n   \n" + "'", str3, "   \n    \n    \n    \n\n   \n");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", 1, (-537));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", 63, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n", 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 159, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (-21), (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n \n \n \n", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", pattern1, " \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '#', '4', ' ', '#', '\000' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        char[] charArray5 = new char[] { ' ', '#', ' ' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "   \n", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", pattern1, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \n    \n    \n    \n\n   \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?    ?    ?    ??   ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 78 + "'", int1 == 78);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n \n\n\n \n\n\n \n\n\n", "\n\n\n\n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        char[] charArray0 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", "\n \n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r" + "'", str3, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     ", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     " + "'", str3, "\r\r\r\r\r\r     ");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", (java.lang.CharSequence) "\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray13 = new char[] { ' ', '#', ' ' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n", 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) " \n  \n", 239);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", pattern1, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r     ", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        float[] floatArray4 = new float[] { (-15), 5, 'a', 7 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        java.lang.Class<?> wildcardClass8 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-15.0, 5.0, 97.0, 7.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", 31, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n", 0, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", pattern1, "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n" + "'", str3, "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", 72, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r     ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        short[] shortArray3 = new short[] { (short) -1, (byte) 0, (short) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        java.lang.Class<?> wildcardClass10 = shortArray3.getClass();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[-1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n", true, (int) (byte) 1, (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (-537), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n \n \n \n \n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-39) + "'", int3 == (-39));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        char[] charArray3 = new char[] { '\n', 'a' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, a]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", 78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", " \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", "   \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \n    \n    \n    \n\n   \n", "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", (java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (int) '\000', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n \n\n\n \n\n\n \n\n\n", " ", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n" + "'", str3, "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int[] intArray2 = new int[] { 42, 19 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[42, 19]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", 14, 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charSequence1, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", false, 64, (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", 159, 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", pattern1, "\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", (-65), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-65), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n \n \n \n \n", " \n  \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-91), 31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        char[] charArray6 = new char[] { '4', 'a' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n" + "'", str3, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\n\n\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 39, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", (int) (byte) 10, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", " \n  \n  \n  \n  \n  \n  \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, true]");
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
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 39, (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", 0, (-238));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n", 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n" + "'", str3, "   \n");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r", " \n  \n  \n  \n  \n  \n  \n  \n", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-72), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", 203);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 203 + "'", int3 == 203);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", (java.lang.CharSequence) "   \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", (-47), 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", 29, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", "\r\r\r\r\r\r     ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 348 + "'", int3 == 348);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", " \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", 191);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int[] intArray5 = new int[] { 36, (byte) 1, 31, (short) 10, 8 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[36, 1, 31, 10, 8]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n", 239, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", false, 57, (java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n" + "'", str3, "   \n");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charSequence1, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        char[] charArray8 = new char[] { '\r', ' ', ' ', 'a', 'a', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r  aa\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r  aa\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r,  ,  , a, a, \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        char[] charArray6 = new char[] { ' ', '#', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n\n \n\n\n \n\n\n \n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, 0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", false, 42, (java.lang.CharSequence) "\n \n \n \n \n \n \n \n", 16, 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r     ", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", false, (int) '\000', (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (-94), 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", pattern1, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 203);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\n\n", pattern1, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n" + "'", str3, "\n\n\n\n\n\n");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n", pattern1, "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n" + "'", str3, " \n  \n");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n", pattern1, "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n \n\n\n \n\n\n \n\n\n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n \n\n\n \n\n\n \n\n\n" + "'", str3, "\n\n\n \n\n\n \n\n\n \n\n\n");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-98) + "'", int3 == (-98));
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", 6, 348);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        char[] charArray9 = new char[] { '#', '4', ' ', '#', '\000' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", false, (-239), (java.lang.CharSequence) " \n  \n", 298, 119);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 15, (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", (-1), 57);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", false, 122, (java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", 78, 14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", 119, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        int[] intArray6 = new int[] { 3, 1, (byte) 0, 10, 100, 10 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 1, 0, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", 10, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "hi!", "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n \n \n \n \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", 122, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (-65));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charSequence1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "\n", "\n \n \n \n \n \n \n \n", "\n" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n,  , \n, \n, \n,  , \n, \n, \n,  , \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 78 + "'", int1 == 78);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int[] intArray6 = new int[] { 1, 1, (short) 0, (byte) -1, (short) -1, (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 0, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", (-3), 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", true, 58, (java.lang.CharSequence) "\n \n", 159, 36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (-5), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", true, 87, (java.lang.CharSequence) "\n \n \n \n", 40, 57);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (-65));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", 28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        java.lang.Class<?> wildcardClass3 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        short[] shortArray6 = new short[] { (short) -1, (short) 10, (short) -1, (short) 1, (byte) 10, (short) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        java.lang.Class<?> wildcardClass11 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 10, -1, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 203);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \n,  , \n, \n, \n,  , \n, \n, \n,  , \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 4, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r" + "'", str3, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", (java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n", pattern1, "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n" + "'", str3, " \n  \n");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 32, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        float[] floatArray4 = new float[] { (short) 0, 3, 100.0f, ' ' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 3.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "   \n", "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "   \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n  \n  \n  \n  \n  \n  \n  \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", "\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 16, (-537));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\n\n\n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", 57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n", pattern1, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charSequence1, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", " \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r\r\r\r\r\r     ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\n\n\n", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        double[] doubleArray1 = new double[] { (short) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 119 + "'", int15 == 119);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 147 + "'", int3 == 147);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        java.lang.Class<?> wildcardClass6 = longArray0.getClass();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n" + "'", str3, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '#', '4', ' ', '#', '\000' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (-239), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\r", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n", 94, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\n", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", false, 0, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", (-3), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        long[] longArray2 = new long[] { 239, '\r' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[239, 13]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n", pattern1, "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n", false, 103, (java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 6, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (-15), 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", 4, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n \n \n \n \n", "", " \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n" + "'", str3, " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }
}

