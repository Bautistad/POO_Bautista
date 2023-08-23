
package vista;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class Profesor extends JFrame {
    
    //Se instancia objetos para conectarse
    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    
     private JTextField codigoField, cedulaField, apellidoField, nombreField, celularField, direccionField;
        private JComboBox<String> materiaComboBox;
        private JRadioButton activoRadioButton, inactivoRadioButton;
        private JButton guardarButton,editarButton,eliminarButton;
        private DefaultTableModel tableModel;
         private JTable table;  
        private int selectedIndex = -1;

        public Profesor() {
        
        setSize(800, 800);    
        setTitle("Profesor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null); // Usar un diseño absoluto

        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(30, 70, 350, 40);
        add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(30, 100, 350, 40);
        add(codigoField);


        JLabel codigoLabe3 = new JLabel("Apellido:");
        codigoLabe3.setBounds(30, 190, 350, 40);
        add(codigoLabe3);

        apellidoField = new JTextField();
        apellidoField.setBounds(30, 220, 350, 40);
        add(apellidoField);

        JLabel codigoLabe4 = new JLabel("Nombre:");
        codigoLabe4.setBounds(30, 250, 350, 40);
        add(codigoLabe4);

        nombreField = new JTextField();
        nombreField.setBounds(30, 280, 350, 40);
        add(nombreField);

        JLabel codigoLabe5 = new JLabel("Celular:");
        codigoLabe5.setBounds(30, 310, 350, 40);
        add(codigoLabe5);

        celularField = new JTextField();
        celularField.setBounds(30, 340, 350, 40);
        add(celularField);


        JLabel materiaLabel = new JLabel("Titulo:");
        materiaLabel.setBounds(30, 430, 250, 40);
        add(materiaLabel);

        String[] titulo = {"Ingeniero", "Licenciado", "Magister"};
        materiaComboBox = new JComboBox<>(titulo);
        materiaComboBox.setBounds(60, 470, 250, 40);
        add(materiaComboBox);

        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setBounds(30, 520, 350, 40);
        add(estadoLabel);

        activoRadioButton = new JRadioButton("Activo");
        inactivoRadioButton = new JRadioButton("Inactivo");
        activoRadioButton.setBounds(130, 510, 100, 30);
        inactivoRadioButton.setBounds(130, 540, 100, 30);
        ButtonGroup estadoGroup = new ButtonGroup();
        estadoGroup.add(activoRadioButton);
        estadoGroup.add(inactivoRadioButton);
        add(activoRadioButton);
        add(inactivoRadioButton);

        guardarButton = new JButton("Guardar");
        guardarButton.setBounds(400, 550, 100, 30);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });
        add(guardarButton);

        editarButton = new JButton("Editar");
        editarButton.setBounds(520, 550, 100, 30);
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarDatos();
            }
        });
        add(editarButton);

        eliminarButton = new JButton("Eliminar");
        eliminarButton.setBounds(640, 550, 100, 30);
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarDatos();
            }
        });
        add(eliminarButton);

         String[] columnNames = {"Código",  "Apellido", "Nombre", "Celular", "Titulo",  "Estado"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRowClicked();
            }
        });
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 600, 650, 150);
        add(scrollPane);
        }

        private void tableRowClicked() {
            selectedIndex = table.getSelectedRow();
            if (selectedIndex >= 0) {
                codigoField.setText(table.getValueAt(selectedIndex, 0).toString());
                cedulaField.setText(table.getValueAt(selectedIndex, 1).toString());
                apellidoField.setText(table.getValueAt(selectedIndex, 2).toString());
                nombreField.setText(table.getValueAt(selectedIndex, 3).toString());
                celularField.setText(table.getValueAt(selectedIndex, 4).toString());
                direccionField.setText(table.getValueAt(selectedIndex, 5).toString());
                materiaComboBox.setSelectedItem(table.getValueAt(selectedIndex, 6).toString());
                String estado = table.getValueAt(selectedIndex, 7).toString();
                activoRadioButton.setSelected(estado.equals("Activo"));
                inactivoRadioButton.setSelected(estado.equals("Inactivo"));
            }
        }

        private void guardarDatos() {
            String codigo = codigoField.getText();
            String apellido = apellidoField.getText();
            String nombre = nombreField.getText();
            String celular = celularField.getText();
            String titulo = (String) materiaComboBox.getSelectedItem();
            String estado = activoRadioButton.isSelected() ? "Activo" : "Inactivo";

            tableModel.addRow(new Object[]{codigo, apellido, nombre, celular, titulo, estado});

            // Limpiar los campos después de guardar
            codigoField.setText("");
            apellidoField.setText("");
            nombreField.setText("");
            celularField.setText("");
            materiaComboBox.setSelectedIndex(0);
            activoRadioButton.setSelected(true);
        }

        private void editarDatos() {
            if (selectedIndex >= 0) {
                tableModel.setValueAt(codigoField.getText(), selectedIndex, 0);
                tableModel.setValueAt(apellidoField.getText(), selectedIndex, 1);
                tableModel.setValueAt(nombreField.getText(), selectedIndex, 2);
                tableModel.setValueAt(celularField.getText(), selectedIndex, 3);
                tableModel.setValueAt(materiaComboBox.getSelectedItem(), selectedIndex, 4);
                tableModel.setValueAt(activoRadioButton.isSelected() ? "Activo" : "Inactivo", selectedIndex, 5);

                // Limpiar los campos después de editar
                selectedIndex = -1;
                table.clearSelection();
                codigoField.setText("");
                apellidoField.setText("");
                nombreField.setText("");
                celularField.setText("");
                materiaComboBox.setSelectedIndex(0);
                activoRadioButton.setSelected(true);
            }
        }

        private void eliminarDatos() {
            if (selectedIndex >= 0) {
                tableModel.removeRow(selectedIndex);
                selectedIndex = -1;
                table.clearSelection();
                codigoField.setText("");
                apellidoField.setText("");
                nombreField.setText("");
                celularField.setText("");
                materiaComboBox.setSelectedIndex(0);
                activoRadioButton.setSelected(true);
            }
        }
    
}
