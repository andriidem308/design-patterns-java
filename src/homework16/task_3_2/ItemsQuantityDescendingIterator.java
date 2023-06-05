package homework16.task_3_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ItemsQuantityDescendingIterator implements ItemsIterator {
    private final List<ShopItem> items;
    private int itemIndex = 0;

    public ItemsQuantityDescendingIterator(Collection<ShopItem> items) {
        this.items = new ArrayList<>(items);
        this.items.sort(Comparator.comparing(ShopItem::getQuantity).reversed());
    }

    @Override
    public boolean hasNext() {
        return itemIndex < items.size();
    }

    @Override
    public ShopItem next() {
        if (hasNext()) {
            return items.get(itemIndex++);
        }
        return null;
    }
}
