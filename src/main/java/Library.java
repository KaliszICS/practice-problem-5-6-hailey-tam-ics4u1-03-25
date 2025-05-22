class Library{
    Book[] book;

    public Library(Book[] book){
        this.book = book;
    }

    public void addBook(Book newBook){
        Book[] newBooks = new Book[this.book.length + 1];
        for (int i = 0; i < this.book.length; i++){
            newBooks[i] = this.book[i];
        }
        newBooks[this.book.length] = newBook;
        this.book = newBooks;
    }

    public void removeBook (String ISBN){
        int index = -1;
        for (int i = 0; i < this.book.length; i++){
            if (this.book[i].getISBN().equals(ISBN)){
                index = i;
                i = this.book.length;
            }
        }

        Book[] booksAfter = new Book[this.book.length -1];
        int currentIndex = 0;
        for (int i = 0; i < this.book.length; i++){
            if (i != index){
                booksAfter[currentIndex++] = this.book[i];
            }
        }
        this.book = booksAfter;
    }

    public Book[] searchBook(String title){
        Book[] foundBooks = {};
        int currentIndex = 0;

        for (int i = 0; i < this.book.length; i++){
            if (this.book[i].getTitle().equals(title)){
            foundBooks[currentIndex++] = this.book[i];
            }
        }
        return foundBooks;
    }

    public Book[] displayBooks(){
        return this.book;
    }
}