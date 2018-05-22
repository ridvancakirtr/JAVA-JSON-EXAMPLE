package JSON;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSON {
    JSON() throws JSONException {
        JSONObject obj=new JSONObject();
        obj.put("name","RIDVAN");
        obj.put("age",24);
        obj.put("salary",6000);
        System.out.print("JSON OBJECT : "+ obj+"\n");

        JSONArray arry = new JSONArray();
        arry.put("22");
        arry.put("22");
        arry.put("600");
        System.out.print("JSON ARRAY : "+arry+"\n");

        String s="{\"name\":\"RIDVAN\",\"salary\":6000,\"age\":24}";
        JSONObject k=new JSONObject(s);
        String name = k.get("name").toString();
        String salary = k.get("salary").toString();
        String age = k.get("age").toString();

        System.out.println(name+"\t"+salary+"\t"+age);

    }
    public static void main(String[] args) throws JSONException {
        new JSON();
    }


}
