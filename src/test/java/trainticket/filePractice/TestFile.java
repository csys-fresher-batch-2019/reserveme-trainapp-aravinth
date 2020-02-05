package trainticket.filePractice;

import java.io.IOException;

import trainticket.AdminRole.FileUtil;

public class TestFile {

	public static void main(String[] args) throws IOException{
		FileUtil.writeToFile("employees.txt", "Aravinth\nManoj");
		FileUtil.writeToFile("departments.txt","ECE,CSE");
		FileUtil.writeToFile("marks.txt", "Aravinth,100\nManoj,90");
	}

}
