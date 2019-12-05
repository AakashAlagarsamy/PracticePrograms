package TCS_Sem1.BookProblem;

import java.util.Scanner;

//public class Solution {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Books[] b = new Books[4];
//
//        for (int i = 0; i < 4; i++) {
//            String title = scanner.nextLine();
//            int id = scanner.nextInt();
//            int pages = scanner.nextInt();;
//            String author = scanner.nextLine();
//            b[i] = new Books(title, id, pages, author);
//            System.out.println(b[i].toString());
//        }
//        Books result = combineBooks(b);
//        System.out.println(result.toString());
//    }
//
//    private static Books combineBooks(Books[] b) {
//        Books res = new Books();
//        res.setId(b[0].getId() + b[1].getId() + b[2].getId() + b[3].getId() + 1);
//        res.setPages(b[0].getPages() + b[1].getPages() + b[2].getPages() + b[3].getPages());
//        res.setTitle(b[0].getTitle() + "#" + b[1].getTitle() + "#" + b[2].getTitle() + "#" + b[3].getTitle());
//        res.setAuthor(b[0].getAuthor() + "@" + b[1].getAuthor() + "@" + b[2].getAuthor() + "@" + b[3].getAuthor());
//        return res;
//    }
//
//}
public class BSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 4;
        Books[] books = new Books[n];
        for (int i = 0; i < n; i++)
            books[i] = new Books(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next());
        Books combinedBooks = getCombinedBooks(books);
        System.out.println(combinedBooks.toString());
    }

    private static Books getCombinedBooks(Books[] books) {

        StringBuilder title = new StringBuilder(), author = new StringBuilder();
        int id = 0, pages = 0, n = books.length;

        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                title.append(books[i].getTitle()).append("#");
                author.append(books[i].getAuthor()).append("@");
            } else {
                title.append(books[i].getTitle());
                author.append(books[i].getTitle());
            }
            if (id < books[i].getId()) id = books[i].getId();
            pages += books[i].getPages();
        }

        return new Books(title.toString(), pages, id + 1, author.toString());
    }

}
/*
aaa
20
1
AAA
bbb
30
2
BBB
ccc
40
3
CCC
ddd
50
4
DDD

 */