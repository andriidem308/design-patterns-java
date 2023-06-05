package homework16.task_3_2;


public interface ItemsIterable extends Iterable<ShopItem>{
    ItemsIterator iterator();
    ItemsIterator itemsQuantityDescendingIterator();
}