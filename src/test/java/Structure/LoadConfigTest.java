package Structure;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

class LoadConfigTest {

    LoadConfig loadConfig = new LoadConfig();

    @Test
    void populatePropertyData() {
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.hasNextLine()).thenReturn(true);
        when(mockScanner.nextLine()).thenReturn("Molly Tester");
        when(mockScanner.hasNextLine()).thenReturn(true);
        when(mockScanner.nextLine()).thenReturn("Susan Tester");
        when(mockScanner.hasNextLine()).thenReturn(false);
        LoadConfig spyLoadConfig = spy(loadConfig);
        when(spyLoadConfig.getScanner()).thenReturn(mockScanner);
        spyLoadConfig.populatePropertyData();
        assertEquals(2,spyLoadConfig.propertyData.size());
    }


    @Test
    void getConfig() {
    }
}