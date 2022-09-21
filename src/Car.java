public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0.0f) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        }
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", model = " + model + ", engineVolume = " + engineVolume +
                ", color = " + color + ", productionYear = " + productionYear + ", productionCountry = " + productionCountry;
    }
}
