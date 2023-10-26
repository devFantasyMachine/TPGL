package menu;


public interface MenuComponentVisitor {

    void visiteMenu(Menu menu);

    void visiteMenuItem(MenuItem item);

}
