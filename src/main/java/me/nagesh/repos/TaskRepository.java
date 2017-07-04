package me.nagesh.repos;

import me.nagesh.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lakinep on 7/3/17.
 */
public interface TaskRepository extends JpaRepository<Task, Long>{
}
