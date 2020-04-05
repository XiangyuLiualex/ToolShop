import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * The overall purpose of this code: TO read a file and store everything in a String
 * @author Xiangyu Liu
 * @version 1.0
 * @since Feb. 16, 2020  4:49:56 p.m.
 *
 */
public class FileManager {
	/**
	 * the name of file
	 */
	private String pathName;
	/**
	 * create an answer to store file information
	 */
	private String answer= "";

	/**
	 * read a file and store everything in a String
	 * @throws FileNotFoundException
	 */
	public void readFile()throws FileNotFoundException{
	File fileName= new File(pathName);
	Scanner sc = new Scanner(fileName);
	while(sc.hasNextLine()){
		this.answer+=sc.nextLine();
		this.answer+="\n";
		
	}
	sc.close();
}
	/**
	 * Get a answer String
	 * @return answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * set path name
	 * @param pathName
	 */
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
}



