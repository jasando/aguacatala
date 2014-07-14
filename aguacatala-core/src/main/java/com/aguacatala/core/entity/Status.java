package com.aguacatala.core.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the status database table.
 * 
 */
@Entity
@NamedQuery(name="Status.findAll", query="SELECT s FROM Status s")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STATUS_ID_GENERATOR", sequenceName="STATUS_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STATUS_ID_GENERATOR")
	private Integer id;

	private String description;

	private String name;

	//bi-directional many-to-one association to Campaign
	@OneToMany(mappedBy="statusBean")
	private List<Campaign> campaigns;

	//bi-directional many-to-one association to Mail
	@OneToMany(mappedBy="statusBean")
	private List<Mail> mails;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="statusBean")
	private List<User> users;

	public Status() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Campaign> getCampaigns() {
		return this.campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

	public Campaign addCampaign(Campaign campaign) {
		getCampaigns().add(campaign);
		campaign.setStatusBean(this);

		return campaign;
	}

	public Campaign removeCampaign(Campaign campaign) {
		getCampaigns().remove(campaign);
		campaign.setStatusBean(null);

		return campaign;
	}

	public List<Mail> getMails() {
		return this.mails;
	}

	public void setMails(List<Mail> mails) {
		this.mails = mails;
	}

	public Mail addMail(Mail mail) {
		getMails().add(mail);
		mail.setStatusBean(this);

		return mail;
	}

	public Mail removeMail(Mail mail) {
		getMails().remove(mail);
		mail.setStatusBean(null);

		return mail;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setStatusBean(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setStatusBean(null);

		return user;
	}

}