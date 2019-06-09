package com.TestClasses;

import org.testng.annotations.Test;

import com.Utilities.ReadexcelFile;
import com.Utilities.ReusableActionsClass;

public class Testclass2 {
	
	@Test
	public void f() throws Exception {
		
		ReadexcelFile.readExcel("sheet1");
		
		for(int i=0; i<=ReadexcelFile.rowCount-1; i++)
		{
		String str=ReadexcelFile.readdata[i][0].toString();
		
		System.out.println(str);
		}
	}

}
