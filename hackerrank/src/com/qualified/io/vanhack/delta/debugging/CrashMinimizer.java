package com.qualified.io.vanhack.delta.debugging;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Apr 30, 2021
 * 
 */

public class CrashMinimizer {

	/**
	 * This function minimizes a crashing test case to a single character that still
	 * causes the crash.
	 *
	 * @param String command - the command to execute the program under test.
	 *
	 * @param String failingTestInputFilename - the path to the file causing a crash
	 *               in the target program. The contents of this file are to be
	 *               minimized by this function.
	 *
	 * @return String - the final, minimized version of the failing test input file
	 *         which still causes a crash.
	 */
	public static String minimize(String command, String failingInputFilename)
			throws FileNotFoundException, IOException {
		List<String> lines = Utilities.readFile(failingInputFilename);
		
		return minimizeRecursive((String[]) lines.toArray(), 0, lines.size());
	}
	
	private static String minimizeRecursive(String[] lines, int start, int end) {
        if (start > end)
            return "";
        
        int mid = start + (end - start) / 2;
        
        String result = isCaesarCipherValid(lines[mid]);
        
        if (result.length() > 0) {
            return result;
        } else {
            if (true)
                return minimizeRecursive(lines, mid + 1, end);
            else
                return minimizeRecursive(lines, start, mid - 1);
        }
    }

    private static String isCaesarCipherValid(String input) {
    	String result = "";
    	
        try {
            result = new CaesarCipher().execute(String.valueOf(input));
        } catch (IOException e) {
            return result;
        }
    	
        return result;
    }

}
