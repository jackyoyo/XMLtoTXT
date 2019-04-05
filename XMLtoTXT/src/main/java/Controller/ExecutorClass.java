package Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import TextFileWriter.WriteText;
import XMLReader.ReadXMLClass;

public class ExecutorClass {
		
	
	public static void main(String[] args) {
		
		File srcFile = new File(".\\Input\\Employee.xml");
		File destFile = new File(".\\Output\\Employee.txt");
		
		ReadXMLClass readXMLClass = new ReadXMLClass();
		ArrayList<Map<String, String>> empRecordList = readXMLClass.reader(srcFile);
		
		WriteText writeText = new WriteText();
		writeText.writetoTXT(destFile, empRecordList);
		
	}
}
