package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JsonDataReader {

        public String userName, password ,locked_out_user,problem_user,performance_glitch_user,firstName,lastName,postalCode;
    ;

        public void JsonReader() throws IOException, ParseException
        {
            String filePath = "src/test/java/data/userData.json";

            File srcFile = new File(filePath);
            JSONParser parser = new JSONParser();
            JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));
            for(Object jsonObj : jarray)
            {
                JSONObject person = (JSONObject) jsonObj ;
               userName  = (String) person.get("username");
                System.out.println(userName);

               locked_out_user =(String)person.get("locked_out_user");
               System.out.println(locked_out_user);

                problem_user = (String)person.get("problem_user");
                System.out.println(problem_user);

                performance_glitch_user=(String)person.get("performance_glitch_user");
                System.out.println(performance_glitch_user);

               password = (String) person.get("password");
                System.out.println(password);

                firstName= (String)person.get("firstname");
                System.out.println(firstName);
                lastName =(String)person.get("lastname");
                System.out.println(lastName);
                postalCode =(String)person.get("postalCode");
                System.out.println(postalCode);

            }


        }
}