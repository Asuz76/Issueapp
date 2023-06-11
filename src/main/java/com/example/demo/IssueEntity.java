package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IssueEntity {
    private long id;
    private String title;
    private String content;
    private String period;
    private char importance;
    
	public IssueEntity(long id, String title, String content, String period, char importance) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.period = period;
		this.importance = importance;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public char getImportance() {
		return importance;
	}
	public void setImportance(char importance) {
		this.importance = importance;
	}
    
    
}