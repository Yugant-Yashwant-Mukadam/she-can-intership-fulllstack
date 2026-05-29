package internship.fullstack.shecan.repository;

import internship.fullstack.shecan.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface formrepo extends JpaRepository<Form,Long> {
}
