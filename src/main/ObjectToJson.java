package main;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectToJson {
    public static void main(String[] args) throws IOException {
        Distributors distributors = new Distributors();
        distributors.addBook(new Book("Aldous Huxley", "Brave New World", 15.25));
        distributors.addBook(new Book("Richard Feynman", "Surely You're Joking, Mr. Feynman!", 20.50));
        distributors.addDistributor("Book Shop");
        distributors.addDistributor("Brand New Book Shop");

        ObjectMapper mapper = new ObjectMapper();

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("C://Users/"+ System.getProperty("user.name") +"/Desktop/dirForMarsh/myJson.json"), distributors);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(distributors));

    }
}
