package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = comp5111.assignment.cut.ToolBox.ArrayTools.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        comp5111.assignment.cut.ToolBox.LocaleTools localeTools0 = new comp5111.assignment.cut.ToolBox.LocaleTools();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        comp5111.assignment.cut.ToolBox.StringTools stringTools0 = new comp5111.assignment.cut.ToolBox.StringTools();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "hi!", (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = comp5111.assignment.cut.ToolBox.StringTools.CR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r" + "'", str0, "\r");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = comp5111.assignment.cut.ToolBox.CharSequenceTools.TO_STRING_LIMIT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        char char0 = comp5111.assignment.cut.ToolBox.CharTools.CR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\r' + "'", char0 == '\r');
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = comp5111.assignment.cut.ToolBox.StringTools.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\r", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        char char0 = comp5111.assignment.cut.ToolBox.CharTools.NUL;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        comp5111.assignment.cut.ToolBox.CharSequenceTools charSequenceTools0 = new comp5111.assignment.cut.ToolBox.CharSequenceTools();
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        comp5111.assignment.cut.ToolBox.RegExTools regExTools0 = new comp5111.assignment.cut.ToolBox.RegExTools();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str0 = comp5111.assignment.cut.ToolBox.StringTools.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        float[] floatArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) (byte) 0, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\r", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        java.lang.Class<?> wildcardClass7 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        comp5111.assignment.cut.ToolBox toolBox0 = new comp5111.assignment.cut.ToolBox();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) toolBox0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str0 = comp5111.assignment.cut.ToolBox.StringTools.SPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + " " + "'", str0, " ");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, 16, (java.lang.CharSequence) "", (int) (short) 10, (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r", (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", "\r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, (int) 'a', (java.lang.CharSequence) "\r", 0, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        short[] shortArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, 1, (java.lang.CharSequence) "\r", (int) '\000', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r", " ", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", " \r\r", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r\r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        char char0 = comp5111.assignment.cut.ToolBox.CharTools.LF;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\n' + "'", char0 == '\n');
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!", " \r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        long[] longArray6 = new long[] { 0, 100L, '\r', (byte) 100, '\000', (-1L) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, 100, 13, 100, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \r", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "\r", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", "\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", " \r", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", " \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!", (int) (short) 0, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r", (java.lang.CharSequence) " \r\r", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", " ", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r", (java.lang.CharSequence) "", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, (int) '\n', charSequence3, (int) '\n', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " \r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "\r", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str0 = comp5111.assignment.cut.ToolBox.StringTools.LF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\n" + "'", str0, "\n");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 91, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " \rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 91, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", " \rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " \r\r", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r", " \rhi!", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "hi!", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " \rhi!", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\r", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", " \r\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        double[] doubleArray1 = new double[] { 10 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", " \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!", (int) (short) 1, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, (-22), (java.lang.CharSequence) "\n", 91, 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!", false, 10, (java.lang.CharSequence) " hi!", 10, (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (-72), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, 0, (java.lang.CharSequence) " \r\r", (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (int) (short) 0, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! ", 0, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, (int) (byte) -1, (java.lang.CharSequence) " \rhi!", (int) (byte) 0, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " \rhi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! ", "", " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, 1, (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \rhi! ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r", false, (int) '\n', (java.lang.CharSequence) " \rhi!  \rhi! ", (-72), (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!", false, (int) (byte) 100, (java.lang.CharSequence) " \rhi!", 10, (-19));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!", false, 4, (java.lang.CharSequence) "\r", (-19), 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!", false, 0, (java.lang.CharSequence) " \rhi!", 91, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", " hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        comp5111.assignment.cut.ToolBox.CharTools charTools0 = new comp5111.assignment.cut.ToolBox.CharTools();
        java.lang.Object[] objArray2 = new java.lang.Object[] { charTools0, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " hi!", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r", " \r\rh \r\ri \r\r! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12) + "'", int3 == (-12));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " \r\r", " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!", pattern1, " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!", " \r\rh \r\ri \r\r! \r\r", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " \rhi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\r", pattern1, " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", false, 72, (java.lang.CharSequence) "\n", 4, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 0, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! ", " \rhi!  \rhi! ", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", " \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! ", (java.lang.CharSequence) "hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \rhi!", " \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        float[] floatArray2 = new float[] { 100L, 100.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", " \r\rh \r\ri \r\r! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", " hi!", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!  \rhi! ", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        byte[] byteArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\r", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!", " \rhi!  \rhi! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        java.lang.Class<?> wildcardClass3 = longArray0.getClass();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!", " \r\r", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (int) (short) -1, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!", "\n", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r", " \r\rh \r\ri \r\r! \r\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!", "\n", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! ", "\r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! " + "'", str3, " hi!hi! ");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\rh \r\ri \r\r! \r\r", " \r\rh \r\ri \r\r! \r\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.CharSequence[] charSequenceArray0 = null;
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) '4', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!  \rhi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r", pattern1, " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 4, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", " hi!hi! ", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!", "", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \rhi!  \rhi! ", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, 1, (java.lang.CharSequence) " ", 72, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (int) (short) 0, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        java.lang.Class<?> wildcardClass9 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " \rhi! ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "hi!", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!", pattern1, " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (java.lang.CharSequence) " \rhi! ", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", false, (int) '\000', (java.lang.CharSequence) "\r", 0, 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\rh \r\ri \r\r! \r\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi! ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", 16, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \rhi!", false, (int) (short) 10, (java.lang.CharSequence) "\r", (int) '4', (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", false, 100, (java.lang.CharSequence) " \r", (-22), (-14));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (int) 'a', (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \rhi!  \rhi! ", " hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass4 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\rh \r\ri \r\r! \r\r", "\n", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        char[] charArray7 = new char[] { '4', '\r', ' ', '\r' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi! ", pattern1, " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!  hi!h hi!i hi!! hi!", " hi!hi! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\rh \r\ri \r\r! \r\r", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! ", " \r\r", " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\rh \r\ri \r\r! \r\r", " \rhi! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) "\n", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) "", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String[] strArray3 = new java.lang.String[] { " hi!", " ", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", " \r\rh \r\ri \r\r! \r\r", " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", " ", " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (-4), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " hi!hi! ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", " hi!  hi!h hi!i hi!! hi!", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r", "hi!", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) " ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", " hi!  hi!h hi!i hi!! hi!", " \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r" + "'", str3, " \r");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) " ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!hi! ", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) "", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! ", (int) (byte) 1, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! ", (-14), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r\r", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!", " \rhi!  \rhi! ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!" + "'", str3, " hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", " \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! ", (java.lang.CharSequence) " \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (int) ' ', (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) " \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " hi!hi! ", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi! ", 0, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        boolean[] booleanArray6 = new boolean[] { false, true, true, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!  hi!h hi!i hi!! hi!", " \r\rh \r\ri \r\r! \r\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!  hi!h hi!i hi!! hi!" + "'", str3, " hi!  hi!h hi!i hi!! hi!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        java.lang.Class<?> wildcardClass7 = charSequenceArray3.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \rhi! ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (-19), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " \rhi!  \rhi! ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int[] intArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (-14), (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass6 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " \r", " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", 3, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        float[] floatArray2 = new float[] { 100L, 100.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        java.lang.Class<?> wildcardClass6 = floatArray2.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! ", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!  \rhi! " + "'", str3, " \rhi!  \rhi! ");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, (-3), (java.lang.CharSequence) " hi!", 4, 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", " \rhi!  \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", " \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (int) ' ', (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r", " hi!  hi!h hi!i hi!! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r", "", " hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! " + "'", str3, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \rhi!  \rhi! ", (java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi! ", " \r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! " + "'", str3, " hi!hi! ");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! ", " ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        long[] longArray1 = new long[] { 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass5 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rh \r\ri \r\r! \r\r", pattern1, " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rh \r\ri \r\r! \r\r" + "'", str3, " \r\rh \r\ri \r\r! \r\r");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \rhi!", " \rhi!", " \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! ", (-14), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \rhi!", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \rhi!  \rhi! ", "", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \rhi!  \rhi! " + "'", str3, " hi! \rhi!  \rhi! ");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", false, (-4), (java.lang.CharSequence) " ", (-72), (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!  hi!h hi!i hi!! hi!", " hi! \rhi!  \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\rh \r\ri \r\r! \r\r", " \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (java.lang.CharSequence) "\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r", " hi!hi! ", " \rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r" + "'", str3, " \r\r");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!hi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, " \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", "hi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r   \r\r \r \r\r \r \r\r " + "'", str3, " \r\r   \r\r \r \r\r \r \r\r ");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 19, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi! ", " hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r   \r\r \r \r\r \r \r\r ", (int) '4', (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r", "\r", " \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \rhi!  \rhi! " + "'", str3, "  \rhi!  \rhi! ");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass7 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi!", pattern1, " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi!" + "'", str3, " \rhi!");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!  hi!h hi!i hi!! hi!", (java.lang.CharSequence) "  \rhi!  \rhi! ", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) " \r\rh \r\ri \r\r! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        float[] floatArray2 = new float[] { 100L, 100.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r", (java.lang.CharSequence) " \r\r", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", pattern1, "  \rhi!  \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! h hi!hi! i hi!hi! ! hi!hi! " + "'", str3, " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!hi! ", " \r\r", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!hi! " + "'", str3, " hi!hi! ");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \rhi!  \rhi! ", (java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \rhi! ", " \rhi!  \rhi! ", " hi!  hi!h hi!i hi!! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \rhi! " + "'", str3, " \rhi! ");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!hi! ", (int) (byte) 0, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \rhi! ", 12, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", " hi!  hi!h hi!i hi!! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-23) + "'", int3 == (-23));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \rhi!", (java.lang.CharSequence) "", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \rhi!  \rhi! ", " \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!", (int) (short) 10, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi! \rhi!  \rhi! ", " hi!hi!   hi!hi! \r hi!hi! \r hi!hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { " \rhi!  \rhi! ", "\r", " hi!  hi!h hi!i hi!! hi!", " \r\r   \r\r \r \r\r \r \r\r " };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi! \rhi!  \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-72), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!hi! ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!hi! h hi!hi! i hi!hi! ! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \rhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }
}

