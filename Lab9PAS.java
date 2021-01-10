import java.util.ArrayList;
import java.util.Scanner;

class file{
    String name;
    String way;
    file(String name, String path){
        this.name= name;
        this.way=path;
    }
    public String toString() {
        return "file(" +
                "Название='" + name + '\'' +
                ", путь к файлу='" + way + '\'' +
                ')';
    }
}
class musicFile extends file{
    musicFile(String name, String path) {
        super(name, path);
    }
    public String toString() {
        return "Звуковой файл файл (" +
                "Название='" + name + '\'' +
                ", путь к файлу='" + way + '\'' +
                ')';
    }
}

class videoFile extends file{
    videoFile(String name, String path) {
        super(name, path);
    }
    public String toString() {
        return "Видеофайл (" +
                "Название='" + name + '\'' +
                ", путь к файлу='" + way + '\'' +
                ')';
    }
}

class Package{
    private ArrayList<file> masCar=new ArrayList<file>();
    public void addFile(file m){
        masCar.add(m);
    }
    public void printFiles() {
        System.out.println("В каталоге: ");
        for (file a : masCar) {
            System.out.println("\t" + a.toString());
        }
    }
    public void numberOfMusicFiles(){
        int Mus=0;
        for (file a : masCar) {
            if (a instanceof musicFile) {
                Mus+=1;
            }
        }
        System.out.println("Колво звуковых файлов "+ Mus);
    }
    public void numberOfVideoFiles(){
        int Video=0;
        for (file a : masCar) {
            if (a instanceof videoFile) {
                Video+=1;
            }
        }
        System.out.println("\t" +"Количество видеофайлов "+ Video);
    }
}

public class Lab9PAS{
    public static void main(String[] args) {
        Package alice = new Package();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t" +"Колво звуковых файлов");
        int music= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < music; i++) {
            System.out.println("Название музыкального файла ");
            String name = sc.nextLine();
            System.out.println("Путь к звуковому файлу");
            String path = sc.nextLine();
            musicFile music1 = new musicFile(name,path);
            alice.addFile(music1);
        }
        System.out.println("Колво видеофайлов");
        int video= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < video; i++) {
            System.out.println("Название видеофайла");
            String name = sc.nextLine();
            System.out.println("Путь к видеофайлу");
            String way = sc.nextLine();
            videoFile video1 = new videoFile(name,way);
            alice.addFile(video1);
        }
        alice.printFiles();
        alice.numberOfMusicFiles();
        alice.numberOfVideoFiles();
    }
}