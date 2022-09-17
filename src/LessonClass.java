
public class LessonClass {

    private String subject;
    private String teacher;
    private String venue;

    /**
     * Initialises all fields to the parameters sent.
     * @param s Subject - a string
     * @param t Teacher - a string
     * @param v Venue - a string
     */
    public LessonClass (String s, String t, String v) {
        setSubject(s);
        setTeacher(t);
        setVenue(v);
    } // end of constructor

    /**
     *A method to return the details of a lesson
     * @return The values of the attributes as one string separated by new line chars.
     */
    public String getLessonDetails () {
        return subject + "\n" + teacher +"\n" + venue;
    }

    public String getSubject () {
        return subject;
    }

    public String getTeacher () {
        return teacher;
    }

    public String getVenue () {
        return venue;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
} // end of class
