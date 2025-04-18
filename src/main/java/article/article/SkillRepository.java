package article.article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository extends MongoRepository<Skill, String> {
    // custom queries ถ้าต้องการเพิ่ม
}