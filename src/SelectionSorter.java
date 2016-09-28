import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * Created by bearden-tellez on 9/27/16.
 */
public class SelectionSorter extends BaseSorter {
    private void swap(int index, int secondIndex, int[] intArray) {
        int temp = intArray[index];
        intArray[index] = intArray[secondIndex];
        intArray[secondIndex] = temp;
    }

    @Override
    public int[] sort(int[] arrayNeedingSorting) {
        for (int index = 0; index < arrayNeedingSorting.length - 1; index++) {
            int smallestPosition = index;

            for (int secondIndex = index + 1; secondIndex <  (arrayNeedingSorting.length); secondIndex++) {
                if (arrayNeedingSorting[secondIndex] <  (arrayNeedingSorting[smallestPosition])) {
                    smallestPosition = secondIndex;
                }
            }
            swap(index, smallestPosition, arrayNeedingSorting);
        }
        return arrayNeedingSorting;
    }
}


