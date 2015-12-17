import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RadarTest, created in order to test whether our radar scanner works, and per lab
 * requirements to make a test class.
 *
 * @author  
 * @version 
 */
public class RadarTest
{
    /**
     * Default constructor for test class RadarTest
     */
    public RadarTest()
    {
    }

    /**
     *
     * Tests that the radar scanner works.
     */
    @Test
    public void testRadar1()
    {
        Radar radar = new Radar(100,100);
        radar.setMonsterLocation(50,50);
        
        for (int i = 0; i < 50; i++)
        {
            radar.scan();
        }
        
        assertEquals(radar.getNumScans(),radar.getAccumulatedDetection(50,50));
    }

    /**
     *
     * Second test per lab requirements to test multiple cases
     */
    @Test
    public void testRadar2()
    {
        Radar radar = new Radar(100,100);
        radar.setMonsterLocation(75,25);
        
        for (int i = 0; i < 50; i++)
        {
            radar.scan();
        }
        
        assertEquals(radar.getNumScans(),radar.getAccumulatedDetection(75,25));
    }
}