package com.greytip.imdb.employee.repository;

import com.greytip.imdb.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

//    @Query( value = "SELECT * FROM Employee")
//    List<Employee> getAllEmployees();

//    @Query( value = "INSERT INTO employee (emp_name , email, phone,dept_id, desg_id ) values (:name, :email, :phone, :dept_id, :desg_id ) returning * ", nativeQuery = true )
//    Employee addNewEmployee(
//            @Param("name") String name,
//            @Param("email") String email,
//            @Param("phone") Long phone,
//            @Param("dept_id") Integer deptId,
//            @Param("desg_id") Integer desgId
//    );
//
//    @Query( value = "DELETE FROM akshata_demo.employee where emp_id = :id returning *", nativeQuery = true )
//    Employee removeEmployee(@Param("id") Integer id);
//
//    @Query( value = "UPDATE akshata_demo.employee SET emp_name = :name , email = :email, phone = :phone, dept_id = :dept_id, desg_id = :desg_id WHERE emp_id = :id returning *", nativeQuery = true)
//    Employee updateEmployee(
//            @Param("id") Integer id,
//            @Param("name") String name,
//            @Param("email") String email,
//            @Param("phone") Long phone,
//            @Param("dept_id") Integer deptId,
//            @Param("desg_id") Integer desgId
//    );

    public Optional<Employee> findByName(String name);

}
