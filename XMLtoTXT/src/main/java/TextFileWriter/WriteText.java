package TextFileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WriteText {

	public void writetoTXT(File file, ArrayList<Map<String, String>> recordmapList) {

		try {
			FileWriter fileWriter = new FileWriter(file);

			Iterator<Map<String, String>> ListIter = recordmapList.iterator();
			while (ListIter.hasNext()) {
				fileWriter.write("\n------------\n");
				Map<String, String> mapEntry = ListIter.next();
				Iterator<Entry<String, String>> mapRecorditr = mapEntry.entrySet().iterator();
				while (mapRecorditr.hasNext()) {
					Entry<String, String> entryset = mapRecorditr.next();
					fileWriter.write(entryset.getKey() + ": " + entryset.getValue() + "\n");
				}
			}

			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
