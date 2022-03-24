import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainNoviceTestPrintName {

    @Test
    void printName() {
        assertEquals("Maria", MainNovice.printName("Maria"));
    }
}