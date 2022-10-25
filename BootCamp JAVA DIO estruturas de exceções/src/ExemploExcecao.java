import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

	public static void main(String[] args) {
		Number valor;
		try {
			valor = NumberFormat.getInstance().parse("a1.75"); // checked
			System.out.println(valor);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		
		Number valor2 = Double.valueOf("ai,75");// unchecked
	}

}
