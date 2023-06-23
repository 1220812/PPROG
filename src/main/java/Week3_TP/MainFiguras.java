package Week3_TP;

public class MainFiguras {

    public static void main(String[] args) {

        System.out.println("\n### Figuras Construídas ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);

        Retangulo r1 = new Retangulo();
        System.out.println(r1);

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);

        System.out.println("\n### Variável do Tipo Object ###");
        Object obj;
        obj = c1;
        System.out.println(obj.toString());

        obj = r1;
        System.out.println(obj.toString());

        // b) Verifique que é possível adicionar uma instância do tipo String ao contentor figuras
        String teste = "Teste b)";

        // Armazenamento de Objetos num Contentor do Tipo Array
        Object[] figuras = new Object[10];

        figuras[0] = c1;
        figuras[1] = c2;
        figuras[2] = r1;
        figuras[3] = r2;
        figuras[4] = teste; // é possível adicionar uma instância do tipo String ao contentor de figuras

        System.out.println("\n### Listagem de Figuras Armazenadas no Contentor ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                System.out.println(figuras[i]);
            }
        }
        // e) Programe as seguintes listagens separadas de:
              // i. Instâncias retângulo;

        //Armazenamento das instâncias de retângulo num contentor
        Retangulo[] retangulos = new Retangulo[10];
        retangulos[0] = r1;
        retangulos[1] = r2;
        System.out.println("\n### Listagem das instâncias retângulo");
        for (int i = 0; i < retangulos.length; i++) {
            if(retangulos[i] != null){
                System.out.println(retangulos[i]);
            }
        }
              // ii. Instâncias círculo.

        //Armazenamento das instâncias de círculo num contentor
        Circulo[] circulos = new Circulo[10];
        circulos[0] = c1;
        circulos[1] = c2;
        System.out.println("\n### Listagem das instâncias círculo");
        for (int i = 0; i < circulos.length; i++) {
            if(circulos[i] != null){
                System.out.println(circulos[i]);
            }
        }
    }
}
