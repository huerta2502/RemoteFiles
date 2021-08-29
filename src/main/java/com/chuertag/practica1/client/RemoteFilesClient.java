package com.chuertag.practica1.client;

import com.chuertag.practica1.client.gui.ClientFilesPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author root
 */
public class RemoteFilesClient extends JPanel implements ActionListener{
    
    private JPanel clientFiles, serverFiles, inputs;
    private JLabel addrLabel, portLabel, instruct;
    private JTextField addrTF, portTF;
    private JButton connectButton;

    public RemoteFilesClient(int width, int height) {
        setSize(width, height);
        setLayout(new BorderLayout());
        setComponents();
        setVisible(true);
    }
    
    public void setComponents(){
        initComponents();
        add(inputs, BorderLayout.NORTH);
        add(clientFiles, BorderLayout.WEST);
        add(serverFiles, BorderLayout.EAST);
    }
    
    public void initComponents() {
        clientFiles = new ClientFilesPanel();
        serverFiles = new JPanel();
        inputs = new JPanel(new GridLayout(3, 2, 1, 1));
        addrLabel = new JLabel("Remote IP Address: ");
        addrTF = new JTextField("###.###.###.###");
        addrTF.addActionListener(this);
        portLabel = new JLabel("Server Port: ");
        portTF = new JTextField("#####");
        portTF.addActionListener(this);
        instruct = new JLabel("Enter the server IP address and port to access remote files.");
        connectButton = new JButton("Connect");
        configComponents();
    }
    
    public void configComponents(){
        addrLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        portLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        instruct.setHorizontalAlignment(SwingConstants.RIGHT);
        connectButton.addActionListener(this);
        inputs.add(addrLabel);
        inputs.add(addrTF);
        inputs.add(portLabel);
        inputs.add(portTF);
        inputs.add(instruct);
        inputs.add(connectButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(addrTF.getText().equals("###.###.###.###") ){
            return;
        }
        if(portTF.getText().equals("#####")){
            return;
        }
    }
    
}