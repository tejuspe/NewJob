package cot.states;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports 
{
public static void generateJVMReports(String json)
{
	File f = new File("C:\\Users\\admin\\Desktop\\JVM Reports");
	Configuration con = new Configuration(f,"tejasJVM Report");
	con.addClassifications("Browser","Chrome");
	con.addClassifications("Sprint","4");
	con.addClassifications("OS","WINDOWS");
	List<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add(json);
	ReportBuilder rb = new ReportBuilder(jsonFiles,con);
	rb.generateReports();
	
			
}

}
