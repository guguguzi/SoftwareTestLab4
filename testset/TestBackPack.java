import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBackPack{
    
    @Before
    public void setUp(){
    }
    
    @After
    public void tearDown(){
    }
    
    @Test
    public void testBackPack_Solution1(){
        int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        assertEquals(11, c[n][m]);
    }
    
    @Test
    public void testBackPack_Solution2(){
        int m = 18;
        int n = 5;
        int w[] = {6, 2, 3, 4, 5};
        int p[] = {4, 7, 2 ,5, 6};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        assertEquals(22, c[n][m]);
    }
    
}
