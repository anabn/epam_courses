package epam.taskForSithLecture;

import java.io.*;

class ReadAndWriteFromFile {
    private String pathToFile;

    public ReadAndWriteFromFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }


    Books readFromLocalFile(){
        File file = new File(pathToFile);
        Books tempBook = null;
        try {
            ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));
            tempBook = (Books)istream.readObject();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return tempBook;
     }

    void writeToLocalFile(Books books){
        File file = new File(pathToFile);
        try {
            ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(file));
            ostream.writeObject(books);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
