class Main {
    static void main() {
        var b1 = new Book("Da Vinci Code", "Dan Brown");
        var b3 = new Book("Angels & Demons", new String("Dan Brown"));

        IO.println(b1.isFromTheSameAuthor(b3));

        var javaBook = new Book("Da Java Code", "Duke Brown");
        IO.println(javaBook);
    }
}