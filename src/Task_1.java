// Creational Design Pattern -- FACTORY METHOD

/*
Interface "Document"
to defines "create" method
to be implemented by all document types
 */
interface Document {
    void create();
}

/*
Class "PDFDocument"
implement "Document" interface
and provide specific implementations
of "create" method
 */
class PDFDocument implements Document {
    @Override
    public void create() {
        System.out.println("PDF - document created");
    }
}

/*
Class "WordDocument"
implement "Document" interface
and provide specific implementations
of "create" method
 */
class WordDocument implements Document {
    @Override
    public void create() {
        System.out.println("Word document created");
    }
}



/*
Interface "DocumentFactory"
defines "createDocument" method
to be implemented by all document factories
 */
interface DocumentFactory {
    Document createDocument();
}

/*
Class "PDFDocumentFactory"
implement "DocumentFactory" interface
and create specific document types
 */
class PDFDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}

/*
Class "WordDocumentFactory"
implement "DocumentFactory" interface
and create specific document types
 */
class WordDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

// TEST
public class Task_1 {
    public static void main(String[] args) {
        DocumentFactory pdf = new PDFDocumentFactory();
        Document pdfdoc = pdf.createDocument();
        pdfdoc.create();

        DocumentFactory word = new WordDocumentFactory();
        Document worddoc = word.createDocument();
        worddoc.create();
    }
}
