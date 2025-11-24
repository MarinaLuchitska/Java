package lesson1.task2;

import java.util.List;

public class Start {
  public static void main(String[] args){
      Comment comment1 = new Comment();
      comment1.setId(1);
      comment1.setName("id labore ex et quam laborum");
      comment1.setEmail("Eliseo@gardner.biz");
      comment1.setBody(
              "laudantium enim quasi est quidem magnam voluptate ipsam eos\n" +
                      "tempora quo necessitatibus\n" +
                      "dolor quam autem quasi\n" +
                      "reiciendis et nam sapiente accusantium"
      );

      Comment comment2 = new Comment();
      comment2.setId(2);
      comment2.setName("quo vero reiciendis velit similique earum");
      comment2.setEmail("Jayne_Kuhic@sydney.com");
      comment2.setBody(
              "est natus enim nihil est dolore omnis voluptatem numquam\n" +
                      "et omnis occaecati quod ullam at\n" +
                      "voluptatem error expedita pariatur\n" +
                      "nihil sint nostrum voluptatem reiciendis et"
      );

      Comment comment3 = new Comment();
      comment3.setId(3);
      comment3.setName("odio adipisci rerum aut animi");
      comment3.setEmail("Nikita@garfield.biz");
      comment3.setBody(
              "quia molestiae reprehenderit quasi aspernatur\n" +
                      "aut expedita occaecati aliquam eveniet laudantium\n" +
                      "omnis quibusdam delectus saepe quia accusamus maiores nam est\n" +
                      "cum et ducimus et vero voluptates excepturi deleniti ratione"
      );

      Comment comment4 = new Comment();
      comment4.setId(4);
      comment4.setName("alias odio sit");
      comment4.setEmail("Lew@alysha.tv");
      comment4.setBody(
              "non et atque\n" +
                      "occaecati deserunt quas accusantium unde odit nobis qui voluptatem\n" +
                      "quia voluptas consequuntur itaque dolor\n" +
                      "et qui rerum deleniti ut occaecati"
      );

      Comment comment5 = new Comment();
      comment5.setId(5);
      comment5.setName("vero eaque aliquid doloribus et culpa");
      comment5.setEmail("Hayden@althea.biz");
      comment5.setBody(
              "harum non quasi et ratione\n" +
                      "tempore iure ex voluptates in ratione\n" +
                      "harum architecto fugit inventore cupiditate\n" +
                      "voluptates magni quo et"
      );



      List<Comment> commentList = List.of(comment1,comment2,comment3,comment4,comment5);
      for (Comment comment : commentList) {
          System.out.println(comment);

      }




  }

}
