import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class TimetableClass {

    private DayClass[] timetableArray = new DayClass [7];

    public TimetableClass () {
        // create variables to track the current lesson and day
        int day = 0;
        int lesson = -1;

        // create the file object to read the file with
        File timetableFile = new File ("tt.txt");

        // use a try catch block to prevent crashes if the file has errors or does not exist
        try  {
            // first create the scanner for the file - this opens the file
            Scanner fileReader = new Scanner(timetableFile);
            // set up to loop through the file
            while (fileReader.hasNextLine()) {
                // create a variable to hold the current line of text from the file
                String curLine = fileReader.nextLine();
                // create a scanner to break the text apart
                Scanner dataSplitter = new Scanner (curLine);
                dataSplitter.useDelimiter("/");
                String subject = dataSplitter.next();
                String teacher = dataSplitter.next();
                String venue = dataSplitter.next();

                // manage which day and lesson we are working with
                lesson ++;
                if (lesson > 5) {
                    lesson = 0;
                    day ++;
                }

                // create our lesson object
                timetableArray[day].addLesson(subject, teacher, venue, lesson);
            } // end of while loop
            fileReader.close();
        }
        // show the error message if a crash occurs
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error reading file. No data loaded.");
        }

    }//constructor
}
