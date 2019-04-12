package moran.practico2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private List<Season> seasonList;
    private String title, description, creator, genre;

    public Serie() {
        this.seasonList = new ArrayList<Season>();
    }

    public void addSeason(Season season) {
        seasonList.add(season);
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCreator() {
        return creator;
    }

    public String getGenre() {
        return creator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getAverageRate() {
        double total = 0;
        int numberOfEpisodes = this.getEpisodesView();
        for (Season s : seasonList) {
            double b = s.getEpisodesViewed();
            double c = numberOfEpisodes;
            double a = b / c;
            total += a * s.getAverageRate();
        }
        return total;
    }

    public int getNumberOfEpisodes() {
        int amount = 0;
        for (Season s : seasonList) {
            amount += s.getNumberOfEpisodes();
        }
        return amount;
    }

    public int getEpisodesView() {
        int amount = 0;
        for (Season s : seasonList) {
            amount += s.getEpisodesViewed();
        }
        return amount;
    }

    public boolean seenAll() {
        return getEpisodesView() == getNumberOfEpisodes();
    }
}
