package com.capgemini.assignments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TwentyThird {

	public static void main(String[] args) throws Exception {
		String strdt = "28/03/2001";
		Date date = new SimpleDateFormat("dd/mm/yyyy").parse(strdt);
		System.out.println("String date: "+strdt+", date format date: "+date);
	}

}
