package com.example.demo;

import com.example.demo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "is required")
    // Notnull là chưa đủ để ngăn chặn việc khoảng trắng  nên cần thêm @Size
    @Size(min = 1, message = "is required")
    private String lastName = "";
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10, message = "must be greater than or equal to 10")

    private Integer freePases;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;
    // Khi mình tự tạo annotation mình có thể tuỳ chỉnh kiểu điều kiện mình muốn
    @CourseCode(value = "TOPS", message = " must start with TOPS")
    private String courseCode;

    public Customer(String firstName, String lastName, Integer freePases, String postalCode, String courseCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freePases = freePases;
        this.postalCode = postalCode;
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Customer() {
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getFreePases() {
        return freePases;
    }

    public void setFreePases(Integer freePases) {
        this.freePases = freePases;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", freePases=" + freePases +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
