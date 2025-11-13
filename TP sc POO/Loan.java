public class Loan {
    private final Book book;
    private final Member member; 
    private final String dateLoan;
    private final String dateRetour;
    private String etat;

    public Loan(Book book, Member member, String dateLoan, String dateRetour) {
        if (book == null || member == null || dateLoan == null || dateRetour == null) {
            throw new IllegalArgumentException("Données manquantes");
        }

        this.book = book;
        this.member = member;
        this.dateLoan = dateLoan;
        this.dateRetour = dateRetour;
        this.etat = "ACTIVE"; 
    }

  
    public String getDateLoan() { return dateLoan; }
    public String getDateRetour() { return dateRetour; }
    public String getEtat() { return etat; }
    public Book getBook() { return book; }
    public Member getMember() { return member; }

    public void rendre() {
        if (etat.equals("RETURNED")) {
            throw new IllegalStateException("Livre déjà rendu");
        }
        this.etat = "RETURNED";
    }

   
    public String toString() {
        return book.gettitre() + " emprunté par " + member.getNom() + " - Etat: " + etat;
    }
}
