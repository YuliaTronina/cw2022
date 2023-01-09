package ru.student.cw2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.student.cw2022.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName (String name);
}
