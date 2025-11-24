package lesson2.task4;
//Ознайомитись з наступними ендпоінтами, зробити під їх об’єкти класи.
//
//Створити об’єкти (можна взяти дані з апі)
//
//Запакувати всі пости в список, всі коментарі – у свій окремий список
//
//        Проітерувати списки, і додати коментар з відповідним ід до відповідного поста
//
//        – https://jsonplaceholder.typicode.com/posts
//
//        – https://jsonplaceholder.typicode.com/comments
//
//Вивести результат – список постів з доданими до них коментарями

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "Post one title", "Post one body"));
        posts.add(new Post(1, 2, "Post two title", "Post two body" ));


        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "Commenter A", "a@mail.com", "First comment to post 1"));
        comments.add(new Comment(1, 2, "Commenter B", "b@mail.com", "Second comment to post 1"));
        comments.add(new Comment(2, 3, "Commenter C", "c@mail.com", "First comment to post 2"));


        for (Post post : posts) {
            for (Comment comment : comments) {
                if (comment.getPostId() == post.getId()) {
                    post.getComments().add(comment);
                }
            }
        }
        System.out.println(posts);
    }
}
