package br.com.ana.cast.tests;

import java.util.Scanner;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MaxDifferenceTest {

	Scanner mockScanner = mock(Scanner.class);

	@Test
	public void testNoValues() {
		MaxDifference maxDifference = new MaxDifference();
		extracted(maxDifference);
	}

	private void extracted(MaxDifference maxDifference) {
		maxDifference.main(null);
	}
}
