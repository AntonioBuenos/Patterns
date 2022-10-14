package pattern3_factory.factory;

import pattern3_factory.buttons.Button;
import pattern3_factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
