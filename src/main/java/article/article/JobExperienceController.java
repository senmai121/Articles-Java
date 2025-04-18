package article.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "http://localhost:3000") 

public class JobExperienceController {

    @Autowired
    private JobExperienceService service;

    @GetMapping
    public List<JobExperience> getAllJobs() {
        return service.getAllOrderedByStartDesc();
    }

    @PostMapping
    public JobExperience addJob(@RequestBody JobExperience jobExperience) {
        return service.save(jobExperience);
    }

    @GetMapping("/{id}")
    public JobExperience getJob(@PathVariable String id) {
        return service.getById(id);
    }
}