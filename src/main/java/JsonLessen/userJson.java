package JsonLessen;

public class userJson {
    @JsonElement
    private String name;
    @JsonElement(key = "PersonAge")
    private String age;
    private String country;

    public userJson(String name, String age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
}
