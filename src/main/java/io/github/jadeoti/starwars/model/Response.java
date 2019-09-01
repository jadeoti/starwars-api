package io.github.jadeoti.starwars.model;

/**
 * @author adedeji.adeoti on 9/1/2019
 * @project starwars-api
 */
public class Response {
    private int count;
    private String next;
    private String previous;
    private String results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}
