public class Main {
    public static void main(String[] args) {
            Author author = new Author("Пушкин Александр Сергеевич");
            Book poltava = new Book(author, 1828, "Полтава");
            Book poltava2 = new Book(author, 1828, "Полтава");
            poltava.getPublisherYear(1828);
            System.out.println(poltava);

        System.out.println(poltava.hashCode() == poltava2.hashCode());
        System.out.println(poltava.equals(poltava2));
    }
}