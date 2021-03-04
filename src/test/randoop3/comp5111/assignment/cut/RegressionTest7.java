package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!", false, (-62), (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 34, (-643));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:     hi! ?hi!  ?hi!   hi!hi! ?h ??i ??! ??h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi!   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi! ?h hi!i ??! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
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
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "   \rhi!    \r\r \r \r\r \r \r\r ", "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", false, 3, charSequence3, (int) (byte) 100, 726);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:     hi! ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi!   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi! ?h hi!i ??! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass16 = charArray7.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r", "\n", "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r  \rhi!  \rhi!   \rhi!  \rhi! \r" + "'", str3, "\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!  hi!h hi!i hi!! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) "  \r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", (int) (byte) -1, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", pattern1, " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  " + "'", str3, "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean13);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!  hi!\r hi!\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\rhi! ", "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", "\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\rhi! " + "'", str3, " \r\rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray7);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", " \rhi! \r \rhi! \n \rhi! \r \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rhi!  \rhi! ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  hi!hi! \rh \r\ri \r\r! \r\r");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "  ", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        int[] intArray6 = new int[] { 719, 121, 8, 5, 21, (-12) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[719, 121, 8, 5, 21, -12]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi! \rhi!  \rhi! ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi! " + "'", str3, " hi! \rhi!  \rhi! ");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (java.lang.CharSequence) "\n\rhi!  \rhi! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  hi!hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi! ", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! ", pattern1, "  \r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r  \rhi!  \rhi!   \rhi!  \rhi! \r", " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", false, 2, (java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-121), (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rh \r\ri \r\r! \r\rhi! ", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\rhi! " + "'", str3, " \r\rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "  hi!hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 12, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", (-14), 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        long[] longArray6 = new long[] { 0, 100L, '\r', (byte) 100, '\000', (-1L) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, 100, 13, 100, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\rhi!  \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!  ?hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray6);
        java.lang.Class<?> wildcardClass14 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r", (java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi! ", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", "  \r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r" + "'", str3, " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        boolean[] booleanArray3 = new boolean[] { true, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
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
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", " hi!", " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r" + "'", str3, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " hi!  hi!\r hi!\r hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \n \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  , h,  , h, i, !, h, i, !,  , i,  , h, i, !, h, i, !,  , !,  , h, i, !, h, i, !,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   hi!hi! hi!   ?hi!  ?hi! h   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!   ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " hi!\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (-297));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", 100, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \rhi!    \r\r \r \r\r \r \r\r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ?hi!    ?? ? ?? ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ?hi!  ?hi!   ?hi!  ?hi! h    ?hi!  ?hi!   ?hi!  ?hi!    ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??i    ?hi!  ?hi!   ?hi!  ?hi!    ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??!    ?hi!  ?hi!   ?hi!  ?hi!    ?hi!  ?hi!   ?hi!  ?hi! ?h ??i ??! ??hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r \n \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r   \r\r \r \r\r \r \r\r ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r   \r\r \r \r\r \r \r\r " + "'", str3, " hi!\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", false, 20, (java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", (-4), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r \r \r \n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", charSequence1, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, h,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, i,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, !,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi! ", (-137), (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!h hi!i hi!! hi!", " \r\rh \r\ri \r\r! \r\r", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        int[] intArray6 = new int[] { '\r', 16, ' ', (byte) 1, (byte) 10, 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[13, 16, 32, 1, 10, 100]");
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
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", pattern1, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", pattern1, " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r", (-643), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", false, 23, (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", 34, 34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", 21, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  ", "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-228) + "'", int3 == (-228));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        java.lang.Class<?> wildcardClass9 = longArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rhi!  \rhi! ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!  \rhi! " + "'", str3, "\n\rhi!  \rhi! ");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r  \rhi!  \rhi!   \rhi!  \rhi! \r", " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r  \rhi!  \rhi!   \rhi!  \rhi! \r" + "'", str3, "\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  , h, i, !, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", 37, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", false, (int) '\n', (java.lang.CharSequence) " ", (-21), (-18));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        float[] floatArray1 = new float[] { 100L };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        java.lang.Class<?> wildcardClass3 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , h, i, !, h, i, !,  , h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ]");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", pattern1, " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!" + "'", str3, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 295);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", pattern1, "  hi!hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r " + "'", str3, "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r\n\r", (java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", (-17));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r   \r\r \r \r\r \r \r\r ", pattern1, "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r   \r\r \r \r\r \r \r\r " + "'", str3, " hi!\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", " \r\rh \r\ri \r\r! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi! ");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , h, i, !, h, i, !,  , h, i, !,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , h, i, !, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!h?hi!??hi!??hi!??hi!i?hi!??hi!??hi!??hi!!?hi!??hi!??hi!??hi!h?hi!??hi!??hi!??hi!i?hi!??hi!??hi!??hi!!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!h?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!i?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!??hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! ", (java.lang.CharSequence) "\n\rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! \rh hi!i \r\r! \r\r", " \r \r \r \n \r \r \r ", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh hi!i \r\r! \r\r" + "'", str3, "  hi!hi! \rh hi!i \r\r! \r\r");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", 719);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (int) '4', 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        char[] charArray7 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rhi!  \rhi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", (-91), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r \n \r \r \r ", pattern1, " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r \n \r \r \r " + "'", str3, " \r \r \r \n \r \r \r ");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r   \r\r \r \r\r \r \r\r ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r " + "'", str3, " \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " hi!\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", (-63), (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", 19, 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r", (-29), (-161));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", (-91), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "  \rhi!  \rhi! ", "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! ", 127, (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi! ");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! " + "'", str3, "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!h hi!i hi!! hi!", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r", true, 719, (java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (-165), 24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!  hi!h hi!i hi!! hi!", " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (int) (byte) 10, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!   \rhi!  \rhi! ", pattern1, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  ", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r", "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\r   \r\r \r \r\r \r \r\r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  hi! \rhi!  \rhi! ", "  \r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
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
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        char[] charArray10 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r \n \r \r \r ", (-297), (-228));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 2, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", true, 899, (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", 26, 17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (int) (byte) 1, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        short[] shortArray3 = new short[] { (byte) 10, (byte) 100, (byte) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        int[] intArray5 = new int[] { 91, 91, '4', 1, (-14) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[91, 91, 52, 1, -14]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r  \rhi!  \rhi!   \rhi!  \rhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", 726);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", pattern1, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        java.lang.Class<?> wildcardClass13 = shortArray0.getClass();
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \rhi!  \rhi!   \rhi!  \rhi! ", "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", 143, (-79));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r \r \r \n \r \r \r ", false, (-15), (java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (-120), (-62));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", pattern1, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r \n \r \r \r ", 299);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double[] doubleArray4 = new double[] { (-1), (short) 100, (short) 100, (short) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        long[] longArray5 = new long[] { 'a', 0, 726, (-753), 99 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 726, -753, 99]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\rh \r\ri \r\r! \r\rhi! ", "\r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! ", pattern1, "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-299) + "'", int3 == (-299));
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r" + "'", str3, "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        char[] charArray4 = new char[] { '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", 34, (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  hi!hi! \rh hi!i \r\r! \r\r", (java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", (int) '#', (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi!   \rhi!  \rhi! ", " hi!hi! ", "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", 147, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 85, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  , \r, h,  , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  , \r, i,  , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  , \r, !,  , \r, \r,  ,  ,  , \r, \r,  , \r,  , \r, \r,  , \r,  , \r, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r  \rhi!  \rhi!   \rhi!  \rhi! \r", "  \r\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \rhi!    \r\r \r \r\r \r \r\r ", "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", pattern1, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!" + "'", str3, "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        char[] charArray8 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r \n \r \r \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-8));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", (java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (-120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", "\r  \rhi!  \rhi!   \rhi!  \rhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        char[] charArray11 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ", (-29), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray7);
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
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!hi!   hi!hi! ? hi!hi! ? hi!hi!   hi!hi!   hi!hi! ? hi!hi! ? hi!hi! h hi!hi!   hi!hi! ? hi!hi! ? hi!hi! i hi!hi!   hi!hi! ? hi!hi! ? hi!hi! ! hi!hi!   hi!hi! ? hi!hi! ? hi!hi!   hi!hi!   hi!hi! ? hi!hi! ? hi!hi!   hi!hi!   hi!hi! ? hi!hi! ? hi!hi! h hi!hi!   hi!hi! ? hi!hi! ? hi!hi! i hi!hi!   hi!hi! ? hi!hi! ? hi!hi! ! hi!hi!   hi!hi! ? hi!hi! ? hi!hi! h hi!hi!   hi!hi! ? hi!hi! ? hi!hi!   hi!hi!   hi!hi! ? hi!hi! ? hi!hi! h hi!hi!   hi!hi! ? hi!hi! ? hi!hi! i hi!hi!   hi!hi! ? hi!hi! ? hi!hi! ! hi!hi!   hi!hi! ? hi!hi! ? hi!hi! i hi!hi!   hi!hi! ? hi!hi! ? hi!hi!   hi!hi!   hi!hi! ? hi!hi! ? hi!hi! h hi!hi!   hi!hi! ? hi!hi! ? hi!hi! i hi!hi!   hi!hi! ? hi!hi! ? hi!hi! ! hi!hi!   hi!hi! ? hi!hi! ? hi!hi! ! hi!hi!   hi!hi! ? hi!hi! ? hi!hi!   hi!hi!   hi!hi! ? hi!hi! ? hi!hi! h hi!hi!   hi!hi! ? hi!hi! ? hi!hi! i hi!hi!   hi!hi! ? hi!hi! ? hi!hi! ! hi!hi!   hi!hi! ? hi!hi! ? hi!hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        long[] longArray1 = new long[] { (-1) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (int) ' ', 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (-8), 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  hi!hi! hi! \rhi!  \rhi! h hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , h, i, !, h, i, !,  , h, i, !,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  , h, i, !, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r, h, i, !,  ,  , \r, h, i, !,  ,  , \n, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!", (-120), 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", " \rhi!  \rhi! ", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", "hi!", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r" + "'", str3, " \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \r hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi!   \n\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ", 293, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  hi! \rhi!  \rhi! ", " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double[] doubleArray4 = new double[] { 100L, 100, (byte) -1, 16 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 100.0, -1.0, 16.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  " + "'", str3, "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r", (java.lang.CharSequence) "", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        char[] charArray8 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi! ", " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 7, (-79));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! ", (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \rhi! ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 28, (-136));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!", "  \rhi!  \rhi!   \rhi!  \rhi! h    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!    \rhi!  \rhi!   \rhi!  \rhi!    \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \r\n\r", (java.lang.CharSequence) "   \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        int[] intArray5 = new int[] { 91, 91, '4', 1, (-14) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[91, 91, 52, 1, -14]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true, 63, (java.lang.CharSequence) " hi! \rhi!  \rhi! ", 295, 80);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\r", pattern1, " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi! \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (-22), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\n\r", "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\n\r" + "'", str3, "  \r\n\r");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "  hi! \rhi!  \rhi! ", 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        java.lang.Class<?> wildcardClass8 = shortArray0.getClass();
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 85 + "'", int3 == 85);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rhi!  \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r", " \rhi! \r \rhi! \n \rhi! \r \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\r  \rhi!  \rhi!   \rhi!  \rhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " \rhi!", " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! \rh \r\ri \r\r! \r\r", pattern1, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, "  hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "  hi! \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r, \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
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
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  hi!hi! hi!  \r\n\r \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", " \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        int[] intArray1 = new int[] { 19 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[19]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi!  \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", 1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
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
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\rh \r\ri \r\r! \r\rhi! ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 172 + "'", int1 == 172);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        char[] charArray8 = new char[] { '4', '4', ' ', '\n', '\000' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 \n\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  , \n, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", (java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "\r  \rhi!  \rhi!   \rhi!  \rhi! \r", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  hi! \rhi!  \rhi! ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  hi!hi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", " hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) " \rhi!  \rhi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! hi!  h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        short[] shortArray5 = new short[] { (short) 100, (byte) -1, (byte) 10, (byte) 0, (short) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        java.lang.Class<?> wildcardClass7 = shortArray5.getClass();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, -1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", (java.lang.CharSequence) "  \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!  \rhi!  \n\rh \r\ri \r\r! \r\r", false, 1, (java.lang.CharSequence) " \rhi! ", 91, (-29));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", 0, (-297));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (int) '\r', 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  , h, i, !,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , h,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, i,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  ,  ,  , \r, h, i, !,  ,  , \r, h, i, !,  , \r, h,  , \r, \r, i,  , \r, \r, !,  , \r, \r, h, i, !,  , h, i, !,  , \r, h, i, !,  ]");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi! hi!     \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!   \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  \rhi!  \rhi! h \r\ri \r\r! \r\rhi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r", " hi!  hi! hi!  hi!\r hi!\r hi! hi!\r hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \rhi!  \rhi!   \rhi!  \rhi! ", pattern1, "  hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "   \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (-4), (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (-12), (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "   \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r   \r\r \r \r\r \r \r\r ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \rhi!  \rhi! ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " hi!\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! h \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! i \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ! \rhi! \r \rhi! \n \rhi! \r \rhi!   \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! \r \rhi! \r \rhi! \n \rhi! \r \rhi! ", 80, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!h\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!i\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!!\rhi!\r\rhi!\n\rhi!\r\rhi!\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!\r\rhi!\r\rhi!\n\rhi!\r\rhi!", (java.lang.CharSequence) "   hi! \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! ", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! ", (-161));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! h hi!hi!   hi!hi! \r hi!hi! \r hi!hi! i hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ! hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 298, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", true, (int) '#', (java.lang.CharSequence) "     \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r      \r   \r  h   \r   \r    \r   \r  \rh \r\ri \r\r! \r\ri   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r!   \r   \r    \r   \r  \rh \r\ri \r\r! \r\r    \r  ", 899, (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!  hi!\r hi!\r hi! \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !,  ,  , h, i, !, \r,  , h, i, !, \r,  , h, i, !,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, h,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, i,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r, !,  , \r, \r,  ,  , \r, \r, \r,  , \r, \r, \r,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "  \r\rh \r\ri \r\r! \r\rhi! hi!   \r\rh \r\ri \r\r! \r\rhi! hi! h  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! i  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! !  \r\rh \r\ri \r\r! \r\rhi!  \r\rh \r\ri \r\r! \r\rhi! hi! ", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (-288));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    hi! \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi!   \rhi!  \rhi! h   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\ri   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\r!   \rhi!  \rhi!   \rhi!  \rhi! \rh \r\ri \r\r! \r\rhi! hi! \rh hi!i \r\r! \r\r", 10, 288);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!  \rhi!   hi!hi! \rh \r\ri \r\r! \r\rh hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        float[] floatArray1 = new float[] { 100L };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        float[] floatArray1 = new float[] { 100L };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }
}

