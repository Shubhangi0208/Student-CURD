package com.ezio.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ezio.Entity.Student;

public interface StudentRespository extends JpaRepository<Student, Long> {

}
