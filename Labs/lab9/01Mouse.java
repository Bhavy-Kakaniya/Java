interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    public void mouseClicked();

    public void mousePressed();

    public void mouseReleased();

    public void mouseMoved();

    public void mouseDragged();
}

interface KeyListener extends EventListener {
    public void keyPressed();

    public void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {

    @Override
    public void performEvent() {
        System.out.println("Event performed");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key Released");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse Moved");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse Dragged");
    }
}

public class _01mouse {
    public static void main(String[] args) {
        EventDemo demo = new EventDemo();
        System.out.println("Mouse :-");
        demo.mouseClicked();
        demo.mouseDragged();
        demo.mouseMoved();
        demo.mousePressed();
        demo.mouseReleased();
        System.out.println("Key :-");
        demo.keyPressed();
        demo.keyReleased();
        System.out.println("Event :-");
        demo.performEvent();
    }
}
