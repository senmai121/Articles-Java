package article.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.data.domain.Sort;

@Service
public class SkillService {

    @Autowired
    private SkillRepository repository;

    public List<Skill> getAll() {
        return repository.findAll();
    }
    
    public List<Skill> getAllOrderedByNameAsc() {
        return repository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    public Skill save(Skill skill) {
        return repository.save(skill);
    }

    public  Skill getById(String id) {
        return repository.findById(id).orElse(null);
    }
}
