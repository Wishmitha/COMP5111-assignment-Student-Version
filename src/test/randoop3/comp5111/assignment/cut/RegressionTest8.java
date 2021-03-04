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
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r \r \r \n \r \r \r ", " \r\r   \r\r \r \r\r \r \r\r ", " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \n \r \r \r " + "'", str3, " \r \r \r \n \r \r \r ");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r" + "'", str3, "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!\r hi!\r hi!", pattern1, "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi!" + "'", str3, " hi!  hi!\r hi!\r hi!");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r", (-753), (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "  \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r \r \r \n \r \r \r ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \rhi!    \r\r \r \r\r \r \r\r ", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "   \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! \r \rhi! \n \rhi! \r \rhi! ", pattern1, " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r", (int) ' ', 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        float[] floatArray2 = new float[] { 100L, 100.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        boolean[] booleanArray6 = new boolean[] { false, true, true, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r", 21, 286);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rhi!  \rhi! ", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r" + "'", str3, "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", pattern1, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", "   \rhi!  \rhi!   \rhi!  \rhi! ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!" + "'", str3, " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", pattern1, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r", (java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", " ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        char[] charArray8 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", "\r\n\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \rhi!    \r\r \r \r\r \r \r\r ", "  hi! \rhi!  \rhi! ", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "   \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi! ?hi!  ?hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rhi!  \rhi! ", 83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        char[] charArray11 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! ", " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r", " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        boolean[] booleanArray6 = new boolean[] { false, true, true, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r   \r\r \r \r\r \r \r\r ", " hi!  hi!\r hi!\r hi!", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r " + "'", str3, " \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !,  ,  ,  , h, i, !, h, i, !,  , \r,  , h, i, !, h, i, !,  , \r,  , h, i, !, h, i, !,  ,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  ]");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 287 + "'", int1 == 287);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", 6, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \rhi!  \rhi!   \rhi!  \rhi! ", " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 22, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 715 + "'", int3 == 715);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        char[] charArray4 = new char[] { '#' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", "  hi! \rhi!  \rhi! ", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        short[] shortArray1 = new short[] { (byte) 10 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        short[] shortArray2 = new short[] { (byte) -1, (byte) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass4 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        int[] intArray1 = new int[] { (-23) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-23]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r", "\r", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \rhi!", 295);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 286, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", 29, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! ", "\n", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (-121));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r\n\r", (java.lang.CharSequence) "  ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-298) + "'", int3 == (-298));
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r", (java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", true, 139, (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (-12), 139);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \rhi!  \rhi! ");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (-79));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \rhi!    \r\r \r \r\r \r \r\r ", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "   \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass17 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", " \rhi! ", " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! " + "'", str3, "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! ", 1, (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (-29), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (-4), 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", charArray8);
        java.lang.Class<?> wildcardClass18 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", 63, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi! ", false, 715, (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (int) (byte) 10, 293);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", " hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 57, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\n\r", (java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", pattern1, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\n\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  , \r, h,  , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  , \r, i,  , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  , \r, !,  , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   ", (java.lang.CharSequence) "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , h, i, !,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false, (-21), charSequence3, 17, 288);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "\n\rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r" + "'", str3, "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass14 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \rhi!    \r\r \r \r\r \r \r\r ", pattern1, " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "   \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "  \r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (-18), 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", (java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (-136));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", false, 5, (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", 13, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", 21, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        short[] shortArray3 = new short[] { (byte) 0, (short) 100, (short) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! ", 20, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r", (java.lang.CharSequence) "  \r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", 127);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", 719);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!" + "'", str3, " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \rhi!  \rhi!   \rhi!  \rhi! ", "  ", "  hi!hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! " + "'", str3, "  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi!  hi!hi! \rh hi!i \r\r! \r\r \rhi!  hi!hi! \rh hi!i \r\r! \r\r\rhi! ");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi! ", true, (-19), (java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (-24), (-14));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", 715);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        int[] intArray5 = new int[] { 91, 91, '4', 1, (-14) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[91, 91, 52, 1, -14]");
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
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", 80, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "   \r\rh \r\ri \r\r! \r\r \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r", " \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", (java.lang.CharSequence) "  \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", 85, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        double[] doubleArray6 = new double[] { 2, (-137), 139, (byte) 10, 139, 726 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.0, -137.0, 139.0, 10.0, 139.0, 726.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! \rh \r\ri \r\r! \r\r", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, "  hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass3 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi! \rhi!  \rhi! ", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi! \rhi!  \rhi! " + "'", str3, "  hi! \rhi!  \rhi! ");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 172);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", "", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r", true, (int) (short) 10, (java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", 21, 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! ", 83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        int[] intArray2 = new int[] { 72, 'a' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[72, 97]");
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
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        int[] intArray6 = new int[] { 719, 121, 8, 5, 21, (-12) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[719, 121, 8, 5, 21, -12]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r \n \r \r \r ", pattern1, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \n \r \r \r " + "'", str3, " \r \r \r \n \r \r \r ");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "\n\rhi!  \rhi! ", 726);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!  \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", (-120));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, -1, 0, 0]");
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
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \rhi!  \rhi!   \rhi!  \rhi! ", " \rhi!  \rhi! ", "  hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! " + "'", str3, "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        char[] charArray11 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", "\r\n\r", " \r \r \r \n \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!" + "'", str3, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r" + "'", str3, " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false, (int) '\000', charSequence3, 12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! ", charSequence1, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 286);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ", " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! " + "'", str3, "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    hi! ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi!   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-136));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) '\000', 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!" + "'", str3, " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "    hi! \rhi!  \rhi!    hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  , h, i, !,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  , \r, h,  , h, i, !, i,  , \r, \r, !,  , \r, \r]");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        char[] charArray10 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

