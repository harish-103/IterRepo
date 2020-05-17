package com.spring.entity;

import javax.persistence.*;
@Entity
@Table(name="ADVERTISE_MASTER")
public class AdvertiseEntity
{
	@Id
	@GeneratedValue
	@Column(name="ID")
	private long id;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Category")
	private String category;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Post_id")
	private String postId;
	
	@Column(name="Status")
	private String status;
 
	@Column(name="SEARCH_TEXT")
	private String searchText;
		
	public AdvertiseEntity()
	{
		super();
	}
	
	public AdvertiseEntity( String title, String name, String category, String description, String postId,
			String status , String searchText) 
	{
		super();
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.status = status; 
		this.searchText = searchText;
	}
	public AdvertiseEntity( String title, String name, String category, String description) 
	{
		super();
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
	}
	public AdvertiseEntity( String title, String name, String category, String description, String postId) 
	{
		super();
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
	}
	public AdvertiseEntity( String title, String name, String category, String description, String postId,
			String status) 
	{
		super();
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.status = status;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostid() {
		return postId;
	}

	public void setPostid(String postId) {
		this.postId = postId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
 

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}


	@Override
	public String toString() {
		return "AdvertiseEntity [id=" + id + ", title=" + title + ", name=" + name + ", category=" + category
				+ ", description=" + description + ", postId=" + postId + ", status=" + status + ", searchText="
				+ searchText + "]";
	}
	
 
}
