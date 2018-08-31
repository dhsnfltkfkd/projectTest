package sample04;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	private String filePath, fileName;
	
	public FileOutputter() {
		System.out.println("FileOutputter default constructor");
	}
	
	public void setFilePath(String filePath) {
		System.out.println("setFilePath");
		this.filePath = filePath;
	}

	public void setFileName(String fileName) {
		System.out.println("setFileName"); //순서보려고 찍게..
		this.fileName = fileName;
	}
	@Override
	public void output(String message) {
		System.out.println("output(String message)");
		try {
			FileWriter fileWriter = new FileWriter(filePath+fileName);
			fileWriter.write(message);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
