package com.example.demo;

import lombok.Data;

@Data
public class IssueForm {
    private String title;
    private String content;
    private String period;
    private char importance;
    
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