package Ussdmenu;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        MenuComparator comp = new MenuComparator();
        PriorityQueue<Menu> xmenu = new PriorityQueue<>(10, comp);

        //Menu menu = new Menu(1,generateMenu(1,"buy_option","buy Option"),"Buy Option","requst");

        xmenu.add(new Menu(1,generateMenu(1,"buy_option","buy Option"),"Buy Option","request"));
        xmenu.add(new Menu(2,generateMenu(2,"pay_option","Payment Option"),"Payment Option","request"));
        xmenu.add(new Menu(2,generateMenu(2,"pay_option","Payment Option"),"Payment Option","request"));

        System.out.println(xmenu.poll());
        System.out.println(xmenu.poll());



    }


    public static MenuItems generateMenu(Integer id,String type,String description){
        MenuItems menuItem = new MenuItems();

        menuItem.setId(id);
        if (type.equalsIgnoreCase("buy_Option")){
             menuItem.setMenu(generateBuyOptionMenu().getMenu());
        } else if (type.equalsIgnoreCase("pay_option")){
            menuItem.setMenu(generatePaymentMenu().getMenu());
        }

        menuItem.setDescription(description);


        return menuItem;


    }

    //-----------> Generate a buy Option ------------------------
    public static BuyOptionMenu generateBuyOptionMenu() {
        List<HashMap<String, String>> menus = new ArrayList<>();
        HashMap<String, String> menu_option = new HashMap<>();
        menu_option.put("self", "Buy for Self");
        menu_option.put("other", "Buy for Other");
        menus.add(menu_option);
        return new BuyOptionMenu(menus);
    }

    //---------------> Generate Payment Menu ------------------------
    public static PaymentMenu generatePaymentMenu(){
        List<HashMap<String, String>> menus = new ArrayList<>();
        HashMap<String, String> menu_option = new HashMap<>();
        menu_option.put("airtime", "Airtime");
        menu_option.put("momo", "Mobile Money");
        menus.add(menu_option);
        return new PaymentMenu(menus);
    }

}


class MenuComparator implements Comparator<Menu> {

    @Override
    public int compare(Menu o1, Menu o2) {
        return 0;
    }
}