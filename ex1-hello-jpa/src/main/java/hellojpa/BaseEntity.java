package hellojpa;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    private String createdBy;
    private LocalDateTime createdDate;
    private String lastModifiBy;
    private LocalDateTime lastModifiDate;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiBy() {
        return lastModifiBy;
    }

    public void setLastModifiBy(String lastModifiBy) {
        this.lastModifiBy = lastModifiBy;
    }

    public LocalDateTime getLastModifiDate() {
        return lastModifiDate;
    }

    public void setLastModifiDate(LocalDateTime lastModifiDate) {
        this.lastModifiDate = lastModifiDate;
    }
}
