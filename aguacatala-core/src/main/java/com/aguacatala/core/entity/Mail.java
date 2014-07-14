package com.aguacatala.core.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mail database table.
 * 
 */
@Entity
@NamedQuery(name="Mail.findAll", query="SELECT m FROM Mail m")
public class Mail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MAIL_ID_GENERATOR", sequenceName="MAIL_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MAIL_ID_GENERATOR")
	private Integer id;

	private String description;

	private String from;

	@Column(name="name_msg")
	private String nameMsg;

	private String subject;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status")
	private Status statusBean;

	public Mail() {
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

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getNameMsg() {
		return this.nameMsg;
	}

	public void setNameMsg(String nameMsg) {
		this.nameMsg = nameMsg;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Status getStatusBean() {
		return this.statusBean;
	}

	public void setStatusBean(Status statusBean) {
		this.statusBean = statusBean;
	}

}