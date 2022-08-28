package TerceiraQuestao;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Terceira {
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();
        List<Integer> cpf = new ArrayList<>();
        List<Double> salario = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int repeat = 5;
        
        for (int i = 0; i < repeat; i++) {
            System.out.printf("[DADOS DOS FUNCIONÁRIOS #%d]\n", i+1);
            
            System.out.print("Nome: ");
            nome.add(leitor.nextLine());
            
            System.out.print("Cpf: ");
            cpf.add((int) Math.floor(Math.random() * 999999999));
            System.out.println(cpf.get(i));
            
            System.out.print("Salário: ");
            salario.add(Math.floor(Math.random() * 9999));
            System.out.println((salario.get(i)));
        }
        
        System.out.print("[DEMITIR EMPREGADO]\ncpf: ");
        int localcpf = leitor.nextInt();
        int i = 1;
        
        while (localcpf != cpf.get(i)) {
            i++;
            if (localcpf == cpf.get(i)) {
                cpf.remove(i);
                nome.remove(i);
                salario.remove(i);
                break; 
            }     
        }

        System.out.println("[DADOS ATUALIZADOS]\n");
        for (int j = 0; j < 4; j++) {
            System.out.printf("[EMPREGADO #%d]\n", j+1);
            System.out.printf("Nome: %s\n", nome.get(j));
            System.out.printf("cpf: %d\n", cpf.get(j));
            System.out.printf("Salario: %.2f\n", salario.get(j));
        }
        leitor.close();
    }
}
