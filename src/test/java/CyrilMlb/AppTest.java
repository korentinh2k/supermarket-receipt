package CyrilMlb;

import static org.junit.Assert.*; // Allows you to use directly assert methods, such as assertTrue(...), assertNull(...)

import org.junit.Test; // for @Test
import org.junit.Before; // for @Before
/**
 * Unit test for simple App.
 */
public class AppTest extends @Test{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
	super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assert Assertions.assertThat(true).isTrue();
    }
}
