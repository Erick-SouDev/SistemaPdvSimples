/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erick.br.pdv.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public abstract class AbstractKeyListener implements KeyListener{
    
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {}
    
}
