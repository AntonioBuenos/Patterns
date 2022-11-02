package pattern3_abstract_factory.factories;

import pattern3_abstract_factory.buttons.Button;
import pattern3_abstract_factory.buttons.MacOSButton;
import pattern3_abstract_factory.checkboxes.Checkbox;
import pattern3_abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}