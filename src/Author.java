public class Author {
    private String fullName;

    public Author(String fullName) {
        this.fullName = fullName;
    }

    public Author() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "автор: " + fullName;
    }
}
