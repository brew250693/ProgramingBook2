public class Main {
    public static void main(String[] args) {
        Book dataBook[] = new Book[10];
        dataBook[0] = new ProgramingBook("bc1", "book1", 25, "author1", "Java", "fw1");
        dataBook[1] = new ProgramingBook("bc2", "book2", 50, "author2", "php", "fw2");
        dataBook[2] = new ProgramingBook("bc3", "book3", 40, "author3", "Java", "fw3");
        dataBook[3] = new ProgramingBook("bc4", "book4", 30, "author4", "php", "fw4");
        dataBook[4] = new ProgramingBook("bc5", "book5", 25, "author5", "Java", "fw5");
        dataBook[5] = new FictionBook("bc6", "book6", 10, "author6", "cat1");
        dataBook[6] = new FictionBook("bc7", "book7", 15, "author7", "cat2");
        dataBook[7] = new FictionBook("bc8", "book8", 20, "author8", "cat3");
        dataBook[8] = new FictionBook("bc9", "book9", 25, "author9", "cat4");
        dataBook[9] = new FictionBook("bc10", "book10", 30, "author10", "cat5");
        int sum = 0;
        for (int i = 0; i < dataBook.length; i++) {
            sum += dataBook[i].getPrice();
        }
        System.out.println("Tong tien 10 cuon sach: " + sum);

        ProgramingBook[] arr = new ProgramingBook[5];
        int count = 0;
        for (Book a : dataBook) {
            if (a instanceof ProgramingBook) {
                ProgramingBook programingBook = (ProgramingBook) a;
                if (programingBook.getLanguage().equals("Java")) {
                    arr[count] = programingBook;
                    count++;
                }
            }
        }
        System.out.println("So sach ProgramingBook co language Java la: " + count);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
//            System.out.println(arr[i]);
                System.out.println("Sach co ngon ngu Java ten la - " + arr[i].getName());
        }
    }
}
