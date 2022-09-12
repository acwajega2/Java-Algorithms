package Ussdmenu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItems<T> {
    private int id;
    private String description;
    private T menu;

}
