package net.javaguides.springboot.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "wallet_detail")
public class WalletDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "money")
	private double money;
	
	@Column(name = "user_name")
	private String userName;

	@Column(name = "create_date")
	private Date createDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
