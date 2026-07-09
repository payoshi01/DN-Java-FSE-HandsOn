package org.example;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ArgumentMatcherTest {

    @Test
    public void testArgumentMatcher() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getUserById(anyInt())).thenReturn("John");

        MyService service = new MyService(api);

        service.fetchUser(101);

        verify(api).getUserById(anyInt());
    }
}