package epam.taskForSithLecture;

import java.util.Comparator;

public class MyComparatorByPublished implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String pub1 = ((Book)o1).getPublished();
        String pub2 = ((Book)o2).getPublished();
        return pub1.compareTo(pub2);
    }
}
