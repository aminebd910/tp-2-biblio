import java.util.*;
public class Library {
    private Book[] books;
    private Member[] members;
    private Loan[] loans;
    Library(int maxbooks,int maxmembers,int maxloans){
        books=new Book[maxbooks];
        members=new Member[maxmembers];
        loans=new Loan[maxloans];
    }
    void addBook(Book b) {
    for (int i=0;i< books.length;i++) {
        if (books[i]==null) {
            books[i] = b;
            System.out.println("Livre ajouter ");
            return;
        }
    }
    System.out.println("Tableau plein");
}

public void addMember(Member m) {
    for (int i = 0; i < members.length; i++) {
        if (members[i] == null) {
            members[i] = m;
            System.out.println("Membre ajouter ");
            return;
        }
    }
    System.out.println("Tableau plein.");
}
public void addLoan(Loan l) {
    for (int i = 0; i < loans.length; i++) {
        if (loans[i] == null) {
            loans[i] = l;
            System.out.println("Emprunt enregistrer");
            return;
        }
    }
    System.out.println("Tableau plein.");
}

}
