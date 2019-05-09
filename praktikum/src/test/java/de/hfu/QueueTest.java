package de.hfu;

import static org.junit.Assert.*;
import org.junit.Test;

public class QueueTest {

	@Test(expected=IllegalArgumentException.class)
	public void KonstruktorTest() 	
	{
		final Queue q = new Queue(0);
		fail("Test schlug fehl");
	}
	
	@Test
	public void dequeueTest() {
		final int max = 3;
		final Queue q = new Queue(max);
		
			for(int i= 0; i<max;i++) {	
				q.enqueue(i);
			}
			
		assertEquals(0, q.dequeue());
	}
	
	@Test(expected=IllegalStateException.class)
	public void dequeueLengthTest() {
		final Queue q = new Queue(3);
		q.dequeue();
	}

	
}
