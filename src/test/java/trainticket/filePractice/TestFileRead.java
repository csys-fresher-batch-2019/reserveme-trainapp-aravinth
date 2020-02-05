package trainticket.filePractice;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestFileRead {

	public static void main(String[] args) throws IOException{
		String fileName = "marks.txt";
		Path path = Paths.get(fileName);
		byte[] bytes = Files.readAllBytes(path);
		String content = new String(bytes);
		System.out.println("Read Lines");
		List<String>readAllLines = Files.readAllLines(path);
		for(String line :readAllLines) {
			System.out.println(line);
		}
	}

}
