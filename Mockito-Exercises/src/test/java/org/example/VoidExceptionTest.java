package org.example;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class VoidExceptionTest {

    @Test(expected = RuntimeException.class)
    public void testVoidException() {

        ExternalApi api = mock(ExternalApi.class);

        doThrow(new RuntimeException())
                .when(api)
                .deleteData();

        MyService service = new MyService(api);

        service.delete();

        verify(api).deleteData();
    }
}