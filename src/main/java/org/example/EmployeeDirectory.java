package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    List<Employee> directory = new ArrayList<>();
    // метод для добавления нового сотрудника в справочник
    public List<Employee> addEmployee(Employee employee) {
        directory.add(employee);
        return this.directory.stream().toList();
    }

    // метод для поиска сотрудника по табельному номеру
    public List<Employee> searchByServiceNumber(int serviceNumber) {
        return this.directory.stream().filter(employee -> employee.getServiceNumber() == serviceNumber).toList();
    }

    // метод для поиска сотрудника по стажу
    public List<Employee> searchByWorkExperience(int workExperience){
        return this.directory.stream().filter(employee -> employee.getWorkExperience() == workExperience).toList();
    }

    // метод, который возвращает номер телефона сотрудника по имени
    public List<String> searchPhoneNumber(String name){
        List<String> result = new ArrayList<>();
        this.directory.forEach(employee -> {
            if (employee.getName().equals(name)){
                result.add(employee.getPhoneNumber());
            }
        });
        return result;
    }
}

