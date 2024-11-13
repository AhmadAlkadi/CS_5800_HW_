
package Flyweight;

public class Driver {

    public static void main(String[] args) {
        Document doc = new Document();

        // Adding characters with different properties
        doc.addCharacter("Hello", "Arial", "Red", 12);
        doc.addCharacter("World", "Calibri", "Blue", 12);
        doc.addCharacter("C", "Verdana", "Black", 14);
        doc.addCharacter("S", "Verdana", "Black", 16);
        doc.addCharacter("5800", "Arial", "Red", 12);
        
        System.out.println(doc.toString());
        // Save the document to a file
        doc.saveToFile("HelloWorldCS5800.txt");

        // Clear and reload the document to test loading
        System.out.println("Document before loading from file:");
        System.out.println(doc);

        System.out.println("\nLoading document from file...");
        doc.loadFromFile("HelloWorldCS5800.txt");

        System.out.println("Document after loading from file:");
        System.out.println(doc);
    }
}
