package io.github.jadeoti.starwars.model;

import java.time.LocalDateTime;

/**
 * @author adedeji.adeoti on 9/2/2019
 * @project starwars-api
 */
public class Comment {
    private String text;
    private String ipAddress;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
