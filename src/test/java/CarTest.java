import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
	Car target;
	
	@Test
	public void testGo(){
		assertNotNull(target.goLeft());
		assertNotNull(target.goRight());
		assertNotNull(target.goBackward());
		assertNotNull(target.goForward());
	}
	
	@Before
	public void prepare(){
		target = new Car("Ferrari");
	}
}
