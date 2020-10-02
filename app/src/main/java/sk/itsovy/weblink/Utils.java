package sk.itsovy.weblink;

public class Utils {

    public static String getWikipediaUrl(String title){
        title = title.replaceAll(" ","_");
        return "https://sk.wikipedia.org/wiki/"+title;
    }
}
