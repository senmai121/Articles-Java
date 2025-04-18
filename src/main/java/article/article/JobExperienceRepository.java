package article.article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobExperienceRepository extends MongoRepository<JobExperience, String> {
    // custom queries ถ้าต้องการเพิ่ม
}