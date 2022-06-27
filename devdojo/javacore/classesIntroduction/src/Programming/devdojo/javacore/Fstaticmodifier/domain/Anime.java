package Programming.devdojo.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int [] episodes;
    // 0 - Static init block is executed when JVM loads the class and only once
    // 1 - memory allocated
    // 2 - each class attribute is initialized
    // 4 - init block is executed
    // 4 - the constructor is executed

    static {//this is a initialization block!
        episodes = new int[100];
        for (int i = 0;i<episodes.length;i++) {
            episodes[i]=i+1;
        }

    }
    public Anime(String name){//constructor
        this.name = name;
    }
    public Anime(){

        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int[] getEpisodes() {
        return Anime.episodes;
    }

    public static void setEpisodes(int[] episodes) {
        Anime.episodes = episodes;
    }
}
