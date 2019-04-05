package XMLReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * @author 82296AD1601
 *
 */
public class ReadXMLClass {

	public ArrayList<Map<String, String>> reader(File file) {

		ArrayList<Map<String, String>> recordmapList = new ArrayList<Map<String, String>>();

		SAXBuilder builder = new SAXBuilder();
		try {
			Document doc = builder.build(file);

			Element rootElement = doc.getRootElement();
			List<Element> empRecords = rootElement.getChildren("EMPLOYEE-RECORD");
			for (int i = 0; i < empRecords.size(); i++) {

				Element currentRecord = empRecords.get(i);
				Map<String, String> employeeRecordMap = new HashMap<String, String>();
				employeeRecordMap.put("NAME", currentRecord.getChildText("NAME"));
				employeeRecordMap.put("AGE", currentRecord.getChildText("AGE"));
				employeeRecordMap.put("ID", currentRecord.getChildText("ID"));
				employeeRecordMap.put("SALARY", currentRecord.getChildText("SALARY"));
				recordmapList.add(employeeRecordMap);
				
			}

		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordmapList;
	}
	
}
