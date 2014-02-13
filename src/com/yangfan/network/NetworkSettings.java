package com.yangfan.network;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.yangfan.network.NetworkAnalysisAndGenerate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lxy on 14-2-12.
 */
public class NetworkSettings {
    private JPanel panelMain;
    private JTextField textFieldNodeNum;
    private JTextField textFieldEdgeNum;
    private JButton buttonOK;
    private JButton buttonCanel;
    private JDialog dialog;

    public NetworkSettings(final NetworkAnalysisAndGenerate parentClass, JFrame parentFrame) {
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int nodeNumber = Integer.valueOf(textFieldNodeNum.getText());
                    int edgeNumber = Integer.valueOf(textFieldEdgeNum.getText());
                    if (nodeNumber <= 0 || edgeNumber <= 0) {
                        JOptionPane.showMessageDialog(null, "Please input positive number!");
                    } else if (edgeNumber > nodeNumber * (nodeNumber - 1) / 2) {
                        JOptionPane.showMessageDialog(null, "Please input valid number");
                    } else {
                        parentClass.setNetworkInfo(nodeNumber, edgeNumber);
                        dialog.dispose();
                    }
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, "Please input number!");
                }
            }
        });
        buttonCanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog = new JDialog(parentFrame, "NetworkSettings", true);
        dialog.setContentPane(panelMain);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelMain = new JPanel();
        panelMain.setLayout(new FormLayout("fill:30px:noGrow,left:4dlu:noGrow,fill:90px:noGrow,left:4dlu:noGrow,fill:106px:noGrow,left:4dlu:noGrow,fill:d:grow", "center:20px:noGrow,top:4dlu:noGrow,center:43px:noGrow,top:4dlu:noGrow,center:43px:noGrow,top:4dlu:noGrow,center:max(d;4px):grow,top:4dlu:noGrow,center:d:grow"));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        CellConstraints cc = new CellConstraints();
        panelMain.add(spacer1, cc.xy(1, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        panelMain.add(spacer2, cc.xy(3, 1, CellConstraints.DEFAULT, CellConstraints.FILL));
        final JLabel label1 = new JLabel();
        label1.setText("Node Number");
        panelMain.add(label1, cc.xy(3, 3, CellConstraints.DEFAULT, CellConstraints.TOP));
        final JLabel label2 = new JLabel();
        label2.setText("Edge Number");
        panelMain.add(label2, cc.xy(3, 5, CellConstraints.DEFAULT, CellConstraints.TOP));
        textFieldNodeNum = new JTextField();
        panelMain.add(textFieldNodeNum, cc.xy(5, 3, CellConstraints.FILL, CellConstraints.TOP));
        textFieldEdgeNum = new JTextField();
        panelMain.add(textFieldEdgeNum, cc.xy(5, 5, CellConstraints.FILL, CellConstraints.TOP));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        panelMain.add(spacer3, cc.xy(7, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
        buttonOK = new JButton();
        buttonOK.setText("OK");
        panelMain.add(buttonOK, cc.xy(5, 7, CellConstraints.DEFAULT, CellConstraints.TOP));
        buttonCanel = new JButton();
        buttonCanel.setText("Canel");
        panelMain.add(buttonCanel, cc.xy(3, 7, CellConstraints.DEFAULT, CellConstraints.TOP));
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        panelMain.add(spacer4, cc.xy(3, 9, CellConstraints.DEFAULT, CellConstraints.FILL));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }
}
