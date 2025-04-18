package article.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
@CrossOrigin(origins = "http://localhost:3000") 
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/topic/{topic}")
    public List<Article> getArticleByTopic(@PathVariable String topic) {
    
        return articleService.getArticleByTopic(topic); 
    }
    
    @GetMapping("/userid/{userid}")
    public List<Article> getArticleByUserId(@PathVariable Long userid) {
    
        return articleService.getArticleByUserId(userid); 
    }
    

    @PostMapping
    public Article createArticle(@RequestBody Article article) {
        return articleService.createArticle(article);
    }
    
    @PutMapping("/{id}")
    public Article updateArticle(@PathVariable String id, @RequestBody Article article) {
        return articleService.updateArticle(id, article);
    }
}