package article.article;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "article") // กำหนดให้แมปกับ collection ชื่อ users

public class Article {
	@Id
    private String id;
    private String topic;
    private String detail;
    
    private  Long userid;

    // Constructors
    public Article() {}

    public Article(String topic, Long userid) {
        this.topic = topic;
        this.userid = userid;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getUserId() {
        return userid;
    }

    public void setUserId(Long userid) {
        this.userid = userid;
    }

}
