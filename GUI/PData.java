public class PData {
    private String imagePath;
    private String description;
    private String name;

    public PData(String imagePath, String description, String name) {
        this.imagePath = imagePath;
        this.description = description;
        this.name = name;
    }
    public String getImagePath() {
        return imagePath;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
}