package moran.practico2.ejercicio4;

public class Episode {
    final int minRate = 1, maxRate = 5;
    private boolean viewed = false;
    private int rate = -1;
    private String title, description;

    public Episode(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getRate() {
        return rate;
    }

    public boolean getViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {//modelar asi o hacer uno que ponga true siempre
        this.viewed = viewed;
    }

    public boolean setRate(Integer rate) {
        if (this.viewed)
            if (rate >= minRate && rate <= maxRate) {
                this.rate = rate;
                return true;
            }
        return false;
    }

}
