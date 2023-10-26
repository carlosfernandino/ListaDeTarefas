package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceListaTarefas {
    private static ArrayList<String> tarefas = new ArrayList<String>();
    private static DefaultListModel<String> model = new DefaultListModel<>();

    public static void main(String[] args){
        JFrame frame = new JFrame("Aplicativo de Lista de Tarefas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);


        JList<String> list = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(list);

        JTextField textField = new JTextField();
        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarTarefa(textField.getText());
                textField.setText("");
            }
        });

        JButton removeButton = new JButton("Remover tarefa");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerTarefa(list.getSelectedIndex());
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(textField, BorderLayout.CENTER);
        panel.add(addButton, BorderLayout.EAST);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(removeButton, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);


        frame.setVisible(true);
    }

    private static void adicionarTarefa(String tarefa){
        tarefas.add(tarefa);
        model.addElement(tarefa);
    }

    private static void removerTarefa(int indice){
        tarefas.remove(indice);
        model.remove(indice);
    }

}
