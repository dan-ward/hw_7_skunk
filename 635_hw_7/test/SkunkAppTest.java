import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SkunkAppTest {

	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void test() {
		fail("My first test failure");
	}
	
	@Test
	public void new_dice_have_can_be_created() {
		Dice d = new Dice();
		assertTrue("new Dice instance is not null", d!=null);
	}
	
	@Test
	public void new_dice_will_roll_double_skunk_first() {
		Dice d = new Dice(new int[] {1}, new int[] {1});
		d.roll();
		assertEquals("first die is not 1", 1, d.getDie1Roll());
		assertEquals("second die is not 1", 1, d.getDie2Roll());
	}
	
}
