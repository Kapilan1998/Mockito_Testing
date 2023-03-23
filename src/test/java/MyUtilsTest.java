import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class MyUtilsTest {

    @Test
    void addMockitoSimpleBehaviourTest1(){
        MyUtils mock1 =  mock(MyUtils.class);
        when(mock1.add(40,30)).thenReturn(70);
        doReturn(60).when(mock1).add(28,32);

        assertEquals(70,mock1.add(40,30));
        assertEquals(60,mock1.add(28,32));
    }

    @Test
    void addMockitoSimpleBehaviourTest2(){
        MyUtils mock1 =  mock(MyUtils.class);
        when(mock1.multiply(4,2)).thenReturn(8);
        assertEquals(8,mock1.multiply(4,2));
    }

    @Test
    void addMockitoconsecutiveMethodCallsTest(){
        MyUtils mock1 =  mock(MyUtils.class);
        when(mock1.add(anyInt(),anyInt())).thenReturn(35,40,45);

        assertEquals(35,mock1.add(25,10));
        assertEquals(40,mock1.add(20,20));
        assertEquals(45,mock1.add(9,36));

    }

    @Test
    void multiplyMockitoconsecutiveMethodCallsTest(){
        MyUtils mock1 =  mock(MyUtils.class);
        when(mock1.multiply(anyInt(),anyInt())).thenReturn(36,80,42);

        assertEquals(36,mock1.multiply(6,6));
        assertEquals(80,mock1.multiply(3,8));
        assertEquals(42,mock1.multiply(21,2));

    }

}
