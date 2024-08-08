class librarymanager2{
    String[] books;
    int no_of_books;
    public librarymanager2(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addbooks(String book){
        this.books[no_of_books]=book;
        this.no_of_books++;
        System.out.println(book+" has been added");
    }
    void availablebooks(){
        System.out.println("List of available books");
        for(String book:this.books){

            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issuebook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println(book+" has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("The book does not exist");
    }
    void returnbook(String book){
        addbooks(book);
    }
}
public class library2 {
    public static void main(String[] args) {
        librarymanager2 lib=new librarymanager2();
        lib.addbooks("C++");
        lib.addbooks("Computer Networks");
        lib.addbooks("Operating system");
        lib.availablebooks();
        lib.issuebook("Computer Networks");
        lib.availablebooks();
        lib.returnbook("Computer Networks");
        lib.availablebooks();
    }
}
