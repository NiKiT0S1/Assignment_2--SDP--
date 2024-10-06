// Creational Design Pattern -- ABSTRACT FACTORY

/*
Interface "Button"
defines "display" method
to be implemented by all types
of buttons and checkboxes
 */
interface Button {
    void display();
}

/*
Interface "Checkbox"
defines "display" method
to be implemented by all types
of buttons and checkboxes
 */
interface Checkbox {
    void display();
}

/*
Class "LightButton"
implement "Button" interface
and provide specific implementation
of "display" method
 */
class LightButton implements Button {
    @Override
    public void display() {
        System.out.println("Light Button");
    }
}

/*
Class "DarkButton"
implement "Button" interface
and provide specific implementation
of "display" method
 */
class DarkButton implements Button {
    @Override
    public void display() {
        System.out.println("Dark Button");
    }
}


/*
Class "LightCheckbox"
implement "Checkbox" interface
and provide specific implementation
of "display" method
 */
class LightCheckbox implements Checkbox {
    @Override
    public void display() {
        System.out.println("Light Checkbox");
    }
}

/*
Class "DarkCheckbox"
implement "Checkbox" interface
and provide specific implementation
of "display" method
 */
class DarkCheckbox implements Checkbox {
    @Override
    public void display() {
        System.out.println("Dark Checkbox");
    }
}


/*
Interface "ThemeFactory"
defines "createButton" and "createCheckbox" methods
to be implemented by all theme factories
 */
interface ThemeFactory {
    Button createButton();
    Checkbox createCheckbox();
}

/*
Class "LightTheme"
implement "ThemeFactory" interface
and create specific components
 */
class LightTheme implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}

/*
Class "DarkTheme"
implement "ThemeFactory" interface
and create specific components
 */
class DarkTheme implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

// TEST
public class Task_2 {
    public static void main(String[] args) {
        ThemeFactory lightTheme = new LightTheme();
        Button lightButton = lightTheme.createButton();
        Checkbox lightCheckbox = lightTheme.createCheckbox();
        lightButton.display();
        lightCheckbox.display();

        ThemeFactory darkTheme = new DarkTheme();
        Button darkButton = darkTheme.createButton();
        Checkbox darkCheckbox = darkTheme.createCheckbox();
        darkButton.display();
        darkCheckbox.display();
    }
}
