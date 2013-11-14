package Junit2;

import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: witailab
 * Date: 13-11-14
 * Time: 下午4:12
 * To change this template use File | Settings | File Templates.
 */
public class TapeDeckTest {
    TapeDeck tapeDeck;
    @Before
    public void setUp() throws Exception {
        tapeDeck = new TapeDeck();
    }
    @Test
    public void given(){
        tapeDeck.canRecord = true;
    }
    public void play(){
        tapeDeck.playTape();
    }
    public void record(){
        tapeDeck.recordTape();
    }
}
