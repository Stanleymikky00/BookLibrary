public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book(" The Da Vinci Code ", " Dan Brown", 454,1),
                new Book(" Dune", "Frank Herbert", 500,2 ),
                //new Book("Programming Basics","Prof Mike",501,3)

        };


Library library = new Library(books);
System.out.println(library);

System.out.println("--------------------------------------------------------");

System.out.println("Book with the thickest cover : "+ library.thickestBook());







    }
}
