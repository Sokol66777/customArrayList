package CustomArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CustomArrayTest {

    @Test
    public void testDeleteElement(){
        Array<String> strs = new CustomArray<>();
        strs.add("str1");
        strs.add("str2");
        strs.add("str3");
        strs.delete(1);

        assertEquals(2,strs.size());
    }

    @Test
    public void testAddElement(){
        Array<String> strs = new CustomArray<>();
        strs.add("str2");

        String result = "str2";

        assertEquals(result,strs.get(0));
    }

    @Test
    public void testUpdateElement(){
        Array<String> strs = new CustomArray<>();
        strs.add("str2");
        strs.update(0,"update");

        String result = "update";

        assertEquals(result,strs.get(0));
    }

    @Test
    public void testSize(){
        Array<String> strs = new CustomArray<>();
        strs.add("str1");
        strs.add("str2");
        strs.add("str3");

        int result = 3;

        assertEquals(result,strs.size());
    }
}
