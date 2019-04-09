package crushstudio.crush_studio.entity;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = " is_deleted", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }


    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
