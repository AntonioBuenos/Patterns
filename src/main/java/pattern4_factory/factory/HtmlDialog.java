package pattern4_factory.factory;

import pattern4_factory.buttons.Button;
import pattern4_factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
