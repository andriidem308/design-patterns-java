package homework16.task_3_2;

import java.util.HashMap;

public class Shop implements ItemsIterable {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }


    @Override
    public ItemsIterator iterator() {
        return new AlphabeticalIterator(items.values());
    }

    public ItemsIterator itemsQuantityDescendingIterator() {
        return new ItemsQuantityDescendingIterator(items.values());
    }
}
