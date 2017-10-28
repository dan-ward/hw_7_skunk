import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	private Player player;
	
	@Before
	public void create_sample_player() {
		player = new Player("Eric");
	}
	
	@Test
	public void test_get_player_name() {
		String name = player.getName();
		assertNotNull("name is null", name);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test_get_correct_player_name() {
		assertEquals("name is as initialized", "Eric", player.getName());
	}
	
	@Test
	public void test_get_initial_player_score() {
		assertEquals("0 is initial player score",  0, player.getScore());
	}
}
