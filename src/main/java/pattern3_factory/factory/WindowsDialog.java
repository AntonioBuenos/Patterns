package pattern3_factory.factory;

import pattern3_factory.buttons.Button;
import pattern3_factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
