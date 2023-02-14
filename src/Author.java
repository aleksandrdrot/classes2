import java.util.Objects;

public class Author {
    private String lastName;
    private String firstName;
    private String middleName;

    public Author(String lastName, String firstName, String middleName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(lastName, author.lastName) && Objects.equals(firstName, author.firstName) && Objects.equals(middleName, author.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName);
    }
}
