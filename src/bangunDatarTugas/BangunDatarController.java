/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatarTugas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author snape
 */
public class BangunDatarController {
    
    public BangunDatar view;

    public BangunDatarController(BangunDatar view) {
        this.view = view;
        
        this.view.getBtnHitung().addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            hitung();
        }
    });
    
    this.view.getBtnClear().addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            view.getTxtPanjang().setText("");
            view.getTxtLebar().setText("");
            view.gethLuas().setText("");
            view.gethKeliling().setText("");
        }
    });
    }
    
    public void hitung(){
        
        if (this.view.getTxtPanjang().getText().isEmpty() || this.view.getTxtLebar().getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong bro");
        }else{
        //menginisasi panjang dan lebar
        int p = Integer.valueOf(view.getTxtPanjang().getText());
        int l = Integer.valueOf(view.getTxtLebar().getText());
        
        int luas = p*l;
        int keliling = (2*p)+(2*l);
        
        view.gethLuas().setText(String.valueOf(luas));
        view.gethKeliling().setText(String.valueOf(keliling));    
        }
    }
}
