package pattern4_factory.factory;

import pattern4_factory.buttons.Button;
import pattern4_factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
