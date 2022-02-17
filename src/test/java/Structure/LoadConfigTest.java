package Structure;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

class LoadConfigTest {

    LoadConfig loadConfig = new LoadConfig();

    Scanner mockScanner() {
        Scanner scanner = mock(Scanner.class);
        // has two lines then stops, to expand just add more true returns
        when(scanner.hasNextLine()).thenReturn(true).thenReturn(true).thenReturn(false);
        when(scanner.nextLine()).thenReturn("Line 1").thenReturn("Line 2");

        return scanner;
    }

    @Test
    void populatePropertyData() {
        loadConfig.setPropertyReader(mockScanner());
        loadConfig.populatePropertyData();

        assertEquals(2, loadConfig.propertyData.size());
    }


    @Test
    void getConfig() {
        loadConfig.setPropertyReader(mockScanner());
        loadConfig.populatePropertyData();

        assertEquals("Line 1", loadConfig.getConfig().get(0));
        assertEquals("Line 2", loadConfig.getConfig().get(1));

    }
}