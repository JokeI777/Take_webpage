import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Taker {
    public static void main(String[] args) throws IOException {

        String urWebpage = "https://google.com";
        URL oracle = new URL(urWebpage);
        Scanner in = new Scanner(new BufferedReader(
                new InputStreamReader(oracle.openStream(), StandardCharsets.UTF_8)));

        FileWriter writer = new FileWriter(new File("src\\neededFile.html"));
        while (in.hasNextLine())
            writer.write(in.nextLine());
        in.close();
        writer.close();
    }
}
