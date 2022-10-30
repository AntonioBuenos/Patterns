package pattern3_abstruct_factory.factories;

import pattern3_abstruct_factory.buttons.Button;
import pattern3_abstruct_factory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
