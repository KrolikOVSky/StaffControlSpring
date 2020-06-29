package com.staff.staff.repo;

import com.staff.staff.models.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Long> {
}
