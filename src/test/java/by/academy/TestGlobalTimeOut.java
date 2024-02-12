package by.academy;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class TestGlobalTimeOut {

    @Rule
    public final TestRule globalTimeOut = Timeout.millis(20);

    @Test
    public void testInfinityLoop(){
        for(;;){
break;
        }
    }

    @Test
    public void testInfinityForLoop() {
        while(true){
break;
        }
    }
}
