package action_pattern.state.after;

public class Published implements State{

    private OnlineCourse2 onlineCourse;
    public Published(OnlineCourse2 onlineCourse){
        this.onlineCourse = onlineCourse;
    }
    @Override
    public void addReview(String review, Student2 student) {
        this.onlineCourse.getReviews().add(review);

    }

    @Override
    public void addStudent(Student2 student) {
        this.onlineCourse.getStudents().add(student);

    }

}
