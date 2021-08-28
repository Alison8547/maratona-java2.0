package javacore.threads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou o email na lista");
            emails.add(email);
            emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (emails) {
            while (emails.size() == 0) {
                if (!open) break;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponivel nessa lista, entrando no modo espera");
                emails.wait();
            }
            return emails.poll();
        }

    }

    public void close(){
        open = false;
        synchronized (emails){
            System.out.println(Thread.currentThread().getName()+" Notificando todo mundo que não estamos mais pegando emails");
        }

    }
}
