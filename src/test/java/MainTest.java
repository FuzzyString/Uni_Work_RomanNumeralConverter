import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest
{
    @Test
    public void testOneInt() throws Exception
    {
        int[] expectedArray = {0, 0, 0, 4};
        Assertions.assertArrayEquals(expectedArray, Main.splitInputToArray( 4));
        int[] expectedArray2 = {0, 0, 0, 1};
        Assertions.assertArrayEquals(expectedArray2, Main.splitInputToArray( 1));
        int[] expectedArray3 = {0, 0, 0, 9};
        Assertions.assertArrayEquals(expectedArray3, Main.splitInputToArray( 9));
    }

    @Test
    public void testTwoInt() throws Exception
    {
        int[] expectedArray = {0, 0, 1, 4};
        Assertions.assertArrayEquals(expectedArray, Main.splitInputToArray( 14));
        int[] expectedArray2 = {0, 0, 2, 1};
        Assertions.assertArrayEquals(expectedArray2, Main.splitInputToArray( 21));
        int[] expectedArray3 = {0, 0, 5, 9};
        Assertions.assertArrayEquals(expectedArray3, Main.splitInputToArray( 59));
    }

    @Test
    public void testFourInt() throws Exception
    {
        int[] expectedArray = {1, 4, 4, 0};
        Assertions.assertArrayEquals(expectedArray, Main.splitInputToArray( 1440));
        int[] expectedArray2 = {2, 1, 9, 9};
        Assertions.assertArrayEquals(expectedArray2, Main.splitInputToArray( 2199));

    }

    @Test
    public void testEndResult() throws Exception
    {
        int[] expectedArray = {0, 0, 0, 1};
        Assertions.assertEquals("I", Main.romanConstructorV2(expectedArray));
        int[] expectedArray2 = {3, 9, 9, 9};
        Assertions.assertEquals("MMMCMXCIX", Main.romanConstructorV2(expectedArray2));
        int[] expectedArray3 = {0, 9, 9, 9};
        Assertions.assertEquals("CMXCIX", Main.romanConstructorV2(expectedArray3));
        int[] expectedArray4 = {0, 0, 5, 2};
        Assertions.assertEquals("LII", Main.romanConstructorV2(expectedArray4));
        int[] expectedArray5 = {0, 5, 5, 2};
        Assertions.assertEquals("DLII", Main.romanConstructorV2(expectedArray5));

    }







}
