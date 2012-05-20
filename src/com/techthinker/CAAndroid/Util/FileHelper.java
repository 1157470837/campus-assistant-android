package com.techthinker.CAAndroid.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.os.Environment;

import com.techthinker.CAAndroid.Define.Constant;

public class FileHelper {

	// check the sdCard state
	public boolean checkSDState() {
		if (!Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {
			return false;
		} else
			return true;
	}

	// create a file in sdCard
	public File creatFileInDSCard(String fileName) throws IOException {
		File file = new File(Constant.DEFAULT_SD_PATH + fileName);
		file.createNewFile();
		return file;
	}

	// create a folder in sdCard
	public File creatDir() {
		File dirFile = new File(Constant.DEFAULT_SD_PATH);
		dirFile.mkdirs();
		return dirFile;
	}

	// check if a file exits
	public boolean isFileExist(String fileName) {
		File file = new File(Constant.DEFAULT_SD_PATH + fileName);
		return file.exists();
	}

	// lists all the files in the default folder
	public File[] listAllFiles() {
		if (checkSDState()) {
			creatDir();
			File defaultDir = new File(Constant.DEFAULT_SD_PATH);
			return defaultDir.listFiles();
		}
		return null;
	}

	//get the inputStream in the default folder by a file name
	public InputStream getInputStream(String name) throws FileNotFoundException {
			return new FileInputStream(Constant.DEFAULT_SD_PATH + name);
	}

	// write a file in sdCard from a inputStream
	public File write2SDFromInput(String fileName, InputStream input) {
		File file = null;
		OutputStream output = null;
		try {
			creatDir();
			file = creatFileInDSCard(fileName);
			output = new FileOutputStream(file);
			byte buffer[] = new byte[4 * 1024];
			int temp;
			while ((temp = input.read(buffer)) != -1) {
				output.write(buffer, 0, temp);
			}
			output.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return file;
	}

}
