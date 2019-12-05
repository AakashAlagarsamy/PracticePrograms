package TCS_Sem1.BookQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class BookSolution {
    public static int len = 0;

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = 4;
        int id;
        String title;
        String author;
        double price;
        Book b[] = new Book[n];
        for (int i = 0; i < n; i++) {
            id = S.nextInt();
            S.nextLine();
            title = S.nextLine().toLowerCase();
            author = S.nextLine();
            price = S.nextDouble();
            S.nextLine();
            b[i] = new Book(id, title, author, price);
        }
        String authorName = S.next();
        Book[] bb = searchTitle(b, authorName);
        int[] idResult = new int[n];
        for (int i = 0; i < len; i++) {
            idResult[i] = bb[i].getId();
            System.out.println(idResult[i]);
        }
        Arrays.sort(idResult);
        for (int i = 0; i < len; i++) {
            System.out.println(idResult[i]);
        }
    }

    private static Book[] searchTitle(Book[] b, String authorName) {

        for (Book book : b) {
            if (book.getAuthor().contains(authorName))
                len++;
        }

        Book[] bbb = new Book[len];

        for (int i=0;i<len;i++)
            if (b[i].getAuthor().contains(authorName))
                bbb[i] = b[i];

        return bbb;
    }
}



/*
Input:

1
Hello World
aaa author
50
2
World Cup
bbb author
100
3
Good Noon
ccc author
150
4
Best Friend
ddd author
200
world



Output:

1
2
 */