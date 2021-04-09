public class ProgramingBook extends Book {
    private String language;
    private String famework;

    public ProgramingBook(String bookCode, String name, int price, String author, String language, String famework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.famework = famework;
    }

    public ProgramingBook() {
    }

    public ProgramingBook(String language, String famework) {
        this.language = language;
        this.famework = famework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFamework() {
        return famework;
    }

    public void setFamework(String famework) {
        this.famework = famework;
    }
}
