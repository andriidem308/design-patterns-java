package homework16.task_3_2;

import java.util.Iterator;

public interface ItemsIterator extends Iterator<ShopItem> {
    boolean hasNext();
    ShopItem next();
}
