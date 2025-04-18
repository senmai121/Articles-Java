package article.article;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAllByOrderByTopicDesc();
    }

    public List<Article> getArticleByTopic(String topic) {
        return articleRepository.findByTopic(topic);
    }

    public List<Article> getArticleByUserId(Long userid) {
        return articleRepository.findByUserid(userid);
    }
    
    
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }
    
    public Article updateArticle(String id, Article newArticle) {
        Optional<Article> existingArticle = articleRepository.findById(id);
        if (existingArticle.isPresent()) {
            Article article = existingArticle.get();
            article.setTopic(newArticle.getTopic());
            article.setDetail(newArticle.getDetail());
            article.setId(newArticle.getId());
            article.setUserId(newArticle.getUserId());
            return articleRepository.save(article);
        } else {
            throw new RuntimeException("Article not found!");
        }
    }
}