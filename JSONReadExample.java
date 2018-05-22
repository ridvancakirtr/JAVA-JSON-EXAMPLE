package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JSONReadExample {
    public static void main(String[] args) throws IOException, ParseException {

        Object obj = new JSONParser().parse(new FileReader("JSONExample.txt"));
        JSONObject jsonObject = (JSONObject) obj;
        String id = jsonObject.get("id").toString();
        System.out.println(id);

        String name = jsonObject.get("name").toString();
        System.out.println(name);

        String surname = jsonObject.get("surname").toString();
        System.out.println(surname);

        JSONArray list = (JSONArray) jsonObject.get("lang");
        /*
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //Yukarıda verilerimizi obje olarak okuyoruz
        */

        Iterator i = list.iterator();
        while (i.hasNext()){
            JSONObject innerObj = (JSONObject) i.next();
            System.out.println("Lang : "+innerObj.get("lang")+"  Level : "+innerObj.get("knowledge"));
        }

        JSONObject job = (JSONObject) jsonObject.get("job");
        System.out.println(job.get("site"));
        System.out.println(job.get("name"));
        System.out.println(job.get("salary"));
        System.out.println(job.get("email"));

    }
}