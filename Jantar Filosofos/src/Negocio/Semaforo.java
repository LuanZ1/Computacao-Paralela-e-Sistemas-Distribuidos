package Negocio;

public class Semaforo {
	private int contador;

    // M�todo construtor da classe que n�o recebe nenhum valor
    public Semaforo ()
    {
        this.contador = 0;
    }

    // M�todo construtor da classe que recebe um valor para setar no
    // contador
    public Semaforo (int valor)
    {
        this.contador = valor;
    }

    // M�todo de sincroniza��o da classe onde ser� decrescido o contador
    public synchronized void decrementar ()
    {

        // Enquanto o contador for igual a 0, ele aguarda e trata a exce��o
        while (this.contador == 0)
        {
            try
            {
                // Espera uma nova solicita��o
                wait();
            }
            catch (InterruptedException ex)
            {
                // Exibe uma mensagem de controle de erro
                System.out.println("ERROR>" + ex.getMessage());
            }
        }

        // Caso tenha sa�do do while acima, ent�o decrementa o
        // contador da classe
        this.contador--;

    }

    // M�todo de sincroniza��o da classe onde ser� incrementado o contador
    public synchronized void incrementar ()
    {
        // Incrementa o contador da classe
        this.contador++;
        // Notifica que a solicita��o j� foi executada
        notify();
    }
}
