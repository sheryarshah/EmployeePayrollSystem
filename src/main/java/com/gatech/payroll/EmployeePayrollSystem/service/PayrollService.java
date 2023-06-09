package com.gatech.payroll.EmployeePayrollSystem.service;

import com.gatech.payroll.EmployeePayrollSystem.model.Payroll;
import com.gatech.payroll.EmployeePayrollSystem.respository.PayrollRepository;

import java.util.List;

public interface PayrollService {

    List<Payroll> getAllPayrolls();

    Payroll getPayrollByEmployeeIdAndPayPeriod(Long employeeId, String payPeriod);

    List<Payroll> getPayrollByEmployeeId(Long employeeId);

    Payroll addPayroll(Long employeeId, Payroll payroll);

    Payroll updatePayroll(Long payrollId, Payroll payrollDetails);
}
