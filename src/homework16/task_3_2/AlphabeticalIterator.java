package homework16.task_3_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class AlphabeticalIterator implements ItemsIterator {
    private final List<ShopItem> items;
    private int itemIndex = 0;

    public AlphabeticalIterator(Collection<ShopItem> items) {
        this.items = new ArrayList<>(items);
        this.items.sort(Comparator.comparing(ShopItem::getName, String.CASE_INSENSITIVE_ORDER));
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
