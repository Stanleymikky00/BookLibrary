public class Library {
    public Book[] books;

     public Library(Book[] books) {
         this.books = books;

     }

     private int totalPages() {
         int totalPage = 0;
         for (Book element : books) {
             totalPage += element.getPages();
         }
         return totalPage;
     }

    public Book[] getBooks() {
        return books;
    }

    public  Book thickestBook() {
        Book largestPage = books[0];
        String index ;
        String position;
        for (Book element : books) {
            if (element.getPages() > largestPage.getPages()) {
                largestPage = element;
            }
        }

//        for (int i = 1; i < books.length; i++) {
//            if (books[i].getPages() > largestPage) {
//                largestPage = books[i].getPages();
//                position = books[0].getTitle();
//               // System.out.println(largestPage);
//                index = books[i].getTitle();
//
//                System.out.println("Book with the highest pages");
//                System.out.println("-----------------------------------------------------");
//
//                System.out.println(books[i] );
//                System.out.println("Item @ position 1: " + position );
//
//
//            }
//
//
//
//        }


return books[0];
    }

    @Override
    public String toString() {

         StringBuilder sb = new StringBuilder( " Library with: " + totalPages() +" pages"+ "\n");
         for (Book element : books) {

             sb.append(element.toString() + "\n");

         }



    return sb.toString();
     }
}
