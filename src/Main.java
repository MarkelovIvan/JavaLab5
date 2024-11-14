import java.util.List;

public class Main {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();

        // Додаємо камені до намиста
        necklace.addGem(new Diamond(10, 100, 90));
        necklace.addGem(new Ruby(20, 200, 80));
        necklace.addGem(new Topaz(30, 300, 50));

        // Виводимо інформацію про намисто
        System.out.println("Інформація про намисто:");
        necklace.displayNecklaceInfo();

        // Загальна вага та вартість
        System.out.println("\nЗагальна вага: " + necklace.getTotalWeight() + " карат");
        System.out.println("Загальна вартість: $" + necklace.getTotalPrice());

        // Сортування каменів за цінністю
        necklace.sortByValue();
        System.out.println("\nНамисто після сортування за цінністю:");
        necklace.displayNecklaceInfo();

        // Пошук каменів за прозорістю
        double minTransparency = 70;
        double maxTransparency = 100;
        List<Gem> foundGems = necklace.findGemsByTransparency(minTransparency, maxTransparency);
        System.out.println("\nКамені з прозорістю в діапазоні " + minTransparency + "% - " + maxTransparency + "%:");
        for (Gem gem : foundGems) {
            System.out.println(gem.getClass().getSimpleName() + " - прозорість: " + gem.getTransparency() + "%");
        }
    }
}
