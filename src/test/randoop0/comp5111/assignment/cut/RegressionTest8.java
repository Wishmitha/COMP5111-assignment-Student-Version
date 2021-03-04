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
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n   \n   \n\r ", "\n", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r " + "'", str3, "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n hi!\n hi!\n", pattern1, " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n hi!\n hi!\n" + "'", str3, "hi!\n hi!\n hi!\n");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 0, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 226 + "'", int1 == 226);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", 133, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        char[] charArray10 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", true, (-2), (java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", 1, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("                   ", pattern1, "hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (-31), 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    ");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        double[] doubleArray1 = new double[] { 1.0d };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\n   \n   \n   \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", 8, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n,  , h, i, !, \n,  , h, i, !, \n]");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", pattern1, "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \n,  ,  ,  , \n,  ,  ,  , \n,  ,  ,  , \n, \r,  , \r,  , \r,  , \r,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \n, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", "                   ", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", " \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\rhi!", 0, 496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ", pattern1, "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r " + "'", str3, "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!" + "'", str3, "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " \n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", "    h    i    !    \n    ", "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) " \n\nhi!\n", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        short[] shortArray2 = new short[] { (short) 1, (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", " \r \r \r ", "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        char[] charArray9 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", pattern1, " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!    ", (java.lang.CharSequence) "\r", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        long[] longArray3 = new long[] { (-3), (-1L), 91 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-3, -1, 91]");
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
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", pattern1, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n" + "'", str3, "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n hi!\n hi!\n", "hi!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        float[] floatArray1 = new float[] { '4' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[52.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    ", (java.lang.CharSequence) "   ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        char[] charArray9 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  \n \n \n \n \n \nhi!", "\n", "hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!" + "'", str3, "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (-4), 639);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        char[] charArray9 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", pattern1, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "hi!  \n \n \n \n \n \nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (-23));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n   \n   \n", pattern1, "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\rhi!", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        char[] charArray14 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray14);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray14);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray14);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray14);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray14);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray14);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray14);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray14);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray14);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n   \n   \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (java.lang.CharSequence) "                   ", 559);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (int) (short) 10, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   ", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", 47, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        long[] longArray6 = new long[] { (short) 100, 0, (byte) 1, (byte) 10, 'a', 16 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 0, 1, 10, 97, 16]");
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
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\nhi!\n", 26, 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", 24, 226);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!    ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n\r ", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r  \r \r \r \r\n\r\n\r\n \r \r ", "   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 139 + "'", int13 == 139);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\nhi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        long[] longArray3 = new long[] { (byte) 0, (-94), (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -94, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", " \r  \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r \r \r \n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, " \r  \r \r \r \n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r \r ", (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!", 0, (-69));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!" + "'", str3, "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", (-559));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.lang.String[] strArray1 = new java.lang.String[] { "\n" };
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", 0, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 40, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n", "\n   \n   \n   \n", " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n hi!\n hi!\n", false, 72, (java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (-23), 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r   \r \r \r ", 0, 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\nhi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  ", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\rhi!", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\rhi!" + "'", str3, "hi!hi!\rhi!");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\nhi!\n", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r  \r \r \r \n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", " ", "\r", "\r", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", (java.lang.CharSequence) "    ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "hi!    ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\r\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \r, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n   \n   \n   \n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r  \r \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n\r\n\r\n \r \r ", "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r " + "'", str3, " \n\r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double[] doubleArray4 = new double[] { 1L, '4', ' ', 1.0f };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 52.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    ", pattern1, "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 639, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    h    i    !    \n    ", (int) '\000', (-496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \n, \r, \n, \r, \n, \r, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \r, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \r, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", pattern1, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n" + "'", str3, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??   ?   ?   ?? ? ? ? ??????????????????????? ??????????????? ??????????????? ???????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r \r ", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { '#', 'a', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\nhi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) " \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \r, h, i, !, \n, \n, h, i, !, \n,  , h, i, !, \n, \n, h, i, !, \n]");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", pattern1, "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (-31), 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n   \n   \n   \n\r ", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", "hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n\r " + "'", str3, "\n   \n   \n   \n\r ");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        char[] charArray11 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n", " \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n   \n   \n   \n\r ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n   \n   \n   \n\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n   \n   \n   \n\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  ,  ,  , \n,  ,  ,  , \n,  ,  ,  , \n, \r,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", pattern1, "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\rhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double[] doubleArray5 = new double[] { 10, (-4), (byte) 10, 10L, (byte) -1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, -4.0, 10.0, 10.0, -1.0]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n   \n   \n\r ", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", 47, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\r\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \r, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "\n   \n   \n   \n\r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        short[] shortArray2 = new short[] { (short) 1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r  \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", 102, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        char[] charArray7 = new char[] { '#', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", 63, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        float[] floatArray2 = new float[] { 100, '#' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", true, 441, (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", 351, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", 559, 441);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence5, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \n, \r, \n, \r, \n, \r, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \r, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \r, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n" + "'", str3, "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        java.lang.String[] strArray1 = new java.lang.String[] { "\n" };
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\rhi!", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\rhi!" + "'", str3, "hi!hi!\rhi!");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        double[] doubleArray4 = new double[] { 1L, '4', ' ', 1.0f };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 52.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (java.lang.CharSequence) "    h    i    !    \n    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n\r\n\r\n\r\n \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r \r ", 20, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { '#', 'a', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", 4, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!\n   \n   \n   \nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!\n   \n   \n   \nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, \n,  ,  ,  , \n,  ,  ,  , \n,  ,  ,  , \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        char[] charArray9 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (-69));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", " \r \r \r ", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n   \n   \n   \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n   \n   \n   \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n   \n   \n   \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ,  ,  , \n,  ,  ,  , \n,  ,  ,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", (java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", (int) '\000', 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\rhi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n   \n   \n   \n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !, \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (java.lang.CharSequence) "\n   \n   \n   \n\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, charSequence1, 351);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\nhi!\n", false, (-31), charSequence3, (-495), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, (int) (short) 100, (java.lang.CharSequence) " \r \r \r   \r \r \r ", (int) (byte) 10, 79);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n   \n   \n   \n\r ", "hi!hi!\rhi!", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n\r " + "'", str3, "\n   \n   \n   \n\r ");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r  \r \r \r ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", (-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", " ", "\r", "\r", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    h    i    !    \n    ", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", 15, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence5, charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", false, (-13), (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 90, 615);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "  \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        double[] doubleArray1 = new double[] { 4 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[4.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n   \n   \n   \n\r ", pattern1, "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n\r " + "'", str3, "\n   \n   \n   \n\r ");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r  \r \r \r ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r \r \r " + "'", str3, " \r  \r \r \r ");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\nhi!\n", (-63));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (-10));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", " \r  \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   ", (java.lang.CharSequence) "hi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        char[] charArray10 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (-180), (-496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n   \n   \n   \n", " \n\nhi!\n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray11 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence6, charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\rhi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray11);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        long[] longArray6 = new long[] { 16, (-1), (short) 1, 3, (short) 10, '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[16, -1, 1, 3, 10, 35]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        char[] charArray10 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??   ?   ?   ?? ? ? ? ??????????????????????? ??????????????? ??????????????? ?????????hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        float[] floatArray5 = new float[] { 33, 615, 213, 100, 94 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[33.0, 615.0, 213.0, 100.0, 94.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \n,  ,  ,  , \n,  ,  ,  , \n,  ,  ,  , \n, \r,  , \r,  , \r,  , \r,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "                   ", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", 179, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n", (-94), 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        short[] shortArray4 = new short[] { (byte) 1, (short) -1, (short) 1, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, -1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n                   \n                   \n                   \n\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", 180);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        char[] charArray8 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!    ", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!    " + "'", str3, "hi!    ");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n   \n   \n   \n\r ", pattern1, "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n\r " + "'", str3, "\n   \n   \n   \n\r ");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
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
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", (-22), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        char[] charArray7 = new char[] { '#', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-33) + "'", int3 == (-33));
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        long[] longArray1 = new long[] { (-94) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-94]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        boolean[] booleanArray5 = new boolean[] { true, false, true, false, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        java.lang.Class<?> wildcardClass7 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\r\n\r\n", "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "hi!", "", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        java.lang.Class<?> wildcardClass9 = charSequenceArray4.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", 98, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n   \n   \n   \n\r ", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", (java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    h    i    !    \n    ", "\n   \n   \n   \n", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h    i    !    \n    " + "'", str3, "    h    i    !    \n    ");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", 23, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n   \n   \n   \n", " \n\nhi!\n", "hi!hi!\n   \n   \n   \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \n, \r, \n, \r, \n, \r, \n,  , \r,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    h    i    !    \n    ", 19, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n                   ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-178) + "'", int3 == (-178));
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!    ", "hi!", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n    " + "'", str3, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n    ");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n    ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (-69), 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   ", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "hi!hi!\n   \n   \n   \nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        boolean[] booleanArray6 = new boolean[] { false, true, false, false, false, false };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!\rhi!", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, 132, (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", 615, (-9));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r  \r \r \r ", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r \r \r " + "'", str3, " \r  \r \r \r ");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r ", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", true, (-1), (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", 180, (-559));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) " \r \r \r   \r \r \r ", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r     h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\nhi!\n", " \n\r\n\r\n\r\n \r \r ", " \r  \r \r \r \n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\nhi!\n" + "'", str3, " \n\nhi!\n");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!", " \r \r \r ", "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!" + "'", str3, "hi!\rhi!");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!   \n   \n   \n\r ", (java.lang.CharSequence) "hi!\n\nhi!\n", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        boolean[] booleanArray6 = new boolean[] { true, true, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (int) (short) 10, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r  \r \r \r \r\n\r\n\r\n \r \r ", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\n   \n   \n   \n\r \r \r \r ", pattern1, "hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r " + "'", str3, " \r\n   \n   \n   \n\r \r \r \r ");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r  \r \r \r \n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  \n \n \n \n \n \nhi!", "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-60) + "'", int3 == (-60));
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "\n  \r \r \r  h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        float[] floatArray6 = new float[] { '4', 9, 559, 1, (-1L), (-22) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 9.0, 559.0, 1.0, -1.0, -22.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  ,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, h, i, !, h, h, i, !,  ,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, h, i, !, i, h, i, !,  ,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, h, i, !, !, h, i, !,  ,  , \n,  , \n,  , \n,  , \n,  , \n,  , \n, h, i, !]");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 71 + "'", int1 == 71);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", 33, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", true, 639, (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", 179, 98);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        short[] shortArray4 = new short[] { (byte) 100, (short) 10, (short) 1, (short) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass9 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\rhi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !, \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", (java.lang.CharSequence) "\n \n \n \n", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", "                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\nhi!\n", (java.lang.CharSequence) "\n   \n   \n   \n\r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (-178));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \r \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ", "hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n" + "'", str3, "\n \n \n \n");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", (java.lang.CharSequence) "hi!  hi!  \n \n \n \n \n \nhi! \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\nhi!\n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", "\n \n \n \n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "                   ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n   \n   \n   \n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}

