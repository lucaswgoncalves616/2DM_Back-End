package Abstract;

public enum Cores {
    AZUL (10),
    VERMELHO (20),
    VERDE (30),
    CINZA (40),
    PRETO (50),
    BRANCO (60),
    ROXO (70),
    MARROM (80),
    ROSA (90);

    private int i;

    Cores(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
