package Chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReverseString {

	@Test
	public void reverseString() {
		char[] regular =  {'a','b', 'c', 'd', ReverseString.END_OF_STRING};
		char[] reverse = {'d', 'c', 'b', 'a', ReverseString.END_OF_STRING}; 

		assertTrue(ReverseString.CompareTo(new ReverseString(regular).Reverse(), reverse) == 0);
	}
	
	@Test
	public void differentString() {
		char[] regular =  {'a','b', 'c', 'd', ReverseString.END_OF_STRING};
		char[] reverse = {'a', 'b', 'c', 'd', ReverseString.END_OF_STRING}; 

		assertFalse(ReverseString.CompareTo(new ReverseString(regular).Reverse(), reverse) == 0);
	}
	
	@Test
	public void emptyString() {
		char[] empty = {ReverseString.END_OF_STRING};
		assertTrue(ReverseString.CompareTo((new ReverseString(empty)).Reverse(), empty) == 0);
	}
	
	
	@Test
	public void hugeString() {
		char[] regular =  "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec qu\0".toCharArray();
		char[] reverse = "m naeneA .rolod tege alugil odommoc naeneA .tile gnicsipida reutetcesnoc ,tema tis rolod muspi meroL \0".toCharArray();
		assertTrue(ReverseString.CompareTo(new ReverseString(regular).Reverse(), reverse) == 0);
	}

}
