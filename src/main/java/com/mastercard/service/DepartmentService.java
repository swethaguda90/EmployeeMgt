package com.mastercard.service;

import com.mastercard.dto.request.DepartmentRequestDTO;
import com.mastercard.dto.response.DepartmentResponseDTO;
import com.mastercard.dto.response.EmployeeResponseDTO;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Optional<List<DepartmentResponseDTO>> getAllDepartments();
    Optional<DepartmentResponseDTO> getDepartmentByName(String departmentName);
    void saveDepartment(DepartmentRequestDTO departmentRequestDTO);
    void updateDepartment(Long departmentId, DepartmentRequestDTO departmentRequestDTO);
    void deleteDepartment(Long departmentId);
}
