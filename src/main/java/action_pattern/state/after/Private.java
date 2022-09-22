package action_pattern.state.after;

public class Private implements State{

    private OnlineCourse2 onlineCourse;
    public Private(OnlineCourse2 onlineCourse){
        this.onlineCourse = onlineCourse;
    }
    @Override
    public void addReview(String review, Student2 student) {
        if(this.onlineCourse.getStudents().contains(student)){
            this.onlineCourse.getReviews().add(review);
        }
        else
            throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");

    }
    @Override
    public void addStudent(Student2 student) {
        if(student.isEnabledForPrivateClass(onlineCourse)){
            this.onlineCourse.getStudents().add(student);
        }
        else
            throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");


    }

}
