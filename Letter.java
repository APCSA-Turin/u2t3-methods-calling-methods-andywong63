public class Letter {
    // instance variables
    String authorName;

    public Letter(String authorName) {
        this.authorName = authorName;
    }
    
    public void writeLetter(String name) {
        greeting(name);
        specialMessage();
        closing();
        signLetter();
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
    }

    public void signLetter() {
        System.out.println("From, " + authorName);
    }
}