import org.junit.jupiter.api.Test;
import org.mockito.MockSettings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoMockTest {

    @Test
    void simpleMockTest(){
        MyList mockMyList = mock(MyList.class);
        boolean added = mockMyList.add("Kapilan");
        when(mockMyList.add("Hi")).thenReturn(false);
//        verify(mockMyList).add("hi hello");         // will throw an error
        verify(mockMyList).add("Kapilan");         // will give sucess message
        assertEquals(false,added);
    }

    @Test
    void mockingWithNameTest(){
        MyList mockMyList = mock(MyList.class,"Mocking myList");
        boolean added = mockMyList.add("Kapilan123");
        when(mockMyList.add("Hi")).thenReturn(false);
        assertEquals(false,added);
    }

    @Test
    void mockingWithAnswerTest(){
        MyList mockMyList = mock(MyList.class, new MyCustomAnswer());
        boolean added = mockMyList.add("Kapilan456");
        when(mockMyList.add("Hi")).thenReturn(false);
        assertEquals(false,added);
    }

    @Test
    void mockingWithMockSettingsTest(){
        MockSettings mockSettings =  withSettings().defaultAnswer(new MyCustomAnswer());
        MyList mockMyList = mock(MyList.class,mockSettings);
        boolean added = mockMyList.add("123456");
        when(mockMyList.add("Hi")).thenReturn(false);
        assertEquals(false,added);
    }
}
