
import  com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import  com.fasterxml.jackson.databind.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class TestJSON {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
		Sectiune  sectiune=null;
		String content2= "class";
	File bookJsonFile = new File("book.json");
	ObjectMapper mapper = new ObjectMapper();
	Class<content2> map =content2.class;
	
	
sectiune= mapper.readValue(bookJsonFile, Sectiune.class);
System.out.println(sectiune.getClass());


		
		
		
		
	}
}
