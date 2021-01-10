import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Lab6PAS {
    public static void main(String[] args) {
        File dir1 = new File("C://Исходный файл.txt");
        File f1=new File("C://Перезаписанный файл.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(dir1));
            String boom;
            while((boom = reader.readLine()) != null ){
                if(!boom.isEmpty()){
                    String[] words = boom.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].length() % 2 != 0) {
                            words[i] = null;
                        }
                    }
                    String[] mora = Arrays.stream(words).filter(Objects::nonNull).toArray(String[]::new);

                    try(FileWriter writer = new FileWriter(f1)){
                        String klee = String.join(" ", mora);
                        writer.write(klee);
                        writer.flush();
                    }
                }
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
