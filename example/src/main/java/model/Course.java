package model;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    private Long id;
    private String courseTitle;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }


    public void setId(Long id) {
        this.id = id;
    }

    private String courseCode;


}