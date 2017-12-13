import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest { 
   User MyUser = new User("basil");

   @Test
   public void testgetName() {
	assertEquals(MyUser.getName(), basil);
   }
}

