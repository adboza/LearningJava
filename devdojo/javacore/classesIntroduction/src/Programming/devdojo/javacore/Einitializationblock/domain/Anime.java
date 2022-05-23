package Programming.devdojo.javacore.Einitializationblock.domain;

public class Anime {
    private String name;
    private int [] episodes;
    // 1 - memory allocated
    // 2 - each class attribute is initialized
    // 3 - the constructor is executed
    {//this is a initialization block!
        episodes = new int[100];
        for (int i = 0;i<episodes.length;i++) {
            episodes[i]=i+1;
        }

    }
    public Anime(String name){//constructor
        this.name = name;
    }
    public Anime (){


        System.out.println();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }
}
