import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Клас, що описує намисто
class Necklace {
    private final List<Gem> gems;

    public Necklace() {
        gems = new ArrayList<>();
    }

    public void addGem(Gem gem) {
        gems.add(gem);
    }

    // Підрахунок загальної ваги каміння
    public double getTotalWeight() {
        return gems.stream().mapToDouble(Gem::getWeight).sum();
    }

    // Підрахунок загальної вартості намиста
    public double getTotalPrice() {
        return gems.stream().mapToDouble(Gem::getPrice).sum();
    }

    // Сортування каміння за ціною
    public void sortByValue() {
        gems.sort(Comparator.comparingDouble(Gem::getPrice).reversed());
    }

    // Пошук каменів за заданим діапазоном прозорості
    public List<Gem> findGemsByTransparency(double minTransparency, double maxTransparency) {
        List<Gem> result = new ArrayList<>();
        for (Gem gem : gems) {
            if (gem.getTransparency() >= minTransparency && gem.getTransparency() <= maxTransparency) {
                result.add(gem);
            }
        }
        return result;
    }

    // Виведення інформації про всі камені в намисті
    public void displayNecklaceInfo() {
        for (Gem gem : gems) {
            System.out.println(gem.getClass().getSimpleName() + " - вага: " + gem.getWeight() + " карат, вартість: $" + gem.getPrice() + ", прозорість: " + gem.getTransparency() + "%");
        }
    }
}