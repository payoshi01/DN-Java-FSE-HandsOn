package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MultipleReturnsTest {

    @Test
    public void testMultipleReturns() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData())
                .thenReturn("First")
                .thenReturn("Second");

        MyService service = new MyService(api);

        assertEquals("First", service.fetchData());

        assertEquals("Second", service.fetchData());
    }
}
