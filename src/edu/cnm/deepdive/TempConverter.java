package edu.cnm.deepdive;

public class TempConverter {
	
	public static void main(String[] args) {
		float tempF = Float.parseFloat(args[0]);
		System.out.println(convertFToC(tempF));
	}
	
	public static float convertFToC(float tempF) {
		float tempC = (tempF - 32) * 5 / 9;
		return tempC;
	}
}

/*
change directory to the TempConverter project folder
javac -d out src\edu\cnm\deepdive\TempConverter     <--- look for sourcecode to compile to bytecode .class file
														 directory structure must match the package path
java -cp out edu.cnm.deepdive.TempConverter 212     <--- full qualified class name inside the "out" directory

.gitignore     <---file with line "out" will not upload anything in this folder substructure
git init       <---to create a repository
git add .      <---add everything in it
git commit -m "Simple functionality implemented"  <---50 characters or less
*/