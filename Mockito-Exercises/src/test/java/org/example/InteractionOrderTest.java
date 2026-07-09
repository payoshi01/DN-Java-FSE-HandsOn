package org.example;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class InteractionOrderTest {

    @Test
    public void testOrder() {

        ExternalApi api = mock(ExternalApi.class);

        api.getData();
        api.getUserById(1);

        InOrder order = inOrder(api);

        order.verify(api).getData();
        order.verify(api).getUserById(1);
    }
}
