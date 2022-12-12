public class TrawlerInfo {
    private String name;
    private String transponder;
    private String type;

    public TrawlerInfo() {
    }

   public TrawlerInfo(String name, String transponder, String type) {
        this.name =name;
        this.transponder = transponder;
        this.type = type;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransponder() {
        return transponder;
    }

    public void setTransponder(String transponder) {
        this.transponder = transponder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String Trawlerclass() {
        return "TrawlerApp{" +
                "name='" + name + '\'' +
                ", transponder='" + transponder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}



