package org.example;

    public class Employee extends Main {
        int serviceNumber;
        String name;
        String phoneNumber;
        int workExperience;

        public Employee(int serviceNumber, String name, String phoneNumber, int workExperience) {
            this.serviceNumber = serviceNumber;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.workExperience = workExperience;
        }

        public int getServiceNumber() {
            return serviceNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public int getWorkExperience() {
            return workExperience;
        }

        @Override
        public String toString() {
            return "Табельный номер: " + serviceNumber + "; имя: " + name + "; номер телефона: " + phoneNumber + "; стаж: " + workExperience + ".\n";
        }
    }


