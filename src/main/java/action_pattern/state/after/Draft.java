package action_pattern.state.after;

public class Draft implements State{

    private OnlineCourse2 onlineCourse;
    public Draft(OnlineCourse2 onlineCourse){
        this.onlineCourse = onlineCourse;
    }
    @Override
    public void addReview(String review, Student2 student) {
        throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");

    }

    @Override
    public void addStudent(Student2 student) {
        this.onlineCourse.getStudents().add(student);

    }


}
