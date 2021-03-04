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
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", 65, 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", (java.lang.CharSequence) "\n\n\n\n\n\n", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", (java.lang.CharSequence) "\r", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        long[] longArray4 = new long[] { 6, (-22), 22, 2 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[6, -22, 22, 2]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", false, (int) (byte) 10, (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (int) (byte) 0, 77);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-31));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", (java.lang.CharSequence) "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (-359), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n", pattern1, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n" + "'", str3, "\n \n");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", (-39));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n", " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n" + "'", str3, "   \n");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", 537, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", 0, 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-239) + "'", int3 == (-239));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", false, 0, (java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 2, 22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\r", "\n\n\n \n\n\n \n\n\n \n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n \n\n\n \n\n\n \n\n\n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-422) + "'", int3 == (-422));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n \n \n \n \n");
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", "\r\r\r\r\r\r     ", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", 537, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", 32, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n", (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", false, 57, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 119, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n \n\n\n \n\n\n \n\n\n", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 98, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        char[] charArray6 = new char[] { ' ', '#', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", false, (-5), (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (-98), 191);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", true, 32, (java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", 2, 14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n]");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 0, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double[] doubleArray2 = new double[] { (byte) 0, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", pattern1, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        char[] charArray5 = new char[] { '4', 'a' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", 191);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\r\r\r\r     ", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n", 6, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n \n \n \n \n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\n\n\n\n\n\n" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 3, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (-1), (-239));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\n\n\n\n \n \n \n", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n \n \n \n" + "'", str3, "\n\n\n\n\n\n\n \n \n \n");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-312) + "'", int3 == (-312));
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n    \n    \n    \n\n   \n", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n    \n    \n    \n\n   \n" + "'", str3, "   \n    \n    \n    \n\n   \n");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-4));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n" + "'", str3, " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-30) + "'", int3 == (-30));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (-312));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", 29, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", 77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-422), 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n", 22, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (java.lang.CharSequence) "\r\r\r\r\r\r     ", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", 47, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 87);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\n\n\n\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", false, (-21), (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (int) '#', 13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        long[] longArray6 = new long[] { 5, (byte) 1, 10L, 16, 2, 100L };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass8 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[5, 1, 10, 16, 2, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        char[] charArray8 = new char[] { '#', '4', ' ', '#', '\000' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", false, (-47), (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 4, 159);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, i, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n,  , \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, i, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-94), 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", pattern1, "   \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     " + "'", str3, "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n" + "'", str3, "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", "\n", " \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        char[] charArray5 = new char[] { ' ', '#', ' ' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 327);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        boolean[] booleanArray5 = new boolean[] { true, false, true, false, false };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     " + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        char[] charArray12 = new char[] { '#', '4', ' ', '#', '\000' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 119, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (-537), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", (int) '\n', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 333 + "'", int1 == 333);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", 118, (-239));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n  \n  \n  \n  \n  \n  \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, " \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 98, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n" + "'", str3, "   \n");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", (java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n", pattern1, "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n" + "'", str3, " \n  \n");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "\n\n\n\n\n\n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (-30), (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (-94), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", pattern1, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r" + "'", str3, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (-118));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 330 + "'", int1 == 330);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", 5, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", 537, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\n\n\n", " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n \n \n", "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n", pattern1, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n" + "'", str3, "   \n");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????hi!?hi!?hi!?hi!?hi!?hi!?hi!?h?hi!?hi!?hi!?hi!?hi!?hi!?hi!?i?hi!?hi!?hi!?hi!?hi!?hi!?hi!?!?hi!?hi!?hi!?hi!?hi!?hi!?hi!?????hi!?hi!?hi!?hi!?hi!?hi!?hi!?h?hi!?hi!?hi!?hi!?hi!?hi!?hi!?i?hi!?hi!?hi!?hi!?hi!?hi!?hi!?!?hi!?hi!?hi!?hi!?hi!?hi!?hi!?????hi!?hi!?hi!?hi!?hi!?hi!?hi!?h?hi!?hi!?hi!?hi!?hi!?hi!?hi!?i?hi!?hi!?hi!?hi!?hi!?hi!?hi!?!?hi!?hi!?hi!?hi!?hi!?hi!?hi!????? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n" + "'", str3, "   \n");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 111 + "'", int15 == 111);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", (java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        char[] charArray5 = new char[] { '4', 'a' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] { 'a', 'a', '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, a, #]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (-21));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", (int) (short) -1, 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 297 + "'", int1 == 297);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n" + "'", str3, "\n \n");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (int) (byte) 100, 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n\n", (-72), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", false, (-422), (java.lang.CharSequence) "\n", (-239), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "\n\n\n \n\n\n \n\n\n \n\n\n", "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n" + "'", str3, " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "\r", " ", "\r", "hi!", "\r", "hi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
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
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n \n\n\n \n\n\n \n\n\n", pattern1, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n \n\n\n \n\n\n \n\n\n" + "'", str3, "\n\n\n \n\n\n \n\n\n \n\n\n");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 0, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n", true, 327, (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", (-238), (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 4, 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 22, 147);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", 147, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        char[] charArray6 = new char[] { 'a', '4', '#', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 1, 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ?  ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ?   ?   ?   ?   ?   ?   ?   ?  ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ?   ?   ?   ?   ?   ?   ?   ?  ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ??h?i?!? ?   ?   ?   ?   ?   ?   ?   ?   ? ? ? ?  ? ? ?  ? ? ?  ? ? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", " \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 159, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", pattern1, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\n\n\n\n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n \n \n \n" + "'", str3, "\n\n\n\n\n\n\n \n \n \n");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", 39, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n \n \n \n", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", pattern1, "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        long[] longArray2 = new long[] { 239, '\r' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[239, 13]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        float[] floatArray4 = new float[] { (-15), 5, 'a', 7 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        java.lang.Class<?> wildcardClass7 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-15.0, 5.0, 97.0, 7.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n", "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n, \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!?? ??h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!??  ?  ?  ?  ?  ?  ?  ? ??h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!??  ?  ?  ?  ?  ?  ?  ? ??h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!??  ?  ?  ?  ?  ?  ?  ?  ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", 298, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n", (java.lang.CharSequence) " \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n \n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n  \n  \n  \n  \n  \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, " \n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass14);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray10);
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
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 14, (-31));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\n\n\n\n\n\n", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", false, (int) (byte) -1, (java.lang.CharSequence) "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", 28, 39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n", 2, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", (java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        boolean[] booleanArray6 = new boolean[] { true, true, false, false, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass13 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", pattern1, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
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
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?    ?    ?    ??   ? ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?  ?  ?? ?  ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        float[] floatArray4 = new float[] { (byte) 10, 3, 1.0f, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0, 3.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\n\n\n\n \n \n \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n \n \n \n" + "'", str3, "\n\n\n\n\n\n\n \n \n \n");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", pattern1, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        char[] charArray10 = new char[] { ' ', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.lang.String[] strArray6 = new java.lang.String[] { "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", "\n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", false, (int) (short) 10, (java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", (-3), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 327);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \n, \n,  , \n, \n, \n,  , \n, \n, \n,  , \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", 72, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) " \rh\ri\r!\r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        short[] shortArray6 = new short[] { (short) -1, (short) 10, (short) -1, (short) 1, (byte) 10, (short) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 10, -1, 1, 10, 0]");
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
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", true, 91, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 119, 111);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        char[] charArray8 = new char[] { '\r', ' ', ' ', 'a', 'a', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r  aa\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r  aa\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r,  ,  , a, a, \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", true, 24, (java.lang.CharSequence) " \n", 348, 191);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n" + "'", str3, " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\n\n\n", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int[] intArray6 = new int[] { (byte) 100, '\r', (short) 10, 100, (short) 0, '\n' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 13, 10, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (-239), 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", 5, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        char[] charArray9 = new char[] { ' ', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (-422));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", "\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r\rh\ri\r!\r     ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r" + "'", str3, "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!?hi!?hi!?hi!?hi!?hi!??hi!?hi!?hi!?hi!?hi!?hi!?hi!??hi!?hi!?hi!?hi!?hi!?hi!?hi!???hi!?hi!?hi!?hi!?hi!?hi!?hi!??hi!?hi!?hi!?hi!?hi!?hi!?hi!??hi!?hi!?hi!?hi!?hi!?hi!?hi!???hi!?hi!?hi!?hi!?hi!?hi!?hi!??hi!?hi!?hi!?hi!?hi!?hi!?hi!??hi!?hi!?hi!?hi!?hi!?hi!?hi!???hi!?hi!?hi!?hi!?hi!?hi!?hi!??hi!?hi!?hi!?hi!?hi!?hi!?hi!? ?hi!?hi!?hi!?hi!?hi!?hi!?hi!?  ?hi!?hi!?hi!?hi!?hi!?hi!?hi!?  ?hi!?hi!?hi!?hi!?hi!?hi!?hi!?  ?hi!?hi!?hi!?hi!?hi!?hi!?hi!?  ?hi!?hi!?hi!?hi!?hi!?hi!?hi!?  ?hi!?hi!?hi!?hi!?hi!?hi!?hi!? ?hi!?hi!?hi!?hi!?hi!?hi!?hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     ", (java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r     ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     ", pattern1, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     " + "'", str3, "\r\r\r\r\r\r     ");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n", (int) (byte) 1, 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", pattern1, "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\rh\ri\r!\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n", 7, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", pattern1, "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        short[] shortArray6 = new short[] { (byte) -1, (short) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 10, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", 10, 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??????     ???????????????????      ? ? ? ? ? ? ? ? ? ? ? ? ??????      ? ? ? ? ? ? ? ? ? ? ? ? ??????      ? ? ? ? ? ? ? ? ? ? ? ??h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!???h?i?!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", (int) '\000', (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", 122);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { " ", "", " ", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", false, 47, (java.lang.CharSequence) "\n \n \n \n \n \n \n \n", (-47), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 312 + "'", int1 == 312);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 119 + "'", int11 == 119);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\r\r\r\r     ", "\r\r\r\r\r\r     ", "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n" + "'", str3, "\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n\n");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", pattern1, " \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n" + "'", str3, "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass12 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", (java.lang.CharSequence) " \n", 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  ,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  , \r, \r, \r, \r, \r, \r,  ,  ,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n,  ,  , \n]");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r     ", pattern1, "   \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r     " + "'", str3, "\r\r\r\r\r\r     ");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  , \n]");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", pattern1, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n" + "'", str3, " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "\r", " ", "\r", "hi!", "\r", "hi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        java.lang.Class<?> wildcardClass15 = charSequenceArray6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n \n \n \n \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?  ?  ?  ?  ?  ?  ?  ??  ?  ?  ?  ?  ?  ?  ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", 6, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { " ", "", " ", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        char[] charArray8 = new char[] { '\r', ' ', ' ', 'a', 'a', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r  aa\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r  aa\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r,  ,  , a, a, \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\n\n\n\n \n \n \n", (java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", (java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n \n  \n  \n  \n  \n  \n \n", "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \r \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n" + "'", str3, "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\r\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (int) (byte) 10, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n", pattern1, "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n" + "'", str3, " \n\r \n\r \n\r \n\r \n\r \n\r \n  \n  \n  \n  \n  \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n  \n  \n\n \n");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n", 33, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\r", "\r\r\r\r\r\r     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n \n \n \n \n", " \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", 47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     h\r\r\r\r\r\r     i\r\r\r\r\r\r     !\r\r\r\r\r\r     \n\r\r\r\r\r\r     ", 78, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '#', '4', ' ', '#', '\000' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 #\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , #, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\r\r\r\r     \n\n\r\n\n\n\r\n\n\n\r\n\n\r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n \r\r\r\r\r\r      \n \n \n \n \n \n \n \n \n \n \n \n", 191, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-159) + "'", int3 == (-159));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", 10, (-359));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", (java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n", pattern1, "\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n" + "'", str3, " \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n  \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n\rh\ri\r!\r \n   \n   \n   \n   \n   \n   \n   \n   \n \n \n \n  \n \n \n  \n \n \n  \n \n \n");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "", "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" + "'", str3, "   \n  \n  \n  \n  \n  \n  \n  \n\n  \n  \n  \n  \n  \n  \n  \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", " \n  \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n", 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n\r\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n\n\n \n \n \n");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        comp5111.assignment.cut.ToolBox.CharTools charTools0 = new comp5111.assignment.cut.ToolBox.CharTools();
        java.lang.Class<?> wildcardClass1 = charTools0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        float[] floatArray4 = new float[] { (byte) 10, 3, 1.0f, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        java.lang.Class<?> wildcardClass8 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0, 3.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n, \r, \n, \n, \n,  , \n,  , \n,  , \n,  , \n,  , \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n \n\n\n \n\n\n \n\n\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n  \n  \n  \n  \n  \n  \n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r     ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n, \n, \n,  , \n, \n, \n,  , \n, \n, \n,  , \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n", (java.lang.CharSequence) "\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n", (java.lang.CharSequence) "\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "   \n    \n    \n    \n\n   \n \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", (-98));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", "", "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n" + "'", str3, "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r\r\r\r\r      \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { ' ', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r  \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r \rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\r", 7, (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        double[] doubleArray1 = new double[] { 22 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[22.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "\r", " ", "\r", "hi!", "\r", "hi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 7, (-239));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \n  \n  \n  \n  \n  \n  \n  \n   \n  \n  \n  \n  \n  \n  \n  \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", true, 191, (java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", (-65), 147);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\r\r\r\r     ", true, 6, (java.lang.CharSequence) "\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", 95, 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n", "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n", "  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n", "\r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n \r\r\r\r\r\r       \n  \n  \n  \n  \n  \n  \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n" + "'", str3, " \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n  \n  \n\n \n  \n");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n\r\r\r\r\r\r     ", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        char[] charArray8 = new char[] { ' ', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n \nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nh\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\ni\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\r\r\r\r\r         \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n    \n  \n  \n  \n  \n  \n  \n  \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n\n\n\n\r\n\n\n\r\n\n\n\r\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n \n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n\rh\ri\r!\r\n  \n  \n  \n  \n  \n  \n  \n  \n\n\n\n \n\n\n \n\n\n \n\n\n\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 341 + "'", int1 == 341);
    }
}

