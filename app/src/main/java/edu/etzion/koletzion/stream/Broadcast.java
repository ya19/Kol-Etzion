
package edu.etzion.koletzion.stream;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Broadcast {
	
	@SerializedName("streamId")
	@Expose
	private String streamId;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("publish")
	@Expose
	private Boolean publish;
	@SerializedName("date")
	@Expose
	private Integer date;
	@SerializedName("plannedStartDate")
	@Expose
	private Integer plannedStartDate;
	@SerializedName("duration")
	@Expose
	private Integer duration;
	@SerializedName("endPointList")
	@Expose
	private List<EndPointList> endPointList = null;
	@SerializedName("publicStream")
	@Expose
	private Boolean publicStream;
	@SerializedName("is360")
	@Expose
	private Boolean is360;
	@SerializedName("listenerHookURL")
	@Expose
	private String listenerHookURL;
	@SerializedName("category")
	@Expose
	private String category;
	@SerializedName("ipAddr")
	@Expose
	private String ipAddr;
	@SerializedName("username")
	@Expose
	private String username;
	@SerializedName("password")
	@Expose
	private String password;
	@SerializedName("quality")
	@Expose
	private String quality;
	@SerializedName("speed")
	@Expose
	private Integer speed;
	@SerializedName("streamUrl")
	@Expose
	private String streamUrl;
	@SerializedName("originAdress")
	@Expose
	private String originAdress;
	@SerializedName("mp4Enabled")
	@Expose
	private Integer mp4Enabled;
	@SerializedName("expireDurationMS")
	@Expose
	private Integer expireDurationMS;
	@SerializedName("rtmpURL")
	@Expose
	private String rtmpURL;
	@SerializedName("zombi")
	@Expose
	private Boolean zombi;
	@SerializedName("pendingPacketSize")
	@Expose
	private Integer pendingPacketSize;
	@SerializedName("hlsViewerCount")
	@Expose
	private Integer hlsViewerCount;
	@SerializedName("webRTCViewerCount")
	@Expose
	private Integer webRTCViewerCount;
	@SerializedName("rtmpViewerCount")
	@Expose
	private Integer rtmpViewerCount;
	
	public String getStreamId() {
		return streamId;
	}
	
	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Boolean getPublish() {
		return publish;
	}
	
	public void setPublish(Boolean publish) {
		this.publish = publish;
	}
	
	public Integer getDate() {
		return date;
	}
	
	public void setDate(Integer date) {
		this.date = date;
	}
	
	public Integer getPlannedStartDate() {
		return plannedStartDate;
	}
	
	public void setPlannedStartDate(Integer plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public List<EndPointList> getEndPointList() {
		return endPointList;
	}
	
	public void setEndPointList(List<EndPointList> endPointList) {
		this.endPointList = endPointList;
	}
	
	public Boolean getPublicStream() {
		return publicStream;
	}
	
	public void setPublicStream(Boolean publicStream) {
		this.publicStream = publicStream;
	}
	
	public Boolean getIs360() {
		return is360;
	}
	
	public void setIs360(Boolean is360) {
		this.is360 = is360;
	}
	
	public String getListenerHookURL() {
		return listenerHookURL;
	}
	
	public void setListenerHookURL(String listenerHookURL) {
		this.listenerHookURL = listenerHookURL;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getIpAddr() {
		return ipAddr;
	}
	
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getQuality() {
		return quality;
	}
	
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	public String getStreamUrl() {
		return streamUrl;
	}
	
	public void setStreamUrl(String streamUrl) {
		this.streamUrl = streamUrl;
	}
	
	public String getOriginAdress() {
		return originAdress;
	}
	
	public void setOriginAdress(String originAdress) {
		this.originAdress = originAdress;
	}
	
	public Integer getMp4Enabled() {
		return mp4Enabled;
	}
	
	public void setMp4Enabled(Integer mp4Enabled) {
		this.mp4Enabled = mp4Enabled;
	}
	
	public Integer getExpireDurationMS() {
		return expireDurationMS;
	}
	
	public void setExpireDurationMS(Integer expireDurationMS) {
		this.expireDurationMS = expireDurationMS;
	}
	
	public String getRtmpURL() {
		return rtmpURL;
	}
	
	public void setRtmpURL(String rtmpURL) {
		this.rtmpURL = rtmpURL;
	}
	
	public Boolean getZombi() {
		return zombi;
	}
	
	public void setZombi(Boolean zombi) {
		this.zombi = zombi;
	}
	
	public Integer getPendingPacketSize() {
		return pendingPacketSize;
	}
	
	public void setPendingPacketSize(Integer pendingPacketSize) {
		this.pendingPacketSize = pendingPacketSize;
	}
	
	public Integer getHlsViewerCount() {
		return hlsViewerCount;
	}
	
	public void setHlsViewerCount(Integer hlsViewerCount) {
		this.hlsViewerCount = hlsViewerCount;
	}
	
	public Integer getWebRTCViewerCount() {
		return webRTCViewerCount;
	}
	
	public void setWebRTCViewerCount(Integer webRTCViewerCount) {
		this.webRTCViewerCount = webRTCViewerCount;
	}
	
	public Integer getRtmpViewerCount() {
		return rtmpViewerCount;
	}
	
	public void setRtmpViewerCount(Integer rtmpViewerCount) {
		this.rtmpViewerCount = rtmpViewerCount;
	}
	
}
