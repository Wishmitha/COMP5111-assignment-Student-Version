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
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", (int) (short) 0, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false, 286, (java.lang.CharSequence) " \r\r", 85, (-16));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!  \rhi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  ", (-79));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rhi!  \rhi! ", 143);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-161) + "'", int3 == (-161));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \rhi!  \rhi!   \rhi!  \rhi! ", " \r\r", "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "   \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi! ", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \rhi!  \rhi!   \rhi!  \rhi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 0, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", pattern1, " hi!\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!", " \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", true, 298, (java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (-22), 643);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", false, (-120), (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi!hi! \rh \r\ri \r\r! \r\r", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, "  hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", 755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! ", 299, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!  \rhi! ", (java.lang.CharSequence) "  \r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \rhi!    \r\r \r \r\r \r \r\r ", " \rhi! \r \rhi! \n \rhi! \r \rhi! ", " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "   \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", (-23));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, (-1), (java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", (int) (short) 1, 17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\n\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", charArray8);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-121));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi!  \rhi! ", 57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", false, (-27), (java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", 27, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", pattern1, "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", (java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\rhi!  \rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\r", "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", true, 0, (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", 7, (-121));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        long[] longArray3 = new long[] { 16, 63, (byte) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[16, 63, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int[] intArray1 = new int[] { 19 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[19]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0, (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r   \r\r \r \r\r \r \r\r ", pattern1, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r " + "'", str3, " \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        float[] floatArray6 = new float[] { 10.0f, 4, 19, 2, 1.0f, (byte) 10 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 4.0, 19.0, 2.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        short[] shortArray3 = new short[] { (byte) 10, (byte) 100, (byte) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \rhi!  \rhi!   \rhi!  \rhi! ", " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "  hi!hi! \rh \r\ri \r\r! \r\r", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi! ", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", pattern1, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r" + "'", str3, "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-121));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (int) '\n', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi! ", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!\r hi!\r hi!", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi!" + "'", str3, " hi!  hi!\r hi!\r hi!");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! " + "'", str3, "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", true, (-13), (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (-17), 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        java.lang.Class<?> wildcardClass3 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charSequence1, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \r \r \r \n \r \r \r ", (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "  hi! \rhi!  \rhi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (-13), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", false, 23, (java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", 28, 17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi! ", "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "  \r\n\r", " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "\r", 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 295 + "'", int3 == 295);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (-79), (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        char[] charArray10 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\rh \r\ri \r\r! \r\r", " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charSequence1, 755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", true, (-79), (java.lang.CharSequence) "hi!", (-19), 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  , h,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  ]");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        java.lang.Class<?> wildcardClass11 = shortArray0.getClass();
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "\r", (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " \r \r \r \n \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) "  \rhi!  \rhi! ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " hi!hi! ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r" + "'", str3, " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  ,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        char[] charArray11 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", 719, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (-21));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        float[] floatArray1 = new float[] { (short) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", pattern1, "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!" + "'", str3, " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!  hi!\r hi!\r hi!", pattern1, "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi!" + "'", str3, " hi!  hi!\r hi!\r hi!");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \r\r", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!", 22, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (-79), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " hi!\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! " + "'", str3, "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 107);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", false, (-6), (java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", (-79), 18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) 'a', (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 142);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        float[] floatArray2 = new float[] { 100L, 100.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-18));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r \n \r \r \r ", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \rhi!  \rhi!   \rhi!  \rhi! ", " hi!  hi!\r hi!\r hi!", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "   \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", (-136));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", (-63), 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", pattern1, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        float[] floatArray1 = new float[] { ' ' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[32.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r", "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r" + "'", str3, "\r\n\r");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray4);
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
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\r", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r \n \r \r \r ", "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \n \r \r \r " + "'", str3, " \r \r \r \n \r \r \r ");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!  hi!\r hi!\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r", " \r\rh \r\ri \r\r! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12) + "'", int3 == (-12));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence6, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        java.lang.Class<?> wildcardClass14 = charSequenceArray3.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 127 + "'", int3 == 127);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", 147);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        java.lang.Class<?> wildcardClass10 = charSequenceArray3.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", 31, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! ", pattern1, "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! " + "'", str3, " hi!hi! ");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) "\n\rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 57, (-753));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80 + "'", int1 == 80);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (-17), 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi! \rhi!  \rhi! ", " \r \r \r \n \r \r \r ", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi! \rhi!  \rhi! " + "'", str3, "  hi! \rhi!  \rhi! ");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  hi!hi! \rh hi!i \r\r! \r\r", " hi!hi! ", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r" + "'", str3, "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", "\r", " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        char[] charArray10 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        double[] doubleArray1 = new double[] { 10 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        char[] charArray10 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ]");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", 142);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \rhi!  \rhi!   \rhi!  \rhi! ", " hi!  hi!\r hi!\r hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\n\r", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray5);
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
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", 21, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", false, 9, (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", 19, 299);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!  hi!h hi!i hi!! hi!", " \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 286, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " \rhi! ", "\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rhi!  \rhi! ", (-27));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\n\r", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!\r   \r\r \r \r\r \r \r\r ", " \rhi! \r \rhi! \n \rhi! \r \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\n\r", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 299, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass12 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", " \rhi!  \rhi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r" + "'", str3, "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \rhi! ", (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rhi!  \rhi! ", (java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!  hi!\r hi!\r hi!", " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \rhi!    \r\r \r \r\r \r \r\r ", "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " hi!\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "   \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", "  hi! \rhi!  \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!\r   \r\r \r \r\r \r \r\r ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 127, charSequence3, 28, (-136));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray7);
        java.lang.Class<?> wildcardClass16 = charArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r \n \r \r \r ", pattern1, " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \n \r \r \r " + "'", str3, " \r \r \r \n \r \r \r ");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", pattern1, " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-137) + "'", int3 == (-137));
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", charArray6);
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
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! \r \rhi! \n \rhi! \r \rhi! ", " \r\r", "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! \rh \r\ri \r\r! \r\r", pattern1, " hi!  hi!\r hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, "  hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    hi! ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi!   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi! ?hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \r \r \r \n \r \r \r ", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi! \rhi!  \rhi! ", pattern1, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi! \rhi!  \rhi! " + "'", str3, "  hi! \rhi!  \rhi! ");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", (java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r \n \r \r \r ", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !,  ,  , h, i, !,  , h, i, !,  ,  , h, i, !, \r,  , h, i, !, \r,  , h, i, !,  , h, i, !, \r,  , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", charSequence1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r   \r\r \r \r\r \r \r\r ", "  \rhi!  \rhi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r " + "'", str3, " \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", 24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", "  hi!hi! \rh hi!i \r\r! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\rhi!  \rhi! ", "   \rhi!  \rhi!   \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "", " hi!  hi!\r hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! ", 34, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!", "  \r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?hi!  ?hi! h ??i ??! ??hi! hi!   ?hi!  ?hi! h ??i ??! ??hi! hi!     ?hi!  ?hi! h ??i ??! ??hi!  ?hi!  ?hi! h ??i ??! ??hi!   ?hi!  ?hi! h ??i ??! ??hi!   ?hi!  ?hi! h ??i ??! ??hi!  ?hi!  ?hi! h ??i ??! ??hi!   ?hi!  ?hi! h ??i ??! ??hi!   ?hi!  ?hi! h ??i ??! ??hi!  ?hi!  ?hi! h ??i ??! ??hi!  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "  \rhi!  \rhi! ", (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        float[] floatArray1 = new float[] { 139 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[139.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", (java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", false, (-21), (java.lang.CharSequence) "\r\n\r", (-63), (-79));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", pattern1, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!", true, 23, (java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", 0, (-61));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "\r\n\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) "\n\rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\rhi!  \rhi! ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?hi! ? ?hi! ? ?hi! ? ?hi!   ?hi! ? ?hi! ? ?hi! ? ?hi!   ?hi! ? ?hi! ? ?hi! ? ?hi! h ?hi! ? ?hi! ? ?hi! ? ?hi! i ?hi! ? ?hi! ? ?hi! ? ?hi! ! ?hi! ? ?hi! ? ?hi! ? ?hi! h ?hi! ? ?hi! ? ?hi! ? ?hi! i ?hi! ? ?hi! ? ?hi! ? ?hi! ! ?hi! ? ?hi! ? ?hi! ? ?hi!   ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! h ?hi! ? ?hi! ? ?hi! ? ?hi!   ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! i ?hi! ? ?hi! ? ?hi! ? ?hi!   ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ! ?hi! ? ?hi! ? ?hi! ? ?hi!   ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi! ? ?hi!  ?hi!  ?hi!   hi!hi! ?h ??i ??! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \r\n\r", "\r\n\r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "  \r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", false, 29, (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", 139, 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-137), 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", pattern1, " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r " + "'", str3, "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi! \rhi!  \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi! " + "'", str3, " hi! \rhi!  \rhi! ");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", false, 0, (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (int) (byte) 1, 139);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!", pattern1, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi!", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", " hi! \rhi!  \rhi! ", " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  " + "'", str3, "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        short[] shortArray5 = new short[] { (short) 100, (byte) -1, (byte) 10, (byte) 0, (short) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, -1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " hi!\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 127);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi! ", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", (java.lang.CharSequence) "  \r\n\r", (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        float[] floatArray2 = new float[] { 100L, 100.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", false, (int) (byte) 10, (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (int) (byte) 0, 755);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", pattern1, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", 57, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", "hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  " + "'", str3, "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", 85, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r   \r\r \r \r\r \r \r\r ", pattern1, " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r " + "'", str3, " \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 26, (java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-288), 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r \n \r \r \r ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", false, 57, charSequence3, (int) '\r', (-21));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 298 + "'", int3 == 298);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-29) + "'", int3 == (-29));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi! ", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi! ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", pattern1, "  hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        short[] shortArray2 = new short[] { (byte) -1, (byte) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-288), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rh \r\ri \r\r! \r\rhi! ", pattern1, " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\rhi! " + "'", str3, " \r\rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", 8, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", " \r \r \r \n \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!", " \rhi!  \rhi! ", " hi!  hi!\r hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", false, 8, (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-288), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " hi!\r   \r\r \r \r\r \r \r\r ", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        char[] charArray10 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  hi!hi! \rh hi!i \r\r! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "\n\rhi!  \rhi! ", (-165));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 899 + "'", int1 == 899);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi! \rhi!  \rhi! ", " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! ", "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! " + "'", str3, "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        char[] charArray9 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", " \rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r   \r\r \r \r\r \r \r\r ", " \r\rh \r\ri \r\r! \r\rhi! ", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r   \r\r \r \r\r \r \r\r " + "'", str3, " hi!\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rhi!  \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!", "   \rhi!  \rhi!   \rhi!  \rhi! ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r\n\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \r, \n, \r]");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        double[] doubleArray4 = new double[] { 100L, 100, (byte) -1, 16 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        java.lang.Class<?> wildcardClass14 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 100.0, -1.0, 16.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
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
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", pattern1, "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", (java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (int) '4', (-643));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", true, 293, (java.lang.CharSequence) " hi!", 127, 139);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r \n \r \r \r ", 0, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", (java.lang.CharSequence) " \r \r \r \n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r \r \r \n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " \rhi!", " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi!   \rhi!  \rhi! ", pattern1, "\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", false, 139, (java.lang.CharSequence) " \rhi!  \rhi! ", 16, 107);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \r\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (-21), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! ", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! ", (java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        char[] charArray7 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence4, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! " + "'", str3, "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! ", " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", pattern1, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", 10, (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r   \r\r \r \r\r \r \r\r ", " \r\rh \r\ri \r\r! \r\rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (-165), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }
}

