package Utils;

//We use "final" keyword with class so that no one can inherit the class
public final class Constants {
    private Constants (){

    }
    //We use "final" keyword with variables so that variables become constants
    //We use "static" so that we can use these variable without making objects
    public static final String apiURI = "https://reqres.in";
    public static final String apiPath = "/api/";
}
