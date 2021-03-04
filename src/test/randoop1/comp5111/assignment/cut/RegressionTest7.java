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
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray10);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", (-9), 249);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!", (-833), 649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", false, 0, (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", 349, 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi! ", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", (java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", 699);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 849);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (-94), (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, 42, (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", 124, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 713, (-682));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-240), (java.lang.CharSequence) "\r", (int) '#', (-849));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!", "hi!hi!hi!\nhi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", 54, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", pattern1, " hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! " + "'", str3, "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
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
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        int[] intArray6 = new int[] { '\n', 849, 4, 15, 5, 48 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 849, 4, 15, 5, 48]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\n", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", " hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        long[] longArray3 = new long[] { 100, '4', (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        java.lang.Class<?> wildcardClass8 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\n", "hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence5, charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        long[] longArray4 = new long[] { 649, (byte) 10, 48, 879 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[649, 10, 48, 879]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!", (-73));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 129, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", 4, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        int[] intArray1 = new int[] { 670 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[670]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        int[] intArray5 = new int[] { (short) 10, 91, (short) 0, (short) 100, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 91, 0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 519 + "'", int2 == 519);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", pattern1, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 710);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        long[] longArray3 = new long[] { 94, (-694), 18 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[94, -694, 18]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", (-20), (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-20));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        char[] charArray9 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray9);
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
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-63) + "'", int3 == (-63));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        char[] charArray7 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 1, 100]");
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
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 333 + "'", int1 == 333);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", "\r", "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
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
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-663) + "'", int3 == (-663));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-27) + "'", int3 == (-27));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi! " };
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray1);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! " + "'", str2, "hi! ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r", "hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", pattern1, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", pattern1, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charSequence1, 349);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 787 + "'", int3 == 787);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", pattern1, "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\r", true, 0, (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", 90, (-18));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\n" + "'", str3, "hi!hi!hi!\n");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", pattern1, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 787, 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        java.lang.Class<?> wildcardClass19 = charArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 27, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", 9, 805);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (-48));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", pattern1, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n" + "'", str3, "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", 231, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", (-48));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\n", 693);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray11);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \r]");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", (-682));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        char[] charArray13 = new char[] { ' ', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray13);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!" + "'", str3, "hi!hi!hi!");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 214, (java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-840), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!" + "'", str3, " hi!hi!hi!");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 696, (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-604) + "'", int3 == (-604));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { ' ', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence6, charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray13);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\r", 694);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!", 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray11);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-73), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\r", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!hi!hi!" + "'", str3, " hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        short[] shortArray1 = new short[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!", 694, (-663));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        boolean[] booleanArray6 = new boolean[] { false, false, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double[] doubleArray1 = new double[] { (short) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 7, (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!" + "'", str3, " hi!hi!");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!", false, (-18), (java.lang.CharSequence) "hi!hi!", (-46), (-849));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 670 + "'", int3 == 670);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!", (-33), 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!", 766, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 787);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n", "hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        char[] charArray11 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, (int) (byte) 10, (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (int) (byte) 0, (-20));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        java.lang.Class<?> wildcardClass20 = charArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", false, 46, (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0, (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", true, 696, (java.lang.CharSequence) "hi!hi!hi!hi!hi!", 46, 691);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", pattern1, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\r", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        char[] charArray6 = new char[] { ' ', ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double[] doubleArray4 = new double[] { 10.0d, 100L, 0.0f, (-1) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0, 0.0, -1.0]");
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
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", " hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence4, charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 349);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 649 + "'", int3 == 649);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", " hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", 22, (-84));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        float[] floatArray5 = new float[] { (-19), (byte) 0, (short) -1, (-84), (-1.0f) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-19.0, 0.0, -1.0, -84.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        short[] shortArray1 = new short[] { (byte) 10 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 710, (java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", 54, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 15, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", true, (-27), (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 5, (-124));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", " ", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 201 + "'", int1 == 201);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        long[] longArray4 = new long[] { (byte) -1, (-1), (short) 100, 27 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, -1, 100, 27]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 805 + "'", int3 == 805);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", false, 710, (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 10, 23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 91, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!", 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", 699, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-333) + "'", int3 == (-333));
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!", " hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!" + "'", str3, "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        int[] intArray2 = new int[] { (-32), 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-32, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", true, (-15), (java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-84), 22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r", 352, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        char[] charArray12 = new char[] { ' ', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\n", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhi!hi!", "hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-618) + "'", int3 == (-618));
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", (java.lang.CharSequence) " hi!hi!hi!hi!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", pattern1, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\nhi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray9 = new char[] { '4', ' ', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 879 + "'", int3 == 879);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", (int) (byte) 10, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-849));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, 10, (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", 46, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, 699, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 18, 132);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double[] doubleArray6 = new double[] { 100, (byte) 0, (byte) 10, 10, 10L, '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 0.0, 10.0, 10.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", 670, 643);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (-46));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        long[] longArray1 = new long[] { (-1L) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", pattern1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n\rhi!hi!hi!\nhi! hi!hi!hi!\n\rhi!hi!hi!\nhi!hhi!hi!hi!\n\rhi!hi!hi!\nhi!ihi!hi!hi!\n\rhi!hi!hi!\nhi!!hi!hi!hi!\n\rhi!hi!hi!\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-54) + "'", int3 == (-54));
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", " hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 849, 625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        boolean[] booleanArray3 = new boolean[] { false, false, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", true, 214, (java.lang.CharSequence) "hi!hi!hi!hi!", (-840), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!h hi!hi!hi!hi!hi!i hi!hi!hi!hi!hi!! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        char[] charArray6 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!\n hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!h hi!hi!i hi!hi!! hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!hi!hi!hi!\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", 693);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!\r", "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!hi!hi!hi!hi!hi!\r", pattern1, "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!\r" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!\r");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-849), 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 10]");
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
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!", " hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        long[] longArray3 = new long[] { 100, '4', (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", false, (-22), (java.lang.CharSequence) "hi!hi!hi!", 0, (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 14, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        char[] charArray8 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass12 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!", true, 39, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 787, 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!", " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!" + "'", str3, "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi! hi!");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, (int) 'a', (java.lang.CharSequence) "hi!hi!hi!", (-833), (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!hi!", "hi!hi!", "hi!hi!hi!hi!" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!" + "'", str4, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        char[] charArray7 = new char[] { ' ', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!", "\nhi!hi!hi!hhi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str3, " hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] { '4', ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\nhhi!hi!hi!hi!hi!hi!hi!hi!\nihi!hi!hi!hi!hi!hi!hi!hi!\n!hi!hi!hi!hi!hi!hi!hi!hi!\n\nhi!hi!hi!hi!hi!hi!hi!hi!\n", charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi!\n\rhi!hi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! hi!hhi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! hhi! hi! hi! hi! ihi! hi! hi! hi! !hi! hi! hi! hi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        char[] charArray9 = new char[] { ' ', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = new char[] { '4', ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 129 + "'", int1 == 129);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        long[] longArray3 = new long[] { 100, '4', (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double[] doubleArray3 = new double[] { (-91), (-7), 3 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-91.0, -7.0, 3.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", 693, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\n", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str3, "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\nhi!hi!", pattern1, " hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\nhi!hi!" + "'", str3, "hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (-682));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", 90);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        char[] charArray10 = new char[] { ' ', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi! hi!hi!hi! hi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", 69, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!hi!", "" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!ihi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hhi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!ihi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!!hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (-697));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
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
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 0, 697);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        char[] charArray10 = new char[] { 'a', ' ', ' ', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hhi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!ihi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!!hi!hi!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", 693);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hi!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!hi!hhi!hi! hi!hi!hi!hi!hi!hhi!hi!hi!ihi!hi!hi!!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.lang.String[] strArray2 = new java.lang.String[] { " ", "hi!" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\nhhi!hi!hi!\nihi!hi!hi!\n!hi!hi!hi!\n\nhi!hi!hi!\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!\rhi!hi!hi!h hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!ihi!hi!hi!hi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!", charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }
}

