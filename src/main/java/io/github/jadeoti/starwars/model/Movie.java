package io.github.jadeoti.starwars.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author adedeji.adeoti on 9/1/2019
 * @project starwars-api
 */
public class Movie {
    private String title;
    private String openingCrawl;
    @JsonProperty(value = "release_date")
    private String releaseDate;
    private String commentCount;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }
}
