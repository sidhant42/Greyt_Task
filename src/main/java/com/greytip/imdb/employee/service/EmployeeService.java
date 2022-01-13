package com.greytip.imdb.employee.service;

import com.greytip.imdb.employee.model.Employee;
import com.greytip.imdb.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployees() {

         return employeeRepository.findAll();

    }

    public Employee addNewEmployee(Employee newEmployee) {
        return employeeRepository.save(newEmployee);
//         return employeeRepository.addNewEmployee(
//                newEmployee.getName(),
//                newEmployee.getEmail(),
//                newEmployee.getPhone(),
//                newEmployee.getDeptId(),
//                newEmployee.getDesgId()
//        );
    }

    public void removeEmployee(Integer id) {

        employeeRepository.deleteById(id);

//        return null;
    }

    public Employee updateEmployee( Employee employee) {

        Optional<Employee> maybeEmployee = employeeRepository.findById(employee.getId());
        if (maybeEmployee.isPresent())
        {
            Employee existingEmployee = maybeEmployee.get();
            existingEmployee.setName(employee.getName());
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setPhone(employee.getPhone());
            existingEmployee.setDeptId(employee.getDeptId());
            existingEmployee.setDesgId(employee.getDesgId());
            employeeRepository.save(existingEmployee);
            return existingEmployee;
        }
        else {
            throw new RuntimeException("Employee not found");
        }


//        return;
//        (
//                employee.getId(),
//                employee.getName(),
//                employee.getEmail(),
//                employee.getPhone(),
//                employee.getDeptId(),
//                employee.getDesgId()
//        );
    }

    public Employee getEmployee(String name) {

        Optional<Employee> employee = employeeRepository.findByName(name);
        return employee.get();

    }
}
