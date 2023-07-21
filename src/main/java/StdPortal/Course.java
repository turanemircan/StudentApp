package StdPortal;

public class Course {

    private String  lessonId;
    private String lessonName;
    private int price;


    public Course() {
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lessonId='" + lessonId + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", price=" + price +
                '}';
    }
}
