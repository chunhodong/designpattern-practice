package action_pattern.state.after;

import action_pattern.state.before.Student;

import java.util.ArrayList;
import java.util.List;


/**
 * 상태가 추가되면 addReview나 addStudent의코드가 바뀜
 */
public class OnlineCourse2 {


    private State state = new Draft(this);


    private List<String> reviews = new ArrayList<>();

    private List<Student2> students = new ArrayList<>();

    public void addReview(String review, Student2 student) {
        state.addReview(review,student);
    }

    public void addStudent(Student2 student) {
        state.addStudent(student);

    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public State getState() {
        return state;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student2> getStudents() {
        return students;
    }

    private boolean availableTo(Student2 student) {
        return student.isEnabledForPrivateClass(this);
    }


}
