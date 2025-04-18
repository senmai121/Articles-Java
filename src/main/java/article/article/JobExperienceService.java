package article.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.data.domain.Sort;

@Service
public class JobExperienceService {

    @Autowired
    private JobExperienceRepository repository;

    public List<JobExperience> getAll() {
        return repository.findAll();
    }
    
    public List<JobExperience> getAllOrderedByStartDesc() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "start"));
    }

    public JobExperience save(JobExperience jobExperience) {
        return repository.save(jobExperience);
    }

    public JobExperience getById(String id) {
        return repository.findById(id).orElse(null);
    }
}
