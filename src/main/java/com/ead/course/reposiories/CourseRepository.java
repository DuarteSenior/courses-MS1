package com.ead.course.reposiories;

import com.ead.course.models.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<CourseModel, UUID> {
}
