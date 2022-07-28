package org.BassclassExample;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
	public static void createJVMreport(String li) {
File location= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\JVMreport");
Configuration config= new Configuration(location, "Traget");
List<String>lis= new LinkedList<String>();
lis.add(li);

ReportBuilder r=new ReportBuilder(lis , config);
r.generateReports();
	}

}
