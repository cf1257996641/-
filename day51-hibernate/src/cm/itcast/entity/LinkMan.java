package cm.itcast.entity;

import java.io.Serializable;

public class LinkMan  implements Serializable {
   	private Long lkmId;
	private String lkmName;
	private String lkmgender;
	private String lkmphone;
	private String lkmmobile;
	private String lkmemail;
	private String lkmposition;
	private String lkmmemo;
	@Override
	public String toString() {
		return "LinkMan [lkmId=" + lkmId + ", lkmName=" + lkmName + ", lkmgender=" + lkmgender + ", lkmphone="
				+ lkmphone + ", lkmmobile=" + lkmmobile + ", lkmemail=" + lkmemail + ", lkmposition=" + lkmposition
				+ ", lkmmemo=" + lkmmemo + "]";
	}
	public Long getLkmId() {
		return lkmId;
	}
	public void setLkmId(Long lkmId) {
		this.lkmId = lkmId;
	}
	public String getLkmName() {
		return lkmName;
	}
	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}
	public String getLkmgender() {
		return lkmgender;
	}
	public void setLkmgender(String lkmgender) {
		this.lkmgender = lkmgender;
	}
	public String getLkmphone() {
		return lkmphone;
	}
	public void setLkmphone(String lkmphone) {
		this.lkmphone = lkmphone;
	}
	public String getLkmmobile() {
		return lkmmobile;
	}
	public void setLkmmobile(String lkmmobile) {
		this.lkmmobile = lkmmobile;
	}
	public String getLkmemail() {
		return lkmemail;
	}
	public void setLkmemail(String lkmemail) {
		this.lkmemail = lkmemail;
	}
	public String getLkmposition() {
		return lkmposition;
	}
	public void setLkmposition(String lkmposition) {
		this.lkmposition = lkmposition;
	}
	public String getLkmmemo() {
		return lkmmemo;
	}
	public void setLkmmemo(String lkmmemo) {
		this.lkmmemo = lkmmemo;
	}
}
