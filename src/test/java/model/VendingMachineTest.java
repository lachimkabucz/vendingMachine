package model;

import org.junit.Test;
import pl.sdacademy.vending.util.Configuration;

import static junit.framework.TestCase.fail;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.endsWith;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class VendingMachineTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenZeroRowsConfigured() {
       // Given
        Configuration config = mock(Configuration.class);
        doReturn(0L)
                .when(config)
                .getLongProperty(
                        eq("machine.size.rows"),
                        anyLong()

                );
        doReturn(4L)
                .when(config)
                .getLongProperty(
                        eq("machine.size.cols"),
                        anyLong()

                );


       // When
        new VendingMachine(config);

       // Then
        fail("Expection should be raised");
    }
    }


