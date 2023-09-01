package cod.graphqldemo.bookdetails;

import java.util.Arrays;
import java.util.List;

public class Author {
    private String id;
    private String firstName;
    private String lastName;
    private String contactId;
    private int age;

    public Author(String id, String firstName, String lastName, String contactId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactId = contactId;
    }

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joanne", "Rowling", "contact-1"),
            new Author("author-2", "Herman", "Melville", "contact-2"),
            new Author("author-3", "Anne", "Rice", "contact-3")
    );

    public static Author getById(String id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getContactId() {
        return contactId;
    }
}
