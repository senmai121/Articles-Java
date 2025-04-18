package article.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
@CrossOrigin(origins = "http://localhost:3000") 

public class SkillController {

    @Autowired
    private SkillService service;

    @GetMapping
    public List<Skill> getAllJobs() {
        return service.getAllOrderedByNameAsc();
    }

    @PostMapping
    public Skill addSkill(@RequestBody Skill skill) {
        return service.save(skill);
    }

    @GetMapping("/{id}")
    public Skill getSkill(@PathVariable String id) {
        return service.getById(id);
    }
}