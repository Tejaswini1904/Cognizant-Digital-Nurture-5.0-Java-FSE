public class DocumentFactory {

    public Document createDocument(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("WORD")) {
            return new WordDocument();
        }

        if (type.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        }

        if (type.equalsIgnoreCase("EXCEL")) {
            return new ExcelDocument();
        }

        return null;
    }
}
