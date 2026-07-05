public class Main {

    public static void main(String[] args) {

        DocumentFactory factory = new DocumentFactory();

        Document doc1 = factory.createDocument("WORD");
        doc1.open();

        Document doc2 = factory.createDocument("PDF");
        doc2.open();

        Document doc3 = factory.createDocument("EXCEL");
        doc3.open();
    }
}
