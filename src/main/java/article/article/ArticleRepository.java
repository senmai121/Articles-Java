package article.article;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends MongoRepository<Article, Long> {
    List<Article> findByTopic(String topic); // ค้นหาผู้ใช้ตามชื่อ
    
    List<Article> findByUserid(Long userid); // ค้นหาผู้ใช้ตามชื่อ
    
    Optional<Article> findById(String id); 
    
    List<Article> findAllByOrderByTopicDesc();
    
    
}