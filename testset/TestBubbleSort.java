import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

public class TestBubbleSort {

	@Before
	public void setUp(){
	}

	@After
	public void tearDown(){
	}


	@Test
	public void testBackPack_Solution1(){
		int arr[] = {1, 6, 2, 2, 5};
		BubbleSort.BubbleSort(arr);
		assertArrayEquals(new int[]{1, 2, 2, 5, 6}, arr);

	}

	@Test
	public void testBackPack_Solution2(){
		int arr[] = {6, 2, 7, -3 , 5, 6, 0};
		BubbleSort.BubbleSort(arr);
		assertArrayEquals(new int[]{-3, 0, 2, 5, 6, 6, 7}, arr);
	}




}