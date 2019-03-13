
package edu.etzion.koletzion.stream;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EndPointList {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("broadcastId")
    @Expose
    private String broadcastId;
    @SerializedName("streamId")
    @Expose
    private String streamId;
    @SerializedName("rtmpUrl")
    @Expose
    private String rtmpUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("endpointServiceId")
    @Expose
    private String endpointServiceId;
    @SerializedName("serverStreamId")
    @Expose
    private String serverStreamId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBroadcastId() {
        return broadcastId;
    }

    public void setBroadcastId(String broadcastId) {
        this.broadcastId = broadcastId;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getRtmpUrl() {
        return rtmpUrl;
    }

    public void setRtmpUrl(String rtmpUrl) {
        this.rtmpUrl = rtmpUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndpointServiceId() {
        return endpointServiceId;
    }

    public void setEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
    }

    public String getServerStreamId() {
        return serverStreamId;
    }

    public void setServerStreamId(String serverStreamId) {
        this.serverStreamId = serverStreamId;
    }

}
