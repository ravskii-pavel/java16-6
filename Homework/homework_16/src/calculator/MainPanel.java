package calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ravskiy Pavel on 09.01.2017.
 */
public class MainPanel extends JPanel {

    public MainPanel() {
        NumberPanel numberPanel = new NumberPanel();
        add(numberPanel);

        OperationPanel operationPanel =  new OperationPanel();
        add(operationPanel);
    }
}
