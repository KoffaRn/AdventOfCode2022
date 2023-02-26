import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class day2part2 {
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
        for(int i = 0; i < opponent.size(); i++) {
            if(me.get(i) == 'X') {
                if(opponent.get(i) == 'A') {
                    myScore += 3;
                }else if(opponent.get(i) == 'B') {
                    myScore += 1;
                } else if (opponent.get(i) == 'C') {
                    myScore += 2;
                }
            }

            else if (me.get(i) == 'Y') {
                if(opponent.get(i) == 'A') {
                    myScore += 4;
                }else if(opponent.get(i) == 'B') {
                    myScore += 5;
                } else if (opponent.get(i) == 'C') {
                    myScore += 6;
                }
            }

            else if (me.get(i) == 'Z') {
                if(opponent.get(i) == 'A') {
                    myScore += 8;
                }else if(opponent.get(i) == 'B') {
                    myScore += 9;
                } else if (opponent.get(i) == 'C') {
                    myScore += 7;
                }
            }
        }
        System.out.println(myScore);
    }
}
