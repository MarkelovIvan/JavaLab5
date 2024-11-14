// Узагальнений клас коштовного каменя
class Gem {
    private final double weight; // вага в каратах
    private final double pricePerCarat; // ціна за карат
    private final double transparency; // прозорість у відсотках

    public Gem(double weight, double pricePerCarat, double transparency) {
        this.weight = weight;
        this.pricePerCarat = pricePerCarat;
        this.transparency = transparency;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return pricePerCarat * weight;
    }

    public double getTransparency() {
        return transparency;
    }
}