package moran.practico2.ejercicio4;

public class Season {
    private Episode[] episodeList;
    private int numberOfEpisodes;

    public Season(int numberOfEpisodes) {
        episodeList = new Episode[numberOfEpisodes];
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void addEpisode(int episodeNumber, Episode episode) {
        episodeList[episodeNumber] = episode;
    }

    public Episode getEpisode(int episodeNumber) {
        return episodeList[episodeNumber];
    }

    public int getEpisodesViewed() {
        int amount = 0;
        for (Episode episode : episodeList) {
            if (episode.getViewed())
                amount++;
        }
        return amount;
    }

    public double getAverageRate() {
        int rate = 0, viewed = 0;
        for (Episode episode : episodeList) {
            if (episode.getViewed()) {
                viewed++;
                rate += episode.getRate();
            }
        }
        return (double) rate / viewed;
    }
}
