package UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void twoPlusTwoShouldEqualFour() {
        Solution solution = new Solution();
        assertEquals(4, solution.add(2,2));
    }

}