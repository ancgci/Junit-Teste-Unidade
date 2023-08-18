package one;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest {
    String message = "Antonio Carlos Garcia Junior";	
    MessageUtil messageUtil = new MessageUtil(message);
    
    @Test
    public void testSalutationMessage() {
       System.out.println("Inside testSalutationMessage()");
       message = "Ol\u00E1 voce est\u00E1 estudando" + "Antonio Carlos Garcia Junior";
       assertEquals(message,messageUtil.salutationMessage());
    }
}
