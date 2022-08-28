package Terceira;

public class TorreDeHanoi {
	public static void main(String[] args) {
        int discos = 3;
        hanoi(discos, 'A','B','C');
    }

    private static void hanoi(int discos, char origem , char auxiliar, char destino) {
        if (discos > 0) {
            hanoi(discos-1, origem, destino, auxiliar);
            System.out.printf("Mover de %s para %s\n", origem, destino);
            hanoi(discos-1, auxiliar, origem, destino);

        }
    }
}
