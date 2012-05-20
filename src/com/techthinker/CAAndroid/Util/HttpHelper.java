package com.techthinker.CAAndroid.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpHelper {
	private URL url = null;

	// get inputStream from URL
	public InputStream getInputStreamFromUrl(String urlStr)
			throws MalformedURLException, IOException {
		url = new URL(urlStr);
		HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
		InputStream inputStream = urlConn.getInputStream();
		return inputStream;
	}

	//get all the content of a file into a string from a URL
	public String downloadToString(String urlStr) {
		StringBuffer sb = new StringBuffer();
		String line = null;
		BufferedReader buffer = null;
		try {
			url = new URL(urlStr);
			HttpURLConnection urlConn = (HttpURLConnection) url
					.openConnection();
			buffer = new BufferedReader(new InputStreamReader(
					urlConn.getInputStream()));
			while ((line = buffer.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

	//download a file and write it to sdCard 1: already exits 0: success -1: fails
	public int downloadToSDFile(String urlStr, String fileName) {
		InputStream inputStream = null;
		try {
			FileHelper fileHelper = new FileHelper();

			if (fileHelper.isFileExist(fileName)) {
				return 1;
			} else {
				inputStream = getInputStreamFromUrl(urlStr);
				File resultFile = fileHelper.write2SDFromInput(fileName,
						inputStream);
				if (resultFile == null) {
					return -1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			try {
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

}
