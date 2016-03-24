/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Sergio O Gomes
 */
//https://www.caelum.com.br/apostila-java-orientacao-objetos/programacao-concorrente-e-threads/#17-4-exercicios


// NUCLEOTIDEO


public class wThread implements Runnable{
    public int tamanhoHash;  
    public int t;
    public String arquivo;
    public int r;
    public int g;
    public String saida;
    public int modo;
    
    public wThread(String arquivo, int t, int r, int g, String saida, int modo){
        this.arquivo = arquivo;
        this.t = t;
        this.r = r;
        this.g = g;
        this.saida = saida;
        this.modo = modo;
    }

    @Override
    public void run() {
        // cria hash de tamanho t
        tamanhoHash = (int) Math.pow(modo, t);
        Lista Hash[] = new Lista[tamanhoHash];
        for(int ii=0; ii < tamanhoHash; ii++){
            Hash[ii] = new Lista();
        }
            
        // ler o arquivo e cria a hash
        // nomeArquivo, hash, tamanho janela, rep, gaps, tamanho hash, arquivo de saida, contador de arquivos(tamanho1...tamanho2...N)
        System.out.printf("\njanela: %d\n", t);
        Leitura ler = new Leitura( arquivo, Hash, t, r, g, tamanhoHash, saida, t );
        // contador dos arquivos..... A1, A2, A3.... An
        // eh criado um arquivo (A1...An) para cada tamanho de fragmento
        //contArq++;
    }
}
