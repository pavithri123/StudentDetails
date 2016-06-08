package com.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Common extends ViewData {

	public void readFile(String id) throws IOException {

		BufferedReader br = null;
		br = new BufferedReader(new FileReader(".//Testdata//Student Details.txt"));

		String scurrentLine;

		while ((scurrentLine = br.readLine()) != null) {

			String[] urls = scurrentLine.split("\t");
			if (urls[0].equals(id)) {
				setStudent_Name(urls[1]);
				setDob(urls[2]);
				setaddress(urls[3]);

			}

		}
		view();
	}
}
