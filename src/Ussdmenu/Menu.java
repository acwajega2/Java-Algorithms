package Ussdmenu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    private int menuId;
    private MenuItems menu;
    private String menuType;
    private String action;

}
