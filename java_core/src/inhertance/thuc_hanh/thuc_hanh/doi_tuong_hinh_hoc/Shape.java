package inhertance.thuc_hanh.thuc_hanh.doi_tuong_hinh_hoc;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color +
                "and filled/not filled " + filled;
    }
}
