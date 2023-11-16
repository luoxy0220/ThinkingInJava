import util.Directory;
import util.PPrint;
import util.Print;

import java.io.File;

/**
 * @Date: 2023/11/15 15:32
 * @Author: Sean Luo
 * @Description: Sample use of Directory utilities.
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        // All directories:
        PPrint.pprint(Directory.walk(".").dirs);
        // All files beginning with 'T'
        for(File file : Directory.local(".", "T.*"))
            Print.print(file);
        Print.print("----------------------");
        // All Java files beginning with 'T':
        for(File file : Directory.walk(".", "T.*\\.java"))
            Print.print(file);
        Print.print("======================");
        // Class files containing "Z" or "z":
        for(File file : Directory.walk(".",".*[Zz].*\\.class"))
            Print.print(file);
    }
}
