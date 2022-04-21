package prova;

public class Computador {
    private int memoria_ram;
    private String status;
    
    public Computador() {
    }
    public Computador(int ram, String modo) {
    this.setmemoria_ram(memoria_ram);
    this.setstatus(status);
    }
        public int getmemoria_ram() {
        return memoria_ram;
        }
        public String getstatus() {
        return status;
        }
    
    public void setstatus(String status) {
        if (modo.equals("ligado") || status.equals("desligado")) {
            this.status = status;
        }else {
               System.out.println("inválido");
        }
    }

    public void setmemoria_ram(int ram) {
        if ((memoria_ram == 4) || (memoria_ram == 8) || (memoria_ram == 16) || (memoria_ram == 32)) {
            this.memoria_ram = memoria_ram;
        }else {
            System.out.println("RAM inválida");
        }
    }

    public void upgrade(int x){
        this.setRam(this.memoria_ram + x);
    }
}