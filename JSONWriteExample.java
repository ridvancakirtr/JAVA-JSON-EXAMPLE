package JSON;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

public class JSONWriteExample {

    JSONWriteExample() throws JSONException, FileNotFoundException {
        JSONObject obj=new JSONObject();
        obj.put("id","20141434");
        obj.put("name","RIDVAN");
        obj.put("surname","CAKIR");

        HashMap<String,String> lang1 = new HashMap<>();
        lang1.put("lang","android");
        lang1.put("knowledge","proficient");

        HashMap<String,String> lang2 = new HashMap<>();
        lang2.put("lang","java");
        lang2.put("knowledge","advanced");

        HashMap<String,String> lang3 = new HashMap<>();
        lang3.put("lang","php");
        lang3.put("knowledge","advanced");

        JSONArray b = new JSONArray();
        b.put(lang1);
        b.put(lang2);
        b.put(lang3);

        obj.put("lang",b);

        HashMap<String,String> job = new HashMap<>();
        job.put("name","it specialist");
        job.put("salary","6000$");
        job.put("site","www.ridvancakir.com.tr");
        job.put("email","ridvancakirtr@gmail.com");

        obj.put("job",job);

        System.out.println(obj);

        PrintWriter pw = new PrintWriter("JSONExample.txt");
        pw.write(obj.toString());
        pw.flush();
        pw.close();
    }

    public static void main(String[] args) throws JSONException, FileNotFoundException {
        new JSONWriteExample();
    }
}
