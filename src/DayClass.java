import javax.swing.*;

public class DayClass {
    private LessonClass [] lessonList  = new LessonClass [6];

    /**
     * Adds a lesson to the array in the position indicates by lessonNo
     * the teacher, subject and venue come in as parameters
     * @param s Subject name
     * @param t Teacher name
     * @param v Venue name
     * @param lessonNo position in the array to add the lesson to
     */
    public void addLesson (String s, String t, String v, int lessonNo) {
        // check that lessonNo is in range
        if (lessonNo <0 || lessonNo > 5) {
            JOptionPane.showMessageDialog(null, "Cannot add lesson - lesson no is too big or too small");
        }
        else {
            // add lesson
            lessonList [lessonNo] = new LessonClass(s, t, v);
        }
    }// end of addLesson method

    /**
     * Method to display ONE lesson
     * @param lessonNo - integer; tells us what lesson to display
     * @return
     */
    public String displayLesson (int lessonNo) {
        if (lessonNo < 0 || lessonNo > 5) {
            return "No such lesson number - unable to display.";
        }
        else {
            return lessonList[lessonNo].getLessonDetails();
        }
    } // end of displayLesson

    /**
     * Searches the array for a lesson with a specific subject name. NAMES MUST BE A COMPLETE MATCH
     * @param lessonName - String of the subject name being looked for.
     * @return -1 if subject is not found otherwise the position of the LAST venue in the array
     */
    public int findLessonBySubject (String lessonName) {
        int lessonNo = -1;
        for (int index = 0; index < 6; index++) {
            if (lessonList[index].getSubject().matches(lessonName)) {
                lessonNo = index;
            } // end of if
        } // end of for
        return lessonNo;
    } // end of findLessonBySubject

    /**
     * Searches the array for a lesson in a specific venue. NAMES MUST BE A COMPLETE MATCH
     * @param venueName - String of the venue name being looked for.
     * @return -1 if venue is not found otherwise the position of the LAST venue in the array
     */
    public int findLessonByVenue (String venueName) {
        int lessonNo = -1;
        for (int index = 0; index < 6; index++) {
            if (lessonList[index].getVenue().matches(venueName)) {
                lessonNo = index;
            } // end of if
        } // end of for
        return lessonNo;
    } // end of findLessonbyVenue

    /**
     * Searches the array for a lesson with a specific teacher. NAMES MUST BE A COMPLETE MATCH
     * @param teacherName - String of the teacher name being looked for.
     * @return -1 if teacher is not found otherwise the position of the LAST venue in the array
     */
    public int findLessonByTeacher (String teacherName) {
        int lessonNo = -1;
        for (int index = 0; index < 6; index++) {
            if (lessonList[index].getTeacher().matches(teacherName)) {
                lessonNo = index;
            } // end of if
        } // end of for
        return lessonNo;
    } // end of findLessonByTeacher
}
