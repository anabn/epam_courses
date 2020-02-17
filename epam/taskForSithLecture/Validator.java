package epam.taskForSithLecture;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Validator {

    public static boolean validThePercent(double percent){
        return (percent <= 100 && percent > 0);

    }

    public static boolean validAgeOfPublish(int age){
        return (age <= 2020 && age > 1000);
    }

    public static boolean verifyTheAuthorName(String author){
        Pattern pattern = Pattern.compile("^[A-Za-z]{2,20}");
        Matcher matcher = pattern.matcher(author);
        return matcher.matches();
    }

    public static boolean checkIfArrayIsEmpty(Book[] array){
        return (array.length == 0);
    }
}
