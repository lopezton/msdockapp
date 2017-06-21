/**
 * 
 */
package io.tonelope.tutorial.msdockapp.employeeservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.tonelope.tutorial.msdockapp.employeeservice.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
