package edu.upenn.cit594.datamanagement;

import java.io.File;

public class CheckReadability {


	// checks if file is readable
	public static File checkReadability(String filename) {
		File f = null;

		boolean fileReads = false;
		try {

			f = new File(filename);

			// true if file exists
			fileReads = f.exists();

			// if file exists
			if (fileReads) {

				// read permissions are possible?
				fileReads = f.setReadable(true, true);

				// is file readable?
				fileReads = f.canRead();
			}

		} catch (Exception e) {

			System.out.println("ERROR: " + filename + " file is unreadable or does not exist");
			System.exit(0);
		}
		if (fileReads == false) {
			System.out.println("ERROR:  " + filename + "  file is unreadable or does not exist");
			System.exit(0);
		}
		return f;

	}
}
