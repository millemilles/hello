
package json;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;


public class JSON {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String jsonTxt = FileReader.loadFileIntoString("json/personnages.json", "UTF-8");
        JSONArray toujours = JSONArray.fromObject(jsonTxt);
        
        System.out.println(toujours);

        for(int i=0;i<toujours.size();i++){
                    System.out.println(toujours.get(i));

        }
            
    }
    
}
