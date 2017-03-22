package com.studing.iterator;

/**
 * Created by fengqz on 2017-3-22.
 */
public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("剑南春", "【316大促】52°剑南春500ml", false, 389.00);
        addItem("杏花村", "【316大促】53°优级杏花村1000ml（双瓶装）①小缸精酿的优级酒品，粮食固态发酵②四川酿酒研究所官荣评分94分，权威机构为酒质保驾华航③历时两年匠心之作④一杯杏花村，半部华夏史！做醉坚定的历史文化传承者！", false, 198.00);
        addItem("五粮液", "【316大促】52°五粮液500ml浓香型代表，五粮酿造，喝真酒，喝名酒，享品质生活", false, 899.00);
        addItem("国窖1573", "53°国窖1573典藏500ml可以回味的历史！", false, 739.00);
        addItem("百岁山", "【天猫超市】百岁山矿泉水348ml*24瓶/箱 饮用水纯净水天然 健康", true, 46.90);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry,menu is full! Can't add item to menu.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
