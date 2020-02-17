package epam.taskForSithLecture;

import java.util.Comparator;

public class MyComparatorByAuthor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String author1 = ((Book)o1).getAuthor();
        String author2 = ((Book)o2).getAuthor();
        return author1.compareTo(author2);
    }
}
