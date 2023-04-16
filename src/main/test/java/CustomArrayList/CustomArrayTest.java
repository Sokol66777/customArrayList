package CustomArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CustomArrayTest {

    Array<String> strs = new CustomArray<>();
    @BeforeEach
    public void initializationTestList(){
        strs.add("str1");
        strs.add("str2");
        strs.add("str3");
    }

    @AfterEach
    public void cleanList(){
        strs=null;
    }

    @Test
    public void testDeleteElement(){

        strs.delete(1);

        assertEquals(2,strs.size());
    }

    @Test
    public void testAddElement(){
        String result = "str2";

        assertEquals(result,strs.get(1));
    }

    @Test
    public void testUpdateElement(){
        strs.update(0,"update");

        String result = "update";

        assertEquals(result,strs.get(0));
    }

    @Test
    public void testSize(){
        int result = 3;

        assertEquals(result,strs.size());
    }
}
