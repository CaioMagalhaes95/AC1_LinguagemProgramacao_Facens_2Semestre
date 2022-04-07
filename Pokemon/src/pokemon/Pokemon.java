package pokemon;

public class Pokemon {

    public static void main(String[] args) {

        Carreagamento obj = new Carreagamento();
        obj.setVisible(true);

        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(30);
                obj.Barra.setValue(i);
            }
            obj.dispose();
            Opening start = new Opening();
            start.setVisible(true);

        } catch (Exception e) {
        }

    }

}
