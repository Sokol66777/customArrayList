package CustomArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArraySortingTest {

    @Test
    public void qSortWithoutCompartor(){

        Array<Integer> integers = new CustomArray<>();
        integers.add(7);
        integers.add(3);
        integers.add(99);
        integers.add(-1);
        integers.add(8);
        integers.add(1);
        integers.add(6);
        CustomArraySorting.sort(integers);

        Array<Integer> expectedArray = new CustomArray<>();
        expectedArray.add(-1);
        expectedArray.add(1);
        expectedArray.add(3);
        expectedArray.add(6);
        expectedArray.add(7);
        expectedArray.add(8);
        expectedArray.add(99);

        for(int i = 0; i<expectedArray.size();i++){
            assertEquals(expectedArray.get(i),integers.get(i));

        }
    }
}
