package Programming.devdojo.javacore.CoverloadMethods.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;

    public void init(String name,String type, int episodes){
        this.name= name;
        this.type = type;
        this. episodes = episodes;
    }
//    public void init2(String name,String type, int episodes, String gender){
//        this.name= name;
//        this.type = type;
//        this. episodes = episodes;
//        this.gender= gender;
//    }
public void init(String name,String type, int episodes, String gender){
    this.init(name, type, episodes);
        this.gender= gender;

}


    public void inPrint(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
