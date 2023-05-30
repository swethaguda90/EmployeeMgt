package com.mastercard.service;

import com.mastercard.dto.request.EmployeeRequestDTO;
import com.mastercard.dto.response.EmployeeResponseDTO;
import com.mastercard.entity.EmployeeEntity;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<EmployeeEntity> getEmployeeById(Long employeeId);
    Optional<List<EmployeeEntity>> getAllEmployees();
    void saveEmployee(List<EmployeeRequestDTO> employeeRequestDTOList) throws ParseException;
    void updateEmployee(Long employeeId, EmployeeRequestDTO employeeRequestDTO) throws ParseException;
    void deleteEmployee(Long employeeId);
	Double getCostOfDept(Long deptId);
	Double getCostOfManger(Long managerID);
	Optional<List<EmployeeEntity>> getAllEmployeesByHierarchy(Long employeeId);
}
