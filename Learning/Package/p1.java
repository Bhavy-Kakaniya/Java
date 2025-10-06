package pkgdemo; 
public class p1 {
    public static void main(String[] args) {
        System.out.println("P1");
    }
}


//javac -d . program name.java will make the folder of same name written in package name;
//javac -d . *.java will make the respective folder for all the programes example if two programs have different name
//  in the package name; then it will make two seperate folder for both programe and move the class file to that 
//  folder.
//javac -d abc *.java will create abc folder and all the folder created by this type will come under abc folder.
//include the name of package and then make its object to use that package  
