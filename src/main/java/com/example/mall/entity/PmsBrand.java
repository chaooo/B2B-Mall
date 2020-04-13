package com.example.mall.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * pms_brand
 * @author 
 */
@Data
public class PmsBrand implements Serializable {
    private Long id;

    private String name;

    /**
     * 首字母
     */
    private String first_letter;

    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    private Integer factory_status;

    private Integer show_status;

    /**
     * 产品数量
     */
    private Integer product_count;

    /**
     * 产品评论数量
     */
    private Integer product_comment_count;

    /**
     * 品牌logo
     */
    private String logo;

    /**
     * 专区大图
     */
    private String big_pic;

    /**
     * 品牌故事
     */
    private String brand_story;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PmsBrand other = (PmsBrand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFirst_letter() == null ? other.getFirst_letter() == null : this.getFirst_letter().equals(other.getFirst_letter()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getFactory_status() == null ? other.getFactory_status() == null : this.getFactory_status().equals(other.getFactory_status()))
            && (this.getShow_status() == null ? other.getShow_status() == null : this.getShow_status().equals(other.getShow_status()))
            && (this.getProduct_count() == null ? other.getProduct_count() == null : this.getProduct_count().equals(other.getProduct_count()))
            && (this.getProduct_comment_count() == null ? other.getProduct_comment_count() == null : this.getProduct_comment_count().equals(other.getProduct_comment_count()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getBig_pic() == null ? other.getBig_pic() == null : this.getBig_pic().equals(other.getBig_pic()))
            && (this.getBrand_story() == null ? other.getBrand_story() == null : this.getBrand_story().equals(other.getBrand_story()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFirst_letter() == null) ? 0 : getFirst_letter().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getFactory_status() == null) ? 0 : getFactory_status().hashCode());
        result = prime * result + ((getShow_status() == null) ? 0 : getShow_status().hashCode());
        result = prime * result + ((getProduct_count() == null) ? 0 : getProduct_count().hashCode());
        result = prime * result + ((getProduct_comment_count() == null) ? 0 : getProduct_comment_count().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getBig_pic() == null) ? 0 : getBig_pic().hashCode());
        result = prime * result + ((getBrand_story() == null) ? 0 : getBrand_story().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", first_letter=").append(first_letter);
        sb.append(", sort=").append(sort);
        sb.append(", factory_status=").append(factory_status);
        sb.append(", show_status=").append(show_status);
        sb.append(", product_count=").append(product_count);
        sb.append(", product_comment_count=").append(product_comment_count);
        sb.append(", logo=").append(logo);
        sb.append(", big_pic=").append(big_pic);
        sb.append(", brand_story=").append(brand_story);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}