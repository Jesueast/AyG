/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ollamamaven;

import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import static java.util.Collections.list;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import org.json.JSONObject;

/**
 *
 * @author ABRAHAM
 */
public class Ollamamaven {
    
    public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {
        SwingUtilities.invokeLater(() -> {
            // Crear una instancia de tu frame personalizado desde la clase Ollama
            Ollama frame1 = new Ollama();
            // Hacer visible el frame
            frame1.setVisible(true);
        });

          

        // Añadir la lista al frame
        
        
        
        
        
        
    }
}
