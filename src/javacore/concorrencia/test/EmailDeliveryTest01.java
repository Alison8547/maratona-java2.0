package javacore.concorrencia.test;


import javacore.concorrencia.dominio.Members;
import javacore.concorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread yugi = new Thread(new EmailDeliveryService(members), "Yami Yugi");
        Thread kaiba = new Thread(new EmailDeliveryService(members), "Kaiba");

        yugi.start();
        kaiba.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
