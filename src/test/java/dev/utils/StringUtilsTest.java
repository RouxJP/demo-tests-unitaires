package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void test() {
		int d ;
		
		d = StringUtils.levenshteinDistance( "Jav", "Java") ;
		assertEquals(1, d);
	}

	@Test
	public void test2() {
		int d ;
		
		d = StringUtils.levenshteinDistance( "JavA", "Java") ;
		assertEquals(1, d);
	}
	
	@Test
	public void test3() {
		int d ;
		
		d = StringUtils.levenshteinDistance( "Jaav", "Java") ;
		assertEquals(2, d);
	}
	
	@Test
	public void test4() {
		int d ;
		
		d = StringUtils.levenshteinDistance( "Javaa", "Java") ;
		assertEquals(1, d);
	}
	@Test
	public void test5() {
		int d ;
		
		d = StringUtils.levenshteinDistance( "Java", "Java") ;
		assertEquals(0, d);
	}
	
	@Test
	public void test6() {
		int d ;
		
		d = StringUtils.levenshteinDistance( "", "Java") ;
		assertEquals(4, d);
	}

	@Test
	public void test7() {
		int d ;
		
		d = StringUtils.levenshteinDistance( null, "Java") ;
		assertEquals(-1, d);
	}

}


