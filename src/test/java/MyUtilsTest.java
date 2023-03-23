import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class MyUtilsTest {

    @Test
    void addMockitoSimpleBehaviourTest1(){
        MyUtils mock1 =  mock(MyUtils.class);
        when(mock1.add(45,25)).thenReturn(70);
        assertEquals(70,mock1.add(45,25));
    }

    @Test
    void addMockitoSimpleBehaviourTest2(){
        MyUtils mock1 =  mock(MyUtils.class);
        when(mock1.multiply(4,2)).thenReturn(8);
        assertEquals(8,mock1.multiply(4,2));
    }

    @Test
    void addMockitoconsecutiveMethodCallsTest(){
        

    }
}
