package com.jpex.crickipl;

public class Match {

    public Match(String matchtitle, String team1, String team2, String team1score, String team2score, String matchstatus) {
        this.matchtitle = matchtitle;
        this.team1 = team1;
        this.team2 = team2;
        this.team1score = team1score;
        this.team2score = team2score;
        this.matchstatus = matchstatus;
    }

    public String getMatchtitle() {
        return matchtitle;
    }

    public void setMatchtitle(String matchtitle) {
        this.matchtitle = matchtitle;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam1score() {
        return team1score;
    }

    public void setTeam1score(String team1score) {
        this.team1score = team1score;
    }

    public String getTeam2score() {
        return team2score;
    }

    public void setTeam2score(String team2score) {
        this.team2score = team2score;
    }

    public String getMatchstatus() {
        return matchstatus;
    }

    public void setMatchstatus(String matchstatus) {
        this.matchstatus = matchstatus;
    }

    private String matchtitle;
    private String team1;
    private String team2;
    private String team1score;
    private String team2score;
    private String matchstatus;

}

