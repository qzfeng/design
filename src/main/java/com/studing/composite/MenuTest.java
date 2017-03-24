package com.studing.composite;

/**
 * Created by fengqz on 2017-3-23.
 */
public class MenuTest {
    public static void main(String[] args) {
        MenuComponent menus = new Menu("All Menus", "All menus combined");
        MenuComponent wineMenu = new Menu("Wine Menu", "All wine is here");
        MenuComponent beverageMenu = new Menu("Beverage Menu", "All beverage is here");
        MenuComponent waterMenu = new Menu("Water Menu", "All water is here");
        MenuComponent dinerMenu = new Menu("Diner Menu", "All diner is here");
        menus.add(dinerMenu);
        menus.add(beverageMenu);
        menus.add(wineMenu);
        beverageMenu.add(waterMenu);

        wineMenu.add(new MenuItem("剑南春", "【316大促】52°剑南春500ml", false, 389.00));
        wineMenu.add(new MenuItem("杏花村", "【316大促】53°优级杏花村1000ml（双瓶装）", false, 198.00));
        wineMenu.add(new MenuItem("五粮液", "【316大促】52°五粮液500ml浓香型代表，五粮酿造，喝真酒，喝名酒，享品质生活", false, 899.00));
        wineMenu.add(new MenuItem("国窖1573", "53°国窖1573典藏500ml可以回味的历史！", false, 739.00));
        waterMenu.add(new MenuItem("百岁山", "【天猫超市】百岁山矿泉水348ml*24瓶/箱 饮用水纯净水天然 健康", true, 46.90));
        waterMenu.add(new MenuItem("恒大冰泉", "【天猫超市】恒大冰泉 饮用天然矿泉水 500ml*24瓶/箱 小瓶装", true, 48.00));
        waterMenu.add(new MenuItem("依云", "【天猫超市】法国进口Evian/依云矿泉水330ml/瓶玻璃瓶装欢乐颂", true, 13.90));
        beverageMenu.add(new MenuItem("可口可乐", "【天猫超市】可口可乐汽水330ml*24罐/箱碳酸饮料团聚可乐大包装", false, 48.00));
        beverageMenu.add(new MenuItem("六个核桃", "【天猫超市】 六个核桃 核桃乳饮品 240ml*20罐 无糖型饮料", true, 69.00));
        beverageMenu.add(new MenuItem("统一冰红茶", "【天猫超市】统一 冰红茶 250ml*24盒/箱 柠檬味茶饮料 更冰爽", false, 24.00));
        beverageMenu.add(new MenuItem("加多宝", "【天猫超市】加多宝 凉茶310ml*6/组 让更多人喝的凉茶 天然健康", true, 17.80));
        beverageMenu.add(new MenuItem("脉动", "【天猫超市】MIZONE/脉动维生素饮料青柠味 600ml*15/箱健康饮料", false, 54.00));
        dinerMenu.add(new MenuItem("酱香排骨饭", "米饭、排骨、凉菜、汤", false, 18.00));
        dinerMenu.add(new MenuItem("鱼香肉丝盖饭", "米饭、鱼香肉丝", false, 12.00));
        dinerMenu.add(new MenuItem("西红柿鸡蛋盖饭", "米饭、西红柿炒鸡蛋", true, 10.00));

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
