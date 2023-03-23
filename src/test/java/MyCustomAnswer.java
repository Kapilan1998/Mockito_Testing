import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class MyCustomAnswer implements Answer<Boolean> {

    public Boolean answer(InvocationOnMock invocationOnMock) throws Throwable {
        return false;
    }
}
