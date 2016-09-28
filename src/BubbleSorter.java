/**
 * Created by bearden-tellez on 9/27/16.
 */
public class BubbleSorter extends BaseSorter{
    @Override

    public int[] sort(int[] arrayNeedingSorting) {
        int initialMax = arrayNeedingSorting.length;
        for (int currentMax = initialMax; currentMax >= 0; currentMax--) {
            for (int counter = 0; counter < currentMax - 1; counter++) {
                if (arrayNeedingSorting[counter] > arrayNeedingSorting[counter + 1]) {
                    swapNumbers(counter, counter + 1, arrayNeedingSorting);
                }
            }
            printNumbers(arrayNeedingSorting);
        }
        return arrayNeedingSorting;
    }
}



