package buttoninheritance.urlbuttons;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import buttoninheritance.ButtonUI;

// Parent class: URL Buttons
public class ParentURLButton extends ButtonUI implements ActionListener{
    protected String url;

    public ParentURLButton(String text, String url) {
        super(text);
        this.url = url;
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        openBrowser(url);
    }

    protected void reNameButton(String name){
        this.setText(name);
    }





