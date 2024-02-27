package main.java.com.example.springapp.model;

import java.lang.annotation.Inherited;

/**
 * Product
 */
@Entity
public class Product {
    @Id
int employeeId;
String employeeName;
String employeeEmail;
double salary;
String department;
public int getEmployeeId() {
    return employeeId;
}
public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}
public String getEmployeeName() {
    return employeeName;
}
public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
}
public String getEmployeeEmail() {
    return employeeEmail;
}
public void setEmployeeEmail(String employeeEmail) {
    this.employeeEmail = employeeEmail;
}
public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
    this.salary = salary;
}
public String getDepartment() {
    return department;
}
public void setDepartment(String department) {
    this.department = department;
}

}