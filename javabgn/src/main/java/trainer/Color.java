package trainer;

public enum Color {

    RED("piros"), GREEN("zöld"), BLUE("kék");

    private String hungarianColour;

    Color(String hungarianColour) {
        this.hungarianColour = hungarianColour;
    }

    public String getHungarianColour() {
        return hungarianColour;
    }
}
