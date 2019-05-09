package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest{

	@Test
	public void istErstesHalbjahr(){
		
		final Util u = new Util();
		
		for(int i = 1; i<=12; i++) {
			
			if(i<=6) {
				assertEquals(true, u.istErstesHalbjahr(i));
			}else {
				assertEquals(false, u.istErstesHalbjahr(i));
			}
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void istAußerhalbJahrKlein() {
		final Util u = new Util();
		u.istErstesHalbjahr(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void istAußerhalbJahrGroß() {
		final Util u = new Util();
		u.istErstesHalbjahr(13);
	}
}
