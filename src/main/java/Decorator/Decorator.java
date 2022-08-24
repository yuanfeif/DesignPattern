package Decorator;

public class Decorator extends Component {

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
