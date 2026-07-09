package org.example;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class VoidMethodTest {

    @Test
    public void testVoidMethod() {

        ExternalApi api = mock(ExternalApi.class);

        doNothing().when(api).saveData(anyString());

        MyService service = new MyService(api);

        service.save("Mockito");

        verify(api).saveData("Mockito");
    }
}