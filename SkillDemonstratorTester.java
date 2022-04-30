import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemonstratorTester {
    SkillDemonstrator sklDmnstrtr = new SkillDemonstrator();
    @Test
    public void IsEvenTest1()
    {
        assertTrue("0 should be even", sklDmnstrtr.isEven(0));
    }
}

