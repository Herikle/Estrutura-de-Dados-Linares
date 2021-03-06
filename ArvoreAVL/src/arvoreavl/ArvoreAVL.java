//Main/Classe de teste

package arvoreavl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ArvoreAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Arvore_AVL arvore = new Arvore_AVL();   
        int choose,chave;
        Object objeto;
        
        //for(int x = 1;x<=20;x++)
           // arvore.insere(x, x);
        
        arvore.insere(30,30);
        arvore.insere(13,13);
        arvore.insere(53,53);
        arvore.insere(8,8);
        arvore.insere(23,23);
        arvore.insere(43,43);
        arvore.insere(83,83);
        arvore.insere(63,63);
        arvore.insere(93,93);
        arvore.insere(96,96);
        System.out.println("1 - Inserir\n2 - Remover\n3 - Pesquisar\n4 - Imprimir\n5 - Ver altura de um nó\n6 - Profundidade da arvore\n7 - Imprimir Arvore\n");
        choose = in.nextInt();    
        while(choose!=0)
        {
            switch (choose) {
                case 1:
                    System.out.println("Chave: ");
                    chave = in.nextInt();
                    System.out.println("Item: ");
                    objeto = br.readLine();
                    arvore.insere(chave, objeto);
                    break;
                case 2:
                    System.out.println("Chave: ");
                    chave = in.nextInt();
                    arvore.retira(chave);
                    break;
                case 3:
                    System.out.println("Chave: ");
                    chave = in.nextInt();
                    Object x = arvore.pesquisa(chave);
                    if (x==null)
                    {
                        System.out.println("Chave não encontrada");
                    }else
                    {
                        System.out.println(x);
                    }
                    
                    break;
                case 4:
                    arvore.imprime();
                    break;
                case 5:
                    System.out.println("Chave: ");
                    chave = in.nextInt();
                    System.out.println(arvore.AlturaNo(chave));
                    break;
                case 6:
                    System.out.println(arvore.ProfundidadeTree());
                    break;
                case 7:
                    arvore.ImprimeArvore();
                default:
                    break;
            }
            System.out.println("1 - Inserir\n2 - Remover\n3 - Pesquisar\n4 - Imprimir\n5 - Ver altura de um nó\n6 - Profundidade da arvore\n7 - Imprimir Arvore\n");
            choose = in.nextInt(); 
        }
        
        
    }
    
}
