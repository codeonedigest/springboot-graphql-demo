package cod.graphqldemo.bookdetails;

import java.util.Arrays;
import java.util.List;

public class AuthorContactDetails {
    private String id;
    private String email;
    private String mobile;
    private String address;

    public AuthorContactDetails(String id, String email, String mobile) {
        this.id = id;
        this.email = email;
        this.mobile = mobile;
    }

    private static List<AuthorContactDetails> contacts = Arrays.asList(
            new AuthorContactDetails("contact-1", "joanne@gmail.com", "9999999999"),
            new AuthorContactDetails("contact-2", "herman#yahoo.com", "8888888888"),
            new AuthorContactDetails("contact-3", "anne@hotmail.com", "7777777777")
    );

    public static AuthorContactDetails getById(String id) {
        return contacts.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }
}
