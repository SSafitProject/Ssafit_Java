package com.ssafy.fit.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class IVideoImpl implements IVideo {

	private List<Video> list = new ArrayList<>();

	private static IVideoImpl instance = new IVideoImpl();

	private IVideoImpl() {
	}

	public static IVideoImpl getInstance() {
		return instance;
	}

	Gson gson = new Gson();

	@Override
	public void selectVideo() {
		ArrayList<Video> videolist = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/videolist.json")));
			StringBuilder sb = new StringBuilder();

			String str = null;
			while ((str = br.readLine()) != null) {
				sb.append(str).append("\n");
			}

			Video[] arr = gson.fromJson(sb.toString(), Video[].class);
			for (Video video : arr) {
				System.out.println(video.getTitle());
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void selectVideoByVideoId(int videoId) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/videolist.json")));
			StringBuilder sb = new StringBuilder();

			String str = null;
			while ((str = br.readLine()) != null) {
				sb.append(str).append("\n");
			}

			Video[] arr = gson.fromJson(sb.toString(), Video[].class);
			for (Video video : arr) {
				if (video.getVideoId() == videoId) {

					System.out.println(video.getVideoId());
				}
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
