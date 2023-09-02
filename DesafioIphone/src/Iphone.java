
public class Iphone implements Musical, Telefone, Internet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página...");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando...");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecione sua música...");
	}

}
