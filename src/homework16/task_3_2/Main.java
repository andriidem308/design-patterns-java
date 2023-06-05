package homework16.task_3_2;

public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);

      // TODO: Implement pattern to run commented code
    for (ShopItem item : shop){
      System.out.println(item);
    }

    for (ItemsIterator itemsIterator = shop.itemsQuantityDescendingIterator(); itemsIterator.hasNext();){
      System.out.println(itemsIterator.next());
    }
  }
}
