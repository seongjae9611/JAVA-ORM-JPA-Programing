package jpabook.jpashop.domain;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    private String createdBy;
    private String createddDate;
    private String modifiBy;
    private String modifiedDate;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreateddDate() {
        return createddDate;
    }

    public void setCreateddDate(String createddDate) {
        this.createddDate = createddDate;
    }

    public String getModifiBy() {
        return modifiBy;
    }

    public void setModifiBy(String modifiBy) {
        this.modifiBy = modifiBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
