package es.upm.miw.iwvg.klondike;

public class MenuView {

    private MenuController menuController;

    public MenuView(MenuController menuController) {
        this.menuController = menuController;
    }

    public void showStatus() {
        IO io = new IO();
        io.writeln("===========================");
        io.write("Baraja:");
        io.writeln(Klondike.getDeck().toString());
        io.write("Descarte:");
        io.writeln(Klondike.getDiscard().toString());
        io.write("Palo oros:");
        io.writeln(Klondike.getFoundation(1).toString());
        io.write("Palo copas:");
        io.writeln(Klondike.getFoundation(2).toString());
        io.write("Palo espadas:");
        io.writeln(Klondike.getFoundation(3).toString());
        io.write("Palo bastos:");
        io.writeln(Klondike.getFoundation(4).toString());
        io.write("Escalera 1:");
        io.writeln(Klondike.getPile(1).toString());
        io.write("Escalera 2:");
        io.writeln(Klondike.getPile(2).toString());
        io.write("Escalera 3:");
        io.writeln(Klondike.getPile(3).toString());
        io.write("Escalera 4:");
        io.writeln(Klondike.getPile(4).toString());
        io.write("Escalera 5:");
        io.writeln(Klondike.getPile(5).toString());
        io.write("Escalera 6:");
        io.writeln(Klondike.getPile(6).toString());
        io.write("Escalera 7:");
        io.writeln(Klondike.getPile(7).toString());
        io.writeln("===========================");
    }

    public void showMenu() {
        IO io = new IO();
        io.writeln("1. Mover de baraja a descarte");
        io.writeln("2. Mover de descarte a baraja");
        io.writeln("3. Mover de descarte a palo");
        io.writeln("4. Mover de descarte a escalera");
        io.writeln("5. Mover de escalera a palo");
        io.writeln("6. Mover de escalera a escalera");
        io.writeln("7. Mover de palo a escalera");
        io.writeln("8. Voltear en escalera");
        io.writeln("9. Salir");
    }

    public void render() {
        do {
            showStatus();
            showMenu();
            IO io = new IO();
            int numOption = io.readInt("Opción? [1-9]:");
            if (numOption > MenuController.getNumOptions()) {
                io.writeln("¡ERROR! Opción no válida");
            } else {
                menuController.control(numOption);
            }
        } while (!menuController.end());
    }

}
