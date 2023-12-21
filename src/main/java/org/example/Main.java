package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(new Employee(1, "Шиловская Елена Викторовна", "89158542123", 5));
        directory.addEmployee(new Employee(2, "Дмитриев Игорь Александрович", "89151238796", 3));
        directory.addEmployee(new Employee(3, "Разумовский Евгений Сергеевич", "89165142233", 2));
        directory.addEmployee(new Employee(4, "Наумова Ольга Михайловна", "89264726566", 5));
        directory.addEmployee(new Employee(5, "Мишин Андрей Иванович", "89101513244", 4));
        System.out.println("\nСправочник сотрудников: ");
        System.out.println(directory.directory);

        System.out.println("\nДобавляем нового сотрудника в справочник");
        System.out.println(directory.addEmployee(new Employee(6, "Никитин Олег Ефимович", "89265412289", 2)));

        System.out.println("\nПоиск сотрудника по табельному номеру");
        System.out.println(directory.searchByServiceNumber(3).toString());

        System.out.println("\nПоиск сотрудника по стажу");
        System.out.println(directory.searchByWorkExperience(5).toString());

        System.out.println("\nВозвращаем номер телефона сотрудника по его имени");
        System.out.println(directory.searchPhoneNumber("Мишин Андрей Иванович"));
        }
}