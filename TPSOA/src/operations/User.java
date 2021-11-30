package operations;

public class User {

    //Attributes
    private long id;
    private String name;
    private String FamName;

    //constructor

    public User() {
    }

    public User(long id, String name, String famName) {
        this.id=id;
        this.name=name;
        this.FamName=famName;
    }

    public User(User user){
        this.id= user.getId();
        this.name= user.getName();
        this.FamName=user.getFamName();
    }


    //getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamName() {
        return FamName;
    }

    //setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamName(String famName) {
        FamName = famName;
    }


}
