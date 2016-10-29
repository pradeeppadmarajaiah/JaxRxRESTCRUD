package com.inflight.rest.InflightRest.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * @author pradeep
 *
 */
@XmlRootElement
public class RedLight {

	private long id;
	private long senderId;
	private long receiverId;
	private String confDesc;
	private Date created;

	public RedLight() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public final long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the senderId
	 */
	public final long getSenderId() {
		return senderId;
	}

	/**
	 * @param senderId
	 *            the senderId to set
	 */
	public final void setSenderId(long senderId) {
		this.senderId = senderId;
	}

	/**
	 * @return the receiverId
	 */
	public final long getReceiverId() {
		return receiverId;
	}

	/**
	 * @param receiverId
	 *            the receiverId to set
	 */
	public final void setReceiverId(long receiverId) {
		this.receiverId = receiverId;
	}

	/**
	 * @return the created
	 */
	public final Date getCreated() {
		return created;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public final void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the confDesc
	 */
	public final String getConfDesc() {
		return confDesc;
	}

	/**
	 * @param confDesc
	 *            the confDesc to set
	 */
	public final void setConfDesc(String confDesc) {
		this.confDesc = confDesc;
	}

	/**
	 * @param id
	 * @param senderId
	 * @param receiverId
	 * @param confDesc
	 * @param created
	 */
	public RedLight(long id, long senderId, long receiverId, String confDesc, Date created) {
		this.id = id;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.confDesc = confDesc;
		this.created = created;
	}

}
