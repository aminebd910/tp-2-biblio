

public class Main {
  
    public static void main(String[] args) {

        Library lib = new Library(5, 5, 5);

        Book b1 = new Book("123-ABC", "Java pour débutants", "Dupont");

       
        Member m1 = new Member(1, "Amine", "amine@gmail.com");


        lib.addBook(b1);
        lib.addMember(m1);

        
Loan l1 = new Loan(b1, m1, "10/11/2025", "20/11/2025");
lib.addLoan(l1);
    

        System.out.println("Programme terminé !");
    }
}


