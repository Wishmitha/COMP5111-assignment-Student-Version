package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi! \rhi!  \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi! ?hi!  ?hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r", (java.lang.CharSequence) "hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-72));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \r", " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r   \r\r \r \r\r \r \r\r ", " hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 22, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r" + "'", str3, "\r\n\r");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rh \r\ri \r\r! \r\r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "\r\n\r", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", " \rhi! ", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! ", "  \rhi!  \rhi! ", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", charSequence1, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\r\n\r", " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 91, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\r", "\r", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, "  hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r", 35, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r", " hi!hi! ", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r" + "'", str3, "\r\n\r");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\n", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! ", (java.lang.CharSequence) "", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\rh \r\ri \r\r! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??h ??i ??! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\rh \r\ri \r\r! \r\r", " \r", " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r" + "'", str3, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.Object obj0 = null;
        int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength(obj0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        boolean[] booleanArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "  \rhi!  \rhi! ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\rh \r\ri \r\r! \r\r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! ", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", " \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 80 + "'", int3 == 80);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r", 19, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", 22, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!", " hi! \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12) + "'", int3 == (-12));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \rhi!  \rhi! ", false, 2, (java.lang.CharSequence) " \rhi!", (int) (byte) 1, (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) " hi!", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi! ", pattern1, " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \rhi!  \rhi! ", " \r\r   \r\r \r \r\r \r \r\r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi! ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " \r\rh \r\ri \r\r! \r\r", " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\r", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!h hi!i hi!! hi!", " hi!hi! ", " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " hi! \rhi!  \rhi! ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??   ?? ? ?? ? ?? ?h ??   ?? ? ?? ? ?? ?i ??   ?? ? ?? ? ?? ?! ??   ?? ? ?? ? ?? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \rhi!  \rhi! ", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\r", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi! ", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (byte) 100, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "  \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!  hi!h hi!i hi!! hi!", " \r\r   \r\r \r \r\r \r \r\r ", " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        comp5111.assignment.cut.ToolBox.ArrayTools arrayTools0 = new comp5111.assignment.cut.ToolBox.ArrayTools();
        java.lang.Class<?> wildcardClass1 = arrayTools0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! ", 12, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  hi!hi! \rh \r\ri \r\r! \r\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, "  hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! ", 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "\r", " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        java.lang.Class<?> wildcardClass3 = booleanArray0.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r", 91, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !,  ,  ,  , h, i, !, h, i, !,  , \r,  , h, i, !, h, i, !,  , \r,  , h, i, !, h, i, !,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\r", pattern1, " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \rhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rh \r\ri \r\r! \r\r", " \r\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass8 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "  \rhi!  \rhi! ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!", " \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! ", 2, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", 3, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", " hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\r", "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!", (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", " hi!hi! ", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r" + "'", str3, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int10);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi! ", 57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!  hi!h hi!i hi!! hi!", "  \rhi!  \rhi! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", 91, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi! ", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        char[] charArray4 = new char[] { '#' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 16, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\rh \r\ri \r\r! \r\r", "", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi! ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!", false, 35, (java.lang.CharSequence) "hi!", (-14), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  hi!hi! \rh \r\ri \r\r! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   hi!hi! ?h ??i ??! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", false, 10, (java.lang.CharSequence) " \rhi!", (-19), 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", " hi!  hi!h hi!i hi!! hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi! \rhi!  \rhi! ", " hi!  hi!h hi!i hi!! hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi! " + "'", str3, " hi! \rhi!  \rhi! ");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! ", (-23), 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", " \rhi!  \rhi! ", " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r   \r\r \r \r\r \r \r\r ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!  hi!h hi!i hi!! hi!", "  \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! ", " hi!", " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\rhi! " + "'", str3, " \r\rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  hi!hi! \rh \r\ri \r\r! \r\r", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r   \r\r \r \r\r \r \r\r ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) "", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.lang.CharSequence charSequence0 = null;
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length(charSequence0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi! ", false, (int) '#', (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (int) '\r', 24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", true, 0, (java.lang.CharSequence) "\r\n\r", 0, (-19));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \rhi!  \rhi! ", "\r\n\r", " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\rhi! ", " \r\r", " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r   \r\r \r \r\r \r \r\r ", " \r\r", "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (int) '\n', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi! ", " hi!hi! ", " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! ", "\n", " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", pattern1, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r" + "'", str3, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", true, (-14), (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", 5, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (int) '\000', 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi! \rhi!  \rhi! ", false, 22, (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\rh \r\ri \r\r! \r\rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??h ??i ??! ??hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! ", 72, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi! \rhi!  \rhi! ", " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! ", " \r\rh \r\ri \r\r! \r\r", " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! " + "'", str3, " hi!hi! ");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! ", (-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! ", pattern1, " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! \rh \r\ri \r\r! \r\r", pattern1, " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh \r\ri \r\r! \r\r" + "'", str3, "  hi!hi! \rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", pattern1, " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r " + "'", str3, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (-23));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \rhi!  \rhi! ", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16) + "'", int3 == (-16));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", 24, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", "  \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r", "\r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!", "  \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, 16, (java.lang.CharSequence) " hi! \rhi!  \rhi! ", (-3), 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " hi!hi! ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r", (java.lang.CharSequence) " ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", 5, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi! ", " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", 19, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        java.lang.Class<?> wildcardClass5 = booleanArray0.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (-23));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "  hi!hi! \rh \r\ri \r\r! \r\r", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\r   \r\r \r \r\r \r \r\r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??   ?? ? ?? ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", 2, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!  hi!h hi!i hi!! hi!", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??  ??? ??? ??h ??  ??? ??? ??i ??  ??? ??? ??! ??  ??? ??? ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", pattern1, " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi! ", "", "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r", 63, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! ", pattern1, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! ", charArray5);
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi!   \rhi!  \rhi! ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charSequence1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", 5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \r", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\rh \r\ri \r\r! \r\r", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-63) + "'", int3 == (-63));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "  \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", pattern1, " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) " \r\r", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", " \r\r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", pattern1, " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?hi!  ?hi! h ??i ??! ??hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r", "hi!", " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r" + "'", str3, "\r\n\r");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", " \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) " \r", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! ", 16, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! ", (-63), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", (java.lang.CharSequence) " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", false, (-63), (java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", 2, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  hi!hi! \rh \r\ri \r\r! \r\r", " hi!  hi!h hi!i hi!! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", true, (-16), (java.lang.CharSequence) " \r\r", (-72), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!  \rhi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " \r\r   \r\r \r \r\r \r \r\r ", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", false, 4, (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", 24, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! ", " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! " + "'", str3, " hi!hi! ");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r", " \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r", " \r\rh \r\ri \r\r! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", " \r", "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-61) + "'", int3 == (-61));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", pattern1, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        double[] doubleArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !, h, i, !,  ]");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) " hi!", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r   \r\r \r \r\r \r \r\r ", "", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r   \r\r \r \r\r \r \r\r ", " \r\r   \r\r \r \r\r \r \r\r ", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 0, (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", true, (int) (byte) 100, (java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", 0, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", (-14), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-35) + "'", int3 == (-35));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi! ", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \rhi!  \rhi! ", true, (int) (short) 1, (java.lang.CharSequence) "\r", (int) '\000', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  hi!hi! \rh \r\ri \r\r! \r\r", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (-72), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", " \rhi!", " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", 100, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", " hi!", "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, (int) 'a', (java.lang.CharSequence) " hi!", 83, (-63));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", (java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", pattern1, " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ?hi!  ?hi!    ?? ? ?? ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 24, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        long[] longArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", "hi!", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!  \rhi! ", (-91), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \rhi! ", (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \rhi!  \rhi! ", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r", "", " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! \r \rhi! \n \rhi! \r \rhi! " + "'", str3, " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) "\n", (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi! ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (int) '\r', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r", "  \rhi!  \rhi!    \r\r \r \r\r \r \r\r ", "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r" + "'", str3, "\r\n\r");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) " \rhi!  \rhi! ", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \rhi!  \rhi!   \rhi!  \rhi! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", false, 35, (java.lang.CharSequence) "\r", (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r", " \r\rh \r\ri \r\r! \r\rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-4), (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 28, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r" + "'", str3, "\r\n\r");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", " ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ", (java.lang.CharSequence) "\r\n\r", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r", pattern1, "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r" + "'", str3, " \r\r   \r\r \r \r\r \r \r\r \rh \r\r   \r\r \r \r\r \r \r\r \ri \r\r   \r\r \r \r\r \r \r\r \r! \r\r   \r\r \r \r\r \r \r\r \r");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\r", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r   \r\r \r \r\r \r \r\r ", " hi! \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", charSequence1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r", (int) '#', (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, (int) (short) 100, (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (-63), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rh \r\ri \r\r! \r\r", pattern1, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! ", " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) "\r", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "  \rhi!  \rhi! ", " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r, h, i, !,  , \r,  , \r, h, i, !,  , \n,  , \r, h, i, !,  , \r,  , \r, h, i, !,  ]");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r", 63, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) "\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!", false, 2, (java.lang.CharSequence) " \r", 72, (-4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!  \rhi! ", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", "\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (java.lang.CharSequence) " \rhi!  \rhi! ", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 143 + "'", int1 == 143);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\rh \r\ri \r\r! \r\rhi! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) "\r\n\r", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi! \r hi!hi!   hi!hi! \r hi!hi! \r hi!hi!   hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", (java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! h  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! i  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! !  \rhi!  \rhi!   \rhi!  \rhi! \r    \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi!   \rhi!  \rhi! \r  \rhi!  \rhi!   \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-62) + "'", int3 == (-62));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!  hi!h hi!i hi!! hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r", "", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!\r hi!\r hi!" + "'", str3, " hi!  hi!\r hi!\r hi!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\rhi! ", (java.lang.CharSequence) " \rhi! \r \rhi! \n \rhi! \r \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ", " \r\r", "  hi!hi! \rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! " + "'", str3, " \rhi!  \rhi! h  hi!hi! \rh \r\ri \r\r! \r\ri  hi!hi! \rh \r\ri \r\r! \r\r!  hi!hi! \rh \r\ri \r\r! \r\rhi! ");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  hi!hi! \rh \r\ri \r\r! \r\r", " \r\r", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi! \rh hi!i \r\r! \r\r" + "'", str3, "  hi!hi! \rh hi!i \r\r! \r\r");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \rhi!  \rhi!   \rhi!  \rhi! ", (-61), 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        java.lang.Class<?> wildcardClass9 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        char[] charArray9 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \rhi!  \rhi! ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 24, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi!   hi!hi! hi!  hi!h hi!i hi!! hi! hi!hi! \r hi!hi! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  hi!hi! \rh hi!i \r\r! \r\r", " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! h hi!hi! h hi!hi! i hi!hi! ! hi!hi! i hi!hi! h hi!hi! i hi!hi! ! hi!hi! ! hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!  hi!\r hi!\r hi!", (java.lang.CharSequence) " \rhi!  \rhi! h \r\ri \r\r! \r\rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r", pattern1, "  hi!hi! \rh hi!i \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r" + "'", str3, "\r\n\r");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  hi!hi! \rh \r\ri \r\r! \r\r", (-22), (-62));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r" + "'", str3, " \r\r  \r\r\r \r\r\r \r\rh \r\r  \r\r\r \r\r\r \r\ri \r\r  \r\r\r \r\r\r \r\r! \r\r  \r\r\r \r\r\r \r\r");
    }
}

