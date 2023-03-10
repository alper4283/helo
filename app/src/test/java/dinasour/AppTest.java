/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dinasour;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    
    @Test void testFound(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(App.search(array,4));
    }

    
    @Test void testNotFound(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(App.search(array, 5));
    }

    @Test void emptyArray(){
        ArrayList<Integer> array = new ArrayList<>();
        assertFalse(App.search(array,3));
    }

    @Test void nullArray(){
        ArrayList<Integer> array = null;
        assertFalse(App.search(array,2));
    }
}
