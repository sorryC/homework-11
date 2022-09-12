import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return fullName.equals(author.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return " " + fullName;
    }
}
