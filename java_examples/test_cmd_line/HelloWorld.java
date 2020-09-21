package hellopack; //semicolon is necessary for the package.

//class name and file name should be the same
public class HelloWorld{

	public static void main(String[] args){
		System.out.print("Hello World from Cmd line.");	//semicolon for anything in main.
	}
/*compile a java file using javac Filename.java
*and run it using java ClassName
*and if you have to place your class in a package then run
*javac -d . FileName.java
*java packagename.ClassName
*/
}