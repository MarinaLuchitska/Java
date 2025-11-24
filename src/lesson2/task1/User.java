package lesson2.task1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
 private int id;
 private String name;
 private String username;
 private Address address;
 private Company company;

    public User(int id, String name, String username, String street, String city, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.address = new Address(street, city);
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", address=" + address +
                ", company=" + company +
                '}';
    }
}
