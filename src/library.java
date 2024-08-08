class librarymanager{
    String[] books;
    int no_of_books;

    public librarymanager() {
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addbook(String name){
        this.books[no_of_books]=name;
        no_of_books++;
        System.out.println(name+" has been added.");
    }
    void availablebooks(){
        System.out.println("Available Books are:");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issuebook(String name){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(name)){
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("The book does not exist.");
    }
    void returnBook(String name){
        addbook(name);
    }
}

public class library {
    public static void main(String[] args) {
        librarymanager lib=new librarymanager();
        lib.addbook("Algorithms");
        lib.addbook("C++");
        lib.addbook("Computer Networks");
        lib.availablebooks();
        lib.issuebook("C++");
        lib.availablebooks();
        lib.returnBook("C++");
        lib.availablebooks();
    }

}
