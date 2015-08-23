package me.jorva.twitchbot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public final class PermUtil {
	public static ArrayList<String> read(File f) {
		ArrayList<String> output = new ArrayList<String>();
		if (!f.exists())
			return output;

		try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
			String line = reader.readLine();
			while (line != null) {
				output.add(line);
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;

	}
}
