package Junit1;


import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: witailab
 * Date: 13-11-13
 * Time: 下午2:47
 * To change this template use File | Settings | File Templates.
 */
public class MyexampleTest {
    private Myexample myexample;

    @Before
    public void setUp() throws Exception {
        myexample = new Myexample();        //ctrl+shift+space
    }

    @Test
    public void testMain() throws Exception {
        myexample.Myprint();
    }
}
