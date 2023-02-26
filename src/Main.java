import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        int calorieCounter = 0;
        ArrayList<Integer> dwarfs = new ArrayList<>();
        FileInputStream fstream = new FileInputStream("rsinput.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            //calorieCounter += Integer.parseInt(strLine);
            if (strLine.isEmpty()){
                dwarfs.add(calorieCounter);
                calorieCounter = 0;
            }else {
                calorieCounter += Integer.parseInt(strLine);
            }
        }
        int topThree = 0;
        for (int i = 0; i < 3; i++) {
            int maximum = Collections.max(dwarfs);
            int dwarfRemove = dwarfs.indexOf(maximum);
            dwarfs.remove(dwarfRemove);
            topThree += maximum;
        }
        System.out.print(topThree);
    }
}