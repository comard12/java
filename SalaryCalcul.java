package run;

import java.io.*;
import java.util.*;
class Employee{
	protected String name;
	protected int Salary;
	public  String toString() {
		return "Name: "+name+"\n"+"Month Salary: "+Salary+"\n"+"Annual Salary: "+Salary*12;
	}
}

class Salesman extends Employee{
	 int yearsale;
	{
		if(yearsale*0.02 > 20000) {
			yearsale = 1000000;
		}
	}
	public double annualSalary() {
		return Salary*12+yearsale*0.02;
	}
	@Override
	public  String toString() {
		return "Name: "+name+"\n"+"Month Salary: "+Salary+"\n"+"Annual Salary: "+this.annualSalary();
	}
	
}

class Executive extends Employee{
	 int StockPrice;
	{
		if(StockPrice > 50)
			Salary+=2500;
	}
	@Override
	public  String toString() {
		return "Name: "+name+"\n"+"Month Salary: "+Salary+"\n"+"Annual Salary: "+Salary*12;
	}
	
}



public class SalaryCalcul {
	private static Employee Employee;
	private static Salesman Salesman;
	private static Executive Executive;

	public static void main(String arg[]) throws IOException {
		String[][] a = new String[2][10] ;
		String[] w = new String[20] ;
		String[] s = new String[100];
		int i = 0;
		int j = 0;
		int z = 0;
		//파일 읽고 w[20]에 저장
		File f = new File("C:\\Users\\admin\\Desktop\\1.txt");
		try(
				FileReader rw = new FileReader("C:\\Users\\admin\\Desktop\\1.txt");
				BufferedReader br = new BufferedReader(rw);
				){
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				w[z] = readLine;
				z++;
				}
			}catch(IOException e) {
				System.out.println(e);
		}
		int count = 0;
		for(i=0; i<z; i++) {
			String e;
			StringTokenizer st = new StringTokenizer(w[i]," ");
			while(st.hasMoreTokens()){
					e = st.nextToken();
					
					s[count]=e;
					count++;
			}
		}
		
		
		
		
		
		for(int test = 0; test<count; test++) {
			if(s[test].equals("Employee")) {
				Employee e = new Employee();
				e.name = s[test+1];
				e.Salary = Integer.parseInt(s[test+2]);
				System.out.println("<"+s[test-1]+">"+"\n"+e.toString());
			}
			else if(s[test].equals("Salesman")) {
				Salesman e = new Salesman();
				e.name = s[test+1];
				e.Salary = Integer.parseInt(s[test+2]);
				e.yearsale = Integer.parseInt(s[test+3]);
				System.out.println("<"+s[test-1]+">"+"\n"+e.toString());
			}
			else if(s[test].equals("Executive")) {
				Salesman e = new Salesman();
				e.name = s[test+1];
				e.Salary = Integer.parseInt(s[test+2]);
				e.yearsale = Integer.parseInt(s[test+3]);
				System.out.println("<"+s[test-1]+">"+"\n"+e.toString());
			}
			
		}
	
		
		
		
	}
	
}
