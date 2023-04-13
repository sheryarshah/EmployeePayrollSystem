package com.gatech.payroll.EmployeePayrollSystem.respository;

import com.gatech.payroll.EmployeePayrollSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
