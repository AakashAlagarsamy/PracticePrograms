package TCS_Test;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        int id,pages;
        String folderName, title;
        Document a[] = new Document[5];
        Scanner S = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            id = S.nextInt();
            title = S.nextLine();
            folderName = S.nextLine();
            pages = S.nextInt();
            a[i].setId(id);
            a[i].setTitle(title);
            a[i].setFolderName(folderName);
            a[i].setPages(pages);
        }
        combinedDocs(a[0], a[1], a[2], a[3], a[4]);
        System.out.println(a[4].getId());
        System.out.println(a[4].getTitle());
        System.out.println(a[4].getFolderName());
        System.out.println(a[4].getPages());
    }

    private static void combinedDocs(Document a, Document b, Document c, Document d, Document e) {
        int id = Math.max(a.getId(), Math.max(b.getId(), Math.max(c.getId(), d.getId()))) + 1;
        int pages = a.getPages() + b.getPages() + c.getPages() + d.getPages();
        String folderName = a.getFolderName() + "@" + b.getFolderName() + "@" + c.getFolderName() + "@" + d.getFolderName();
        String title = a.getTitle() + "#" + b.getTitle() + "#" + c.getTitle() + "#" + d.getTitle();
        e.setId(id);
        e.setFolderName(folderName);
        e.setPages(pages);
        e.setTitle(title);

    }
}


/*
1
hello
directory1
25
2
world
directory2
25
3
india
directory3
25
4
friends
directory4
25



 */