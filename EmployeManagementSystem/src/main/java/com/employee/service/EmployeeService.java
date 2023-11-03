package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public class EmployeeService {
	
	private static List<Employee> employeeList = new ArrayList<>();

	
	public EmployeeService() {

		employeeList.add(new Employee( 1, "Shrutika",36546));
		employeeList.add(new Employee(2, "Pavan", 8764));
		employeeList.add(new Employee(3, "Om",54689));
		employeeList.add(new Employee(51, "Moble",6785643));
	
	}

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeList.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateEmployee(Employee updatedEmployee) {
        employeeList.replaceAll(employee -> {
            if (employee.getId() == updatedEmployee.getId()) {
                return updatedEmployee;
            }
            return employee;
        });
    }

    public void deleteEmployee(int id) {
        employeeList.removeIf(employee -> employee.getId() == id);
    }
}


