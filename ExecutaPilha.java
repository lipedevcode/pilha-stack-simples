package Pilha;

import java.util.Scanner;

public class ExecutaPilha {
    public static void main(String[] args) {
        pilha P = new pilha();
        Scanner sc = new Scanner(System.in);
        int op =-1;
        while(op!=6) {
            System.out.print("1-Inserir\n2-Remover topo\n3-Busca\n4-Mostrar tamanho\n5-Listar\n6-Sair\n");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    P.push(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Nome removido: " + P.pop());
                    break;
                case 3:
                    System.out.println(P.search(sc.nextLine()));
                    break;
                case 4:
                    System.out.println(P.size());
                    break;
                case 5:
                    System.out.println(P.toStr());
                    break;
            }
        }
        sc.close();
    }
}
