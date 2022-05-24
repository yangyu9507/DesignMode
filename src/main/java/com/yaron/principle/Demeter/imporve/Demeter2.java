package com.yaron.principle.Demeter.imporve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class Demeter2 {

    public static void main(String[] args) {
        System.out.println("使用Demeter.....");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 学校总部员工类
 */
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学院员工类
 */
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {

    public List<CollegeEmployee> getAllEmplyee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }

        return list;
    }

    void printAllEmployee(){
        List<CollegeEmployee> list1 = this.getAllEmplyee();
        System.out.println("---------------------------------学院员工---------------------------------");
        list1.forEach(item -> System.out.println(item.getId()));

    }


}

class SchoolManager {
    public List<Employee> getAllEmployee() {

        List<Employee> list = new ArrayList<>();
        for (int i = 0 ; i < 5; i++){
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }

        return list;
    }

    void printAllEmployee(CollegeManager sub){
        sub.printAllEmployee();

        List<Employee> allEmployee = this.getAllEmployee();
        System.out.println("---------------------------------学校总部员工---------------------------------");
        allEmployee.forEach(item -> System.out.println(item.getId()));
    }
}
















