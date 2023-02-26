import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class day2 {
    public static void main(String[] args) throws IOException {
        int myScore = 0;
        File f = new File("rpsinput.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int c = 0;
        ArrayList<Character> opponent = new ArrayList<>();
        ArrayList<Character> me = new ArrayList<>();

        while((c = br.read()) != -1) {
            char character = (char) c;
            if (c <= 67 && c >= 65) {
                opponent.add(character);
            }else if (c >= 88 && c <= 90) {
                me.add(character);
            }
        }
        System.out.println(opponent.size());
        System.out.println(me.size());
        for(int i = 0; i < opponent.size(); i++) {
            if(me.get(i) == 'X') {
                myScore += 1;
                if(opponent.get(i) == 'A') {
                    myScore += 3;
                } else if (opponent.get(i) == 'C') {
                    myScore += 6;
                }
            } else if (me.get(i) == 'Y') {
                myScore += 2;
                if(opponent.get(i) == 'A') {
                    myScore += 6;
                }
                else if(opponent.get(i) == 'B') {
                    myScore += 3;
                }
            } else if (me.get(i) == 'Z') {
                myScore += 3;
                if(opponent.get(i) == 'B') {
                    myScore += 6;
                }else if(opponent.get(i) == 'C') {
                    myScore += 3;
                }
            }
        }
        System.out.println(myScore);
    }
}