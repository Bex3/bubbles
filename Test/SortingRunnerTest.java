import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bearden-tellez on 9/27/16.
 */
public class SortingRunnerTest {
    SelectionSorter sortingRunner = new SelectionSorter();
//    BubbleSorter sortingRunner = new BubbleSorter();

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {

    }

    private void assert3ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
    }

    private void assert2ElementOrder(int[] numArray) {
        assertEquals(3, numArray[0]);
        assertEquals(5, numArray[1]);

    }

    private void assert4ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(6, numArray[1]);
        assertEquals(7, numArray[2]);
        assertEquals(8, numArray[3]);
    }

    private void assertDupElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(6, numArray[1]);
        assertEquals(6, numArray[2]);
        assertEquals(8, numArray[3]);
    }


    @Test
    public void bubbleSort3ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19};
        sortingRunner.sort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] scrambledArray1 = {5, 19, 7};
        sortingRunner.sort(scrambledArray1);
        assert3ElementOrder(scrambledArray1);

        int[] scrambledArray2 = {7, 5, 19};
        sortingRunner.sort(scrambledArray2);
        assert3ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5};
        sortingRunner.sort(scrambledArray3);
        assert3ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5};
        sortingRunner.sort(scrambledArray4);
        assert3ElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7};
        sortingRunner.sort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);

    }

    @Test
    public void bubbleSort2ElementArray() throws Exception {
        int[] orderedArray = {3, 5};
        sortingRunner.sort(orderedArray);
        assert2ElementOrder(orderedArray);

        int[] scrabledArray1 = {5, 3};
        sortingRunner.sort(scrabledArray1);
        assert2ElementOrder(scrabledArray1);

    }

    @Test
    public void bubbleSort4ElementArray() throws Exception {
        int[] scrabledArray1 = {8, 6, 7, 5};
        sortingRunner.sort(scrabledArray1);
        assert4ElementOrder(scrabledArray1);

        int[] orderedArray= {5, 6, 7, 8};
        sortingRunner.sort(orderedArray);
        assert4ElementOrder(orderedArray);

    }

    @Test
    public void bubbleSortDupElementArray() throws Exception {
        int[] scrabledArray1 = {6, 8 , 6, 5};
        sortingRunner.sort(scrabledArray1);
        assertDupElementOrder(scrabledArray1);

        int[] orderedArray= {5, 6, 6, 8};
        sortingRunner.sort(orderedArray);
        assertDupElementOrder(orderedArray);

    }

}