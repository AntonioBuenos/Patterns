package behavioral.mediator.mediator;

import behavioral.mediator.components.AddButton;
import behavioral.mediator.components.DeleteButton;
import behavioral.mediator.components.Filter;
import behavioral.mediator.components.List;
import behavioral.mediator.components.SaveButton;
import behavioral.mediator.components.TextBox;
import behavioral.mediator.components.Title;

import javax.swing.*;

public class Runner {

    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
