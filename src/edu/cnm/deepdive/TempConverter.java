package edu.cnm.deepdive;

/**
 * Simple class to demonstrate reading properties and iterating over
 * arguments.
 */
public class TempConverter {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			
			String mode = System.getProperty("mode");
			
			if (mode != null && mode.equals("c2f")) {
				float tempC = Float.parseFloat(args[i]);
				System.out.println(convertCToF(tempC));
			} else {  //mode is "f2c", default
				float tempF = Float.parseFloat(args[i]);
				System.out.println(convertFToC(tempF));
			}
		}
	}
	
	/**
	 * Convert temperature fahrenheit to celsius.
	 *
	 * @param tempF Temperature in Fahrenheit degrees.
	 * @return Temperature in Celsius degrees.
	 */
	public static float convertFToC(float tempF) {
		float tempC = (tempF - 32) * 5 / 9;
		return tempC;
	}
	
	/**
	 * Convert temperature celsius to fahrenheit.
	 *
	 * @param tempC Temperature in Celsius degrees.
	 * @return Temperature in Fahrenheit degrees.
	 */
	public static float convertCToF(float tempC) {
		float tempF = tempC * 9 / 5 + 32;
		return tempF;
	}
}

/*
change directory to the TempConverter project folder
javac -d out src\edu\cnm\deepdive\*.java     <--- look for sourcecode to compile to bytecode .class file
														 directory structure must match the package path
java -cp out edu.cnm.deepdive.TempConverter 212     <--- full qualified class name inside the "out" directory

.gitignore     <---file with line "out" will not upload anything in this folder substructure
git init       <---to create a repository
git add .      <---add everything in it to the staging area
git commit -m "Simple functionality implemented"  <---50 characters or less
git remote add origin git@github.com:darbach/temp-converter.git  <---link it to a repository created on github
git status      <--- get the origin
git push --set-upstream origin master   <---set the default upstream
java -cp out -Dmode=c2f edu.cnm.deepdive.TempConverter -273.15 0 -40 100
java -cp out -Dmode=f2c edu.cnm.deepdive.TempConverter 212 32 -40  OR remove the -Dmode argument
javadoc -d docs\api -sourcepath src -subpackages edu -link https://docs.oracle.com/en/java/javase/11/docs/api/   <---generate javadoc html for all sourcecode in edu subdirectories, link option will insert links to other library documentation
jar cfe TempConverter.jar edu.cnm.deepdive.TempConverter -C out edu\cnm\deepdive\*.class  <--- create jar file from entry point everything inside -C directory
*/