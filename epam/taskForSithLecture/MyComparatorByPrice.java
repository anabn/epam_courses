package epam.taskForSithLecture;

import java.util.Comparator;

public class MyComparatorByPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Double pub1 = ((Book)o1).getPrice();
        Double pub2 = ((Book)o2).getPrice();
        return pub2.compareTo(pub1);
    }
}
