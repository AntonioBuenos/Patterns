package creational.factory.factory;

import creational.factory.buttons.WindowsButton;
import creational.factory.buttons.Button;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
