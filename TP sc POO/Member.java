import java.util.*;
public final class Member {
    private final int id;
    private final String nom;
    private final String email;
    public Member(int i,String n,String e){
      id=i;
     nom=n;
     email=e;
    }
    int getId(){
        return id;
    }
    String getNom(){
        return nom;
    }
    String getEmail(){
        return email;
    }
}
