package pl.coderslab.cflowcontrol;

public class Main08Sample {

	public static void main(String[] args) {
	    //defining a variable with number of rows and asterisks in a row
	    int n = 5;

	    //creating a loop that will generate ROWS
	    for (int i = 0; i < n; i++) {
	        String row = "";//variable storing asterisks in a row, it is zeroed at the beginning of each iteration

	        //creating a loop that will generate asterisks in a row
	        for (int j = 0; j < n; j++) {
	            row += "*";
	        }
	        System.out.print(row + "\n");//displaying asterisks from a row and adding newline sign
	    }
	}

}
