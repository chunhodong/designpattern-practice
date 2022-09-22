package action_pattern.state.after;

import action_pattern.state.before.OnlineCourse;

import java.util.ArrayList;
import java.util.List;

public class Student2 {

    private String name;

    public Student2(String name) {
        this.name = name;
    }

    private List<OnlineCourse2> privateCourses = new ArrayList<>();

    public boolean isEnabledForPrivateClass(OnlineCourse2 onlineCourse) {
        return privateCourses.contains(onlineCourse);
    }

    public void addPrivateCourse(OnlineCourse2 onlineCourse) {
        this.privateCourses.add(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
