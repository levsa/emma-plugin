package hudson.plugins.emma;

import junit.framework.TestCase;

/**
 * @author Kohsuke Kawaguchi
 */
abstract class AbstractEmmaTestBase extends TestCase {
    protected final void assertRatio(Ratio r, float numerator, float denominator) {
        assertEquals(numerator, r.numerator);
        assertEquals(denominator, r.denominator);
    }
}
