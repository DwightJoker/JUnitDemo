package by.academy;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    private static List<Integer> list;

    @BeforeClass
    public static void initiateList(){
        System.out.println("Initiate");
        list = new ArrayList<>();
    }
    @Before
    public void addList(){
        list.add(1);
        list.add(2);
        list.add(3);
    }
    @Test
    public void testListNotNull(){
        Assert.assertNotNull(list);
    }
    @After
    public void cleanList(){
        System.out.println("clean");
    }
    @AfterClass
    public void destruct(){
        list = null;
        System.out.println("Kill list");
    }
}
