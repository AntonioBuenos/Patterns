package pattern3_abstruct_factory.factories;

import pattern3_abstruct_factory.buttons.Button;
import pattern3_abstruct_factory.buttons.WindowsButton;
import pattern3_abstruct_factory.checkboxes.Checkbox;
import pattern3_abstruct_factory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
