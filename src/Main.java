import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner sc;
    static String firstline = "";

    static String readN(int n)
    {
        if (firstline.length() < n){
            n = firstline.length();
        }
        String nChars = firstline.substring(0,n);
        firstline = firstline.substring(n);
        return nChars;
    }

    public static void loadLine()
    {
        sc = readFile();
        firstline = sc.nextLine();
    }

    public static Scanner readFile()
    {
        File file = new File("src/HelloWorld.txt");
        try
        {
            return new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("can't find the file");
        }
        return sc;
    }

    public static void main(String[] args)
    {
        loadLine();
        System.out.println("\"" + readN(7) + "\"");
        System.out.println("\"" + readN(7) + "\"");
        System.out.println("\"" + readN(7) + "\"");
    }
}
