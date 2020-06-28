package com.staff.staff.repo;

import com.staff.staff.models.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepo extends CrudRepository<Staff, Long> {
}
