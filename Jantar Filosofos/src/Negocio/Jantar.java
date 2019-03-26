package Negocio;

public class Jantar {
	   // Cria��o dos sem�foros da aplica��o

    // O sem�foro mutex que recebe o valor incial 1 para o contador
    // e � o sem�foro principal da nossa aplica��o
    public static Semaforo mutex = new Semaforo(1);

    // O vetor sem�foros s�o normais e existe um sem�foro para cada fil�sofo
    // que ser� criado, esses semaf�ros n�o recebem valores de inicializa��o
    // portanto iniciando o contador em 0
    public static Semaforo semaforos[] = new Semaforo[5];

    // Define um vetor para o estado de cada um dos fil�sofos presentes
    // na aplica��o
    public static int estado[] = new int[5];

    // Cria 5 fil�sofos em um vetor para a aplica��o
    static Filosofo filosofo[] = new Filosofo[5];

    // M�todo construtor da Jantar da aplica��o
    public Jantar ()
    {
    	// Inicializa todos estados para zero
        for (int i = 0; i < estado.length; i++)
        {
            estado[i] = 0;
        }
        // Inicializa todos fil�sofos
        filosofo[0] = new Filosofo("Talles", 0);
        filosofo[1] = new Filosofo("Fred", 1);
        filosofo[2] = new Filosofo("Luan", 2);
        filosofo[3] = new Filosofo("Ilo", 3);
        filosofo[4] = new Filosofo("Krupp", 4);

        // Inicializa todos sem�foros
        semaforos[0] = new Semaforo(0);
        semaforos[1] = new Semaforo(0);
        semaforos[2] = new Semaforo(0);
        semaforos[3] = new Semaforo(0);
        semaforos[4] = new Semaforo(0);

        // Inicia a execu��o de todos fil�sofos
        filosofo[0].start();
        filosofo[1].start();
        filosofo[2].start();
        filosofo[3].start();
        filosofo[4].start();
    }
  
   

}
