package article.article;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "job_experience")
public class JobExperience {
    @Id
    private String id;
    private String position;
    private String company;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM yyyy")
    private Date start;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM yyyy")
    private Date end;
    private List<Skill> skills;
    private String description;

    // Getters & Setters
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "JobExperience{" +
                "id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", company='" + company + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", skills=" + skills +
                ", description='" + description + '\'' +
                '}';
    }
}
