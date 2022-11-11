package com.example.easylogin.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	//このクラスはMySQLで作成したuserテーブルの実体（エンティティ）
	
	//フィールド｜テーブルuserのカラム
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;//id
	
	@Column(name="user_name")
	private String userName;//ユーザー名
	
	@Column(name="password")
	private String password;//パスワード
	
	@Column(name="full_name")
	private String fullName;//氏名
	
	//メソッド｜各フィールドを開示・格納
	public long getId( ) {
		return id;
	}	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
