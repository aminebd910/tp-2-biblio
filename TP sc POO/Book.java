import java.util.*;
public final class Book {
    private final  String titre;
    private final String Isbn;
    private final String auteur;

    public Book(String i,String t,String a){
        Isbn=i;
        titre=t;
        auteur=a;
    }
    String getIsbn(){
        return Isbn;
    }
    String gettitre(){
        return titre;
    }
    String getauteur(){
        return auteur;
    }
}