package com.ssafy.fit.model;

import java.util.ArrayList;
import java.util.List;



public class VideoDaoImpl implements IVideo{
	
	private List<Video> list = new ArrayList<>();
	
	private static VideoDaoImpl instance = new VideoDaoImpl();

	private VideoDaoImpl() {}
	
	public static VideoDaoImpl getInstance() {
		return instance;
	}
	
	public List<Video> selectVideo(){
		return null;
	}
	
	public Video[] selectVideoByNo(int no) {
		return null;
	}
	

	

	
	

}
