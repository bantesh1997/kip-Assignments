import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class WordCount {

    public static void main(String args[]) {


        File file =
                new File("/home/knoldus/Desktop/file.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            Map<String, Integer> map = new HashMap<>();

                while ((st = br.readLine()) != null) {

                    String[] words = st.split(" ");

                  for(int i=0;i<words.length;i++) {
                      if (!map.containsKey(words[i]))
                          map.put(words[i], 1);
                      else {
                          int x = map.get(words[i]);
                          map.put(words[i], x + 1);
                      }

                  }
                }
            System.out.println(map);
        }
         catch (IOException e)
        {
            e.printStackTrace();
        }

        }
}
