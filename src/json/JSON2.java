
package json;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;


public class JSON2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String[] noms = new String[10];
        
        String jsonTxt = FileReader.loadFileIntoString("json/declaration.json", "UTF-8");
        JSONObject toujours =  JSONObject.fromObject(jsonTxt);
             
        System.out.println(toujours);
/*
        for (Object toujour : toujours) {
            System.out.println(toujour);
        }
        System.out.println("============");
        for(int i=0;i<toujours.size();i++){
            JSONObject hello = toujours.getJSONObject(i);
            JSONArray goodbye = hello.getJSONArray("personnages");
            goodbye.element("hello");
            
            for(int j=1;j<goodbye.size();j++){
                System.out.println(goodbye.get(j));
            }
        }
            */    
    }

}
