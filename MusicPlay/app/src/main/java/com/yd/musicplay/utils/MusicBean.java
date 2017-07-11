package com.yd.musicplay.utils;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DELL on 2017/7/6.
 * 歌曲列表实体类
 */

public class MusicBean implements Parcelable {


    private int music_id;//ID
    private String music_name;//歌曲名
    private String music_album;//专辑名
    private String music_artist;//歌手名
    private String music_file_path;//文件路径
    private int music_duration;//歌曲时长
    private long music_size;//文件大小
    private boolean music_my_love = false;//我喜欢
    private String music_icon_path = "";//歌曲图片地址

    @Override
    public String toString() {
        return "MusicBean{" +
                "music_id=" + music_id +
                ", music_name='" + music_name + '\'' +
                ", music_album='" + music_album + '\'' +
                ", music_artist='" + music_artist + '\'' +
                ", music_file_path='" + music_file_path + '\'' +
                ", music_duration=" + music_duration +
                ", music_size=" + music_size +
                ", music_my_love=" + music_my_love +
                ", music_icon_path='" + music_icon_path + '\'' +
                '}';
    }

    public MusicBean() {
    }

    public int getMusic_id() {
        return music_id;
    }

    public void setMusic_id(int music_id) {
        this.music_id = music_id;
    }

    public String getMusic_name() {
        return music_name;
    }

    public void setMusic_name(String music_name) {
        this.music_name = music_name;
    }

    public String getMusic_album() {
        return music_album;
    }

    public void setMusic_album(String music_album) {
        this.music_album = music_album;
    }

    public String getMusic_artist() {
        return music_artist;
    }

    public void setMusic_artist(String music_artist) {
        this.music_artist = music_artist;
    }

    public String getMusic_file_path() {
        return music_file_path;
    }

    public void setMusic_file_path(String music_file_path) {
        this.music_file_path = music_file_path;
    }

    public int getMusic_duration() {
        return music_duration;
    }

    public void setMusic_duration(int music_duration) {
        this.music_duration = music_duration;
    }

    public long getMusic_size() {
        return music_size;
    }

    public void setMusic_size(long music_size) {
        this.music_size = music_size;
    }

    public boolean isMusic_my_love() {
        return music_my_love;
    }

    public void setMusic_my_love(boolean music_my_love) {
        this.music_my_love = music_my_love;
    }

    public String getMusic_icon_path() {
        return music_icon_path;
    }

    public void setMusic_icon_path(String music_icon_path) {
        this.music_icon_path = music_icon_path;
    }

    protected MusicBean(Parcel in) {

    }

    public static final Creator<MusicBean> CREATOR = new Creator<MusicBean>() {
        @Override
        public MusicBean createFromParcel(Parcel in) {
            return new MusicBean(in);
        }

        @Override
        public MusicBean[] newArray(int size) {
            return new MusicBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
