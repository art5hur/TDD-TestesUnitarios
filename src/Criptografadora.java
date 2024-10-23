//Classe que faz criptografia
public class Criptografadora {

	// Método que converte letra maiúscula em número
	public int criptografa(char letra) {
		if (letra == 'A') {
			return 19;
		} else if (letra == 'B') {
			return 11;
		} else if (letra == 'C') {
			return 71;
		}
		return 0;
	}

}
