package Controller;

import Gui.*;

/**
 *
 * @author Diego Sullon
 */
public class MainControllerView {

    private Records records;
    private static Main view;
    private static Menu menu;
    private static RegisterPolice registerPolice;
    private static RegisterManager registerManager;

    public MainControllerView(Main view, Records records) {
        this.records = records;
        this.view = view;
        menu = new Menu(view, records);
        registerPolice = new RegisterPolice(view, records);
        registerManager = new RegisterManager(view, records);

        GeneralControllerView.addComponentToContainer(this.view.mainPanel, menu);
        GeneralControllerView.addComponentToContainer(this.view.mainPanel, registerPolice);
        GeneralControllerView.addComponentToContainer(this.view.mainPanel, registerManager);

        menu.setVisible(true);
        registerPolice.setVisible(false);
        registerManager.setVisible(false);

        view.mainPanel.validate();

    }

    public static void changePanel(int op) {
        switch (op) {
            case 0:
                menu.setVisible(true);
                registerPolice.setVisible(false);
                registerManager.setVisible(false);

                break;
            case 1:
                menu.setVisible(false);
                registerPolice.setVisible(true);
                registerManager.setVisible(false);
                break;

            case 2:
                menu.setVisible(false);
                registerPolice.setVisible(false);
                registerManager.setVisible(true);

                break;
        }

    }

}
