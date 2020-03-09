package ntw.virtusa.test.com;
//import ntw.virtusa.constants.com;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ntw.virtusa.com.NumberToWords;

public class NumberToWordsTest {
	NumberToWords ntw=new NumberToWords();
	
	@Test
	public void testNumtoWords() { 
		int num=10;
		String results=ntw.numToWords(num);
		assertNotNull(results);
	}
	@Test
	public void testNumtoWords1() {
		int num=101;
		String results=ntw.numToWords(num);
		assertNotNull(results);
	}
	@Test
	public void testNumtoWords2() {
		
		int num=1000;
		String results=ntw.numToWords(num);
		assertNotNull(results);
	}
	@Test
	public void testNumtoWords3() {
		int num=123456789;
		String results=ntw.numToWords(num);
		assertNotNull(results);
	}
	@Test
	public void testNumtoWords4() {
		int num=0;
		String results=ntw.numToWords(num);
		assertNotNull(results);
	}
	@Test(expected=java.lang.Exception.class)
	public void testNumtoWords5() {
		int num=-40;
		String results=ntw.numToWords(num);
		assertNotNull(results);
	}
	@Test
	public void testNumtoWords6() {
		String num="446";
		String results=ntw.numToWords(Integer.parseInt(num));
		assertNotNull(results);
	}
}
