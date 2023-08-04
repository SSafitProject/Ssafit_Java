package com.ssafy.fit.model;

import java.util.List;

public interface IVideo {
	

	public List<Video> selectVideo();
	public Video[] selectVideoByNo(int no);
	
	

}
