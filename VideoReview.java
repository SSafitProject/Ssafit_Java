package com.ssafy.fit.model;

public class VideoReview {
	private int videoNo;
	private int reviewNo;
	private String nickname;
	private String content;
	
	public VideoReview() {
		super();
	
	}

	public VideoReview(int videoNo, int reviewNo, String nickname, String content) {
		super();
		this.videoNo = videoNo;
		this.reviewNo = reviewNo;
		this.nickname = nickname;
		this.content = content;
	}

	public int getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return content;
	}
	
	

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "VideoReview [videoNo=" + videoNo + ", reviewNo=" + reviewNo + ", nickname=" + nickname + ", content="
				+ content + "]";
	}
	
	
	
	

}
