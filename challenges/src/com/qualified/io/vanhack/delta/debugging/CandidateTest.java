package com.qualified.io.vanhack.delta.debugging;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

/**
 *
 * brunolima on Apr 30, 2021
 * 
 */

public class CandidateTest {

	@Test
	public void providedExample1() throws IOException {
		String programNameUnderTest = "CaesarCipher";
		String failingInputFilename = "example_input/example_01.txt";
		String expected = "æ";

		/*
		 * We can compile once in the first test--the binary will persist for the
		 * remainder of the test suite
		 */
		TestUtilities.runCommand("javac " + programNameUnderTest + ".java");

		String actual = CrashMinimizer.minimize("java " + programNameUnderTest, failingInputFilename);
		assertEquals(expected, actual);
	}

	@Test
	public void providedExample2() throws IOException {
		String programNameUnderTest = "CaesarCipher";
		String failingInputFilename = "example_input/example_02.txt";
		String expected = "↑";

		String actual = CrashMinimizer.minimize("java " + programNameUnderTest, failingInputFilename);
		assertEquals(expected, actual);
	}

}
