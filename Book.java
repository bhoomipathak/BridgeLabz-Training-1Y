
class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "City Library";

    Book(int id, String t, double p) {
        bookId = id;
        title = t;
        price = p;
    }

    double calculateFine(int daysLate) {
        return 0;
    }
}

class TextBook extends Book {
    TextBook(int id, String t, double p) {
        super(id, t, p);
    }

    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Book {
    Magazine(int id, String t, double p) {
        super(id, t, p);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}