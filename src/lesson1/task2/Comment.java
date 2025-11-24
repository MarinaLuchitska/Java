package lesson1.task2;

public class Comment {
    private int id;
    private String name;
    private String email;
    private String body;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", title='" + name + '\'' +
                ", title='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
