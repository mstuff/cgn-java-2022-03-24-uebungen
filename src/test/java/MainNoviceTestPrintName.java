import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainNoviceTestPrintName {

/*    @Test
    void printName() {
        assertEquals("Maria", MainNovice.printName("Maria"));
    }


 */

    @Test
    void greaterZero_ifgreater0_shouldTrue(){
        assertTrue(MainNovice.greaterZero(1));
    }
    @Test
    void greaterZero_if0_shouldFalse(){
        assertFalse(MainNovice.greaterZero(0));
    }
}