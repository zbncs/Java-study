package 线程.案例;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(ticket, "窗口1").start();
        new Thread(ticket, "窗口2").start();
        new Thread(ticket, "窗口3").start();
    }
}
