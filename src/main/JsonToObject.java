package main;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonToObject {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Distributors distributors = mapper.readValue(new File("C://Users/"+ System.getProperty("user.name") +"/Desktop/dirForMarsh/myJson.json"), Distributors.class);

        System.out.println(distributors.toString());
    }
}



