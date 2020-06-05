package com.telusko.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int article_id;
    String title;
    String Category;
    String Description;
    String image_link;
    Timestamp start_time;
    Timestamp end_time;
    String official_link;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImage_link() {
		return image_link;
	}
	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}
	public Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}
	public Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}
	public String getOfficial_link() {
		return official_link;
	}
	public void setOfficial_link(String official_link) {
		this.official_link = official_link;
	}
	@Override
	public String toString() {
		return "Article [article_id=" + article_id + ", title=" + title + ", Category=" + Category + ", Description="
				+ Description + ", image_link=" + image_link + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", official_link=" + official_link + "]";
	}
    
    

}
